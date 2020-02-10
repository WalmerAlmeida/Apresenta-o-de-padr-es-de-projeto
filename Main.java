package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //problema
/*
        System.out.println("Digite o valor correspondente a loja que procura");
        Scanner input = new Scanner(System.in);
        int loja = input.nextInt();

        switch (loja){
            case 1: System.out.println("Você comprou uma bicicleta na loja A"); break;
            case 2: System.out.println("Você comprou uma bicicleta na loja B"); break;
            case 3: System.out.println("Você comprou uma bicicleta na loja C"); break;
        }
*/
        //solução

        System.out.println("Digite o valor correspondente a loja que procura");
        Scanner input = new Scanner(System.in);
        int loja = input.nextInt();

        LojaChain lojas = new LojaB();// lojaB -> lojaC -> lojaA
        lojas.setNext(new LojaC());
        lojas.setNext(new LojaA());

        IDLojas tipo = IDLojas.values()[loja-1];
        lojas.apontarLoja(tipo);

    }
}
