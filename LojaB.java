package com.company;

public class LojaB extends LojaChain {
    public LojaB(){
        super(IDLojas.LojaB);
    }

    protected void apontaLoja(){
        System.out.println("Você comprou uma bicicleta na loja B");
    }
}
