package com.company;

public class LojaC extends LojaChain {
    public LojaC(){
        super(IDLojas.LojaC);
    }

    protected void apontaLoja(){
        System.out.println("Você comprou uma bicicleta na loja C");
    }
}
