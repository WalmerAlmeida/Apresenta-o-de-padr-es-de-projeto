package com.company;

public abstract class LojaChain {
    protected LojaChain next;
    protected IDLojas identidadeDaLoja;

    public LojaChain(IDLojas id){
        this.next = null;
        this.identidadeDaLoja = id;
    }

    public void setNext(LojaChain tipo){
        if(next == null){
            next = tipo;
        }else{
            next.setNext(tipo);
        }
    }

    public void apontarLoja(IDLojas id){
        if(podeApontarLoja(id)){
            System.out.println(id.name()+"\n");
            apontaLoja();
        }else{
            if(next == null){
                System.out.println("Loja não cadastrada");
            }
            System.out.println("Loja acessada incorreta, pois a loja que procura é: "+id.name()+"/loja verificada: "+identidadeDaLoja.name()+"\n");
            next.apontarLoja(id);
        }
    }

    private boolean podeApontarLoja(IDLojas id){
        if(identidadeDaLoja == id){
            return true;
        }
        return false;
    }

    protected abstract void apontaLoja();
}
