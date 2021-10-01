package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    //Atributos
    private int numeroDaComanda;
    private int numeroDaMesa;
    private List<Produto> produtos = new ArrayList<>();
    private List<Produto> selecionados = new ArrayList<>();

    //Métodos Construtores
    public Pedido() {

    }

    public Pedido(int numeroDaComanda, int numeroDaMesa) {
        this.numeroDaComanda = numeroDaComanda;
        this.numeroDaMesa = numeroDaMesa;
           }

    //Getters e Setters
    public double getNumeroDaComanda() {
        return numeroDaComanda;
    }

    public void setNumeroDaComanda(int numeroDaComanda) {
        this.numeroDaComanda = numeroDaComanda;
    }

    public double getNumeroDaMesa() {
        return numeroDaMesa;
    }

    public void setNumeroDaMesa(int numeroDaMesa) {
        this.numeroDaMesa = numeroDaMesa;
    }


    //Método Fazer Pedido
    public <Selecionado> void fazerPedido(Produto novoProduto) {

        selecionados.add(novoProduto);
    }

    //Método Exibir Pedido
    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n--PEDIDO --");
        retorno.append("\nNúmero da Mesa\t" + numeroDaMesa);
        retorno.append("\nNúmero da Comanda\t" + numeroDaComanda);
        retorno.append("\nProdutos do Pedido:\t " + selecionados );

        return retorno.toString();
    }


}




