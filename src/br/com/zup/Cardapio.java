package br.com.zup;

import java.util.ArrayList;
import java.util.List;

    //Atributos
public class Cardapio {
    public static List<Produto> produtos = new ArrayList<>();

    //Contrutor vazio
    public Cardapio() {

    }

    //Construtor
    public Cardapio(List<Produto> produtos) {
        this.produtos = produtos;
    }

    //Método adicionar produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    //Metodo exibir cardapio
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nossos produtos disponiveis para venda são: ");
        retorno.append(produtos);
        return retorno.toString();
    }


}
