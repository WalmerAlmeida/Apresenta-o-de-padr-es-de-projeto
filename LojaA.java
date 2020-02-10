package com.company;

public class LojaA extends LojaChain{
    public LojaA(){
        super(IDLojas.LojaA);
    }

    protected void apontaLoja(){
        System.out.println("Você comprou uma bicicleta na loja A");
    }
}
