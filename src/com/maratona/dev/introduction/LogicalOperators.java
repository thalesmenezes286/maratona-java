package com.maratona.dev.introduction;

public class LogicalOperators {
    public static void main(String[] args) {
        // Definindo algumas variáveis booleanas
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Operador E lógico (&&)
        if (a && b) {
            System.out.println("a e b são ambos verdadeiros");
        } else {
            System.out.println("a e b não são ambos verdadeiros");
        }

        // Operador OU lógico (||)
        if (a || b) {
            System.out.println("Ou a ou b é verdadeiro");
        } else {
            System.out.println("Nem a nem b é verdadeiro");
        }

        // Operador NÃO lógico (!)
        if (!b) {
            System.out.println("b é falso");
        } else {
            System.out.println("b é verdadeiro");
        }

        // Combinando operadores lógicos
        if ((a && b) || c) {
            System.out.println("((a e b) ou c) é verdadeiro");
        } else {
            System.out.println("((a e b) ou c) não é verdadeiro");
        }
    }
}
