package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private double numeroDaComanda;
    private double numeroDaMesa;

    public Pedido() {

    }

    public Pedido(double numeroDaComanda, double numeroDaMesa) {
        this.numeroDaComanda = numeroDaComanda;
        this.numeroDaMesa = numeroDaMesa;
    }

    public double getNumeroDaComanda() {
        return numeroDaComanda;
    }

    public void setNumeroDaComanda(double numeroDaComanda) {
        this.numeroDaComanda = numeroDaComanda;
    }

    public double getNumeroDaMesa() {
        return numeroDaMesa;
    }

    public void setNumeroDaMesa(double numeroDaMesa) {
        this.numeroDaMesa = numeroDaMesa;
    }

    public void fazerPedido(){
        List<Produto> produtos = new ArrayList<>();
        produtos.add(novoProduto);
    }


}

    @Override
    public String toString() {
        @Override
        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append("\n--PEDIDO --");
            retorno.append("\nNúmero da Mesa" + numeroDaMesa);
            retorno.append("\nNúmero da Comanda" + numeroDaComanda);
            retorno.append("\nProdutos: " + produtos);
            retorno.append("\nValor: " + valor);
            return retorno.toString();
    }
}