package br.com.zup;

public class Produto {

    //Atributos

    private String nome;
    private double valor;

    //Métodos construtores

    public Produto(){

    }
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    //Métodos Getters


    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
    //Método StringBuilder

        @Override
        public String toString() {
            StringBuilder retorno = new StringBuilder();
            retorno.append("\n Nome " + nome);
            retorno.append("\n Valor R$ " +valor);
            retorno.append("\n\n");
            return retorno.toString();

    }

}
