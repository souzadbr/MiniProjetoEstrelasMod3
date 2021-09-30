package br.com.zup;

import java.util.Scanner;

public class Sistema {

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
        if (opcaoSelecionada == 1){
            cadastrarprodutos();
            System.out.println("Produto cadastrado com sucesso!");
        }else{
            menuPrincipal();
        }
    }

    //Método do Cliente
    public static void menuCliente() {
        System.out.println("Exibir cardápio");
        System.out.println("Realizar Pedido");
        System.out.println("Voltar ao Menu Principal");
    }

    //Método de adicionar produtos no cardápio
    public static void cadastrarprodutos() {
        String nome = entradaTeclado("Digite o nome do produto: ").nextLine();
        double valor = entradaTeclado("Digite o preço do produto: ").nextDouble();
        Produto produtos = new Produto(nome, valor);
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarProduto(produtos);
        System.out.println("Deseja cadastrar mais um produto?");
        System.out.println("1 - SIM");
        System.out.println("2 - Finalizar");
        int opcaoDigitada = entradaTeclado("Digite a opção desejada: ").nextInt();
        while ()
        if (opcaoDigitada == 1 ){
            String nome1 = entradaTeclado("Digite o nome do produto: ").nextLine();
            double valor1 = entradaTeclado("Digite o preço do produto: ").nextDouble();
            Produto produtos1 = new Produto(nome, valor);
            cardapio.adicionarProduto(produtos);
        }else{
            System.exit(0);
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
        Cardapio cardapio = new Cardapio();

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


