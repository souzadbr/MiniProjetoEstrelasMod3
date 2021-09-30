package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {

    public static List<Produto>cardapio = new ArrayList<>();

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
            System.out.println("Produto(s) cadastrado com sucesso!");
        }else{
            menuPrincipal();
        }
    }

    //Método de adicionar produtos no cardápio
    public static void cadastrarprodutos() {
        int qtdeProdutos = entradaTeclado("Digite a quantidade de produtos que deseja cadastrar:").nextInt();
        for (int i = 0; i < qtdeProdutos ; i++) {
            String nome = entradaTeclado("Digite o nome do produto: ").nextLine();
            double valor = entradaTeclado("Digite o preço do produto: ").nextDouble();
            Produto produtos = new Produto(nome, valor);
            //cardapio.adicionarProduto(produtos);
            cardapio.add(produtos);


        }
    }

    //Método do Cliente
    public static void menuCliente() {
        System.out.println("1 - Exibir cardápio");
        System.out.println("2 - Realizar Pedido");
        System.out.println("3 - Voltar ao Menu Principal");
        int opcaoDigitada = entradaTeclado("Digite a opção desejada:").nextInt();
        if (opcaoDigitada == 1){
            System.out.println(cardapio);
        }else if (opcaoDigitada == 2){
            Pedido pedido = new Pedido();
        }else{
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


