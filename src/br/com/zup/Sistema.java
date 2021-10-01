package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static List<Produto> cardapio = new ArrayList<>();

    //Método de entrada de dados
    private static Scanner entradaTeclado(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //Método do Menu Principal
    public static void menuPrincipal() {
        System.out.println("\n");
        System.out.println("---Sistema de Gestão de Pedidos---");
        System.out.println("--Bem-vindo ao IPedidos--");
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Sou ADMINISTRADOR");
        System.out.println("2 - Sou Cliente");
        System.out.println("3 - SAIR");
    }

    //Método do Administrador
    public static void menuAdministrador() {

        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Voltar ao Menu Principal");
        int opcaoSelecionada = entradaTeclado("Selecione sua opção: ").nextInt();
        if (opcaoSelecionada == 1) {
            cadastrarprodutos();
            System.out.println("Produto(s) cadastrado com sucesso!");
        } else {
            menuPrincipal();
        }
    }

    //Método de adicionar produtos no cardápio
    public static void cadastrarprodutos() {
        int qtdeProdutos = entradaTeclado("Digite a quantidade de produtos que deseja cadastrar(máximo de 10 produtos):").nextInt();
        for (int i = 0; i < qtdeProdutos; i++) {
            String nome = entradaTeclado("Digite o nome do produto: ").nextLine();
            double valor = entradaTeclado("Digite o preço do produto: ").nextDouble();
            Produto produtos = new Produto(nome, valor);
            //cardapio.adicionarProduto(produtos);
            cardapio.add(produtos);


        }
    }

    //Método menu do Cliente
    public static void menuCliente() {
        System.out.println("1 - Exibir cardápio");
        System.out.println("2 - Realizar Pedido");
        System.out.println("3 - Menu Cliente");
        System.out.println("4 - Menu Principal");
        int opcaoDigitada = entradaTeclado("Digite a opção desejada:").nextInt();
        if (opcaoDigitada == 1) {
            System.out.println(cardapio);
            menuCliente();
        } else if (opcaoDigitada == 2) {
            int numeroDaComanda = entradaTeclado("Digite o número da comanda: ").nextInt();
            int numeroDaMesa = entradaTeclado("Digite o número da mesa: ").nextInt();
            Pedido pedido = new Pedido(numeroDaComanda, numeroDaMesa);
            List<Produto> escolhido = new ArrayList<>();
            int i = 1;
            for (i = 0; i < cardapio.size(); i++) {
                int indice = i + 1;
                System.out.println("Digite " + indice + " para" + cardapio.get(i));
            }

            int produtoEscolhido = entradaTeclado("Digite o número do produto desejado: ").nextInt();
            boolean loop = true;
            int qtde = 0;
            while (loop) {

                switch (produtoEscolhido) {
                    case 1:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 2:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 3:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 4:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 5:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 6:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 7:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 8:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 9:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                    case 10:
                        escolhido.add(cardapio.get(i - 1));
                        qtde = entradaTeclado("Quantas unidades desse produto?").nextInt();
                        break;
                }
                System.out.println("Deseja incluir mais um produto?");
                int escolha = entradaTeclado("1 - SIM  ||  2 - NÃO").nextInt();
                if (escolha == 1) {
                    produtoEscolhido = entradaTeclado("Digite o número do produto desejado: ").nextInt();
                    loop = true;
                } else {
                    loop = false;
                }

            }
            System.out.println("Seu pedido: ");
            System.out.println("Número da Comanda: " + pedido.getNumeroDaComanda());
            System.out.println("Número da Mesa: " + pedido.getNumeroDaMesa());
            System.out.println("Produtos: " + escolhido + "Quantidades " + qtde);
            System.out.println("Pedido realizado com Sucesso!");

           } else if (opcaoDigitada == 3) {
            menuCliente();
        } else {
            menuPrincipal();
        }

    }


    //Menu Validação do Administrador
    public static void validaAdministrador() {
        String login = "Márcio";
        String login1 = "Bárbara";
        String login2 = "Débora";
        String senha = "Estrelas";
        String loginDigitado = entradaTeclado("Digite seu login: ").nextLine();
        if (loginDigitado.equals(login) | loginDigitado.equals(login2) | loginDigitado.equals(login1)) {
            String senhaDigitada = entradaTeclado("Digite sua senha: ").nextLine();
            if (senhaDigitada.equals(senha)) {
                menuAdministrador();
            } else {
                System.out.println("Senha inválida!");
            }
        } else {
            System.out.println("Usuário não cadastrado");
        }

    }


    //Método de execução do Sistema
    public static void executa() {
        boolean menu = true;


        while (menu) {
            menuPrincipal();
            int opcaoDigitada = entradaTeclado("Selecione uma opção: ").nextInt();
            if (opcaoDigitada == 1) {
                validaAdministrador();

            } else if (opcaoDigitada == 2) {
                menuCliente();
            } else {
                System.out.println("Obrigado pela presença. Volte Sempre!");
                menu = false;
            }
        }

    }
}


