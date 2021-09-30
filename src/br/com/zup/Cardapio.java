package br.com.zup;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Produto>produtos = new ArrayList<>();

    //Contrutor vazio
    public Cardapio() {

    }

    //Construtor
    public Cardapio(List<Produto> produtos) {
        this.produtos = produtos;
    }


}
