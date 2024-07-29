package com.maratona.dev.introduction;

public class RelationalOperators {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 20;
        int c = 10;

        // Verificando se a é equal a b
        boolean equal = (a == b);
        System.out.println("a é equal a b? " + equal);

        // Verificando se a é different de b
        boolean different = (a != b);
        System.out.println("a é different de b? " + different);

        // Verificando se a é maior que b
        boolean major = (a > b);
        System.out.println("a é maior que b? " + major);

        // Verificando se a é menor que b
        boolean less = (a < b);
        System.out.println("a é menor que b? " + less);

        // Verificando se a é maior ou equal a c
        boolean maiorOuIgual = (a >= c);
        System.out.println("a é maior ou equal a c? " + maiorOuIgual);

        // Verificando se b é menor ou equal a c
        boolean menorOuIgual = (b <= c);
        System.out.println("b é menor ou equal a c? " + menorOuIgual);
    }
}
