package com.maratona.dev.introduction;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;  // Atribuição simples
        int b = 5;

        System.out.println("a = 10");
        System.out.println("b = 5");

        // Operador de atribuição de adição
        a += b;  // Equivalente a: a = a + b;
        System.out.println("a += b: " + a); // Saída: 15

        // Operador de atribuição de subtração
        a -= b;  // Equivalente a: a = a - b;
        System.out.println("a -= b: " + a); // Saída: 10

        // Operador de atribuição de multiplicação
        a *= b;  // Equivalente a: a = a * b;
        System.out.println("a *= b: " + a); // Saída: 50

        // Operador de atribuição de divisão
        a /= b;  // Equivalente a: a = a / b;
        System.out.println("a /= b: " + a); // Saída: 10

        // Operador de atribuição de módulo
        a %= b;  // Equivalente a: a = a % b;
        System.out.println("a %= b: " + a); // Saída: 0

        // Operador de atribuição bit a bit (AND)
        a = 10;  // Resetando o valor de 'a'
        a &= b;  // Equivalente a: a = a & b;
        System.out.println("a &= b: " + a); // Saída: 0

        // Operador de atribuição bit a bit (OR)
        a = 10;  // Resetando o valor de 'a'
        a |= b;  // Equivalente a: a = a | b;
        System.out.println("a |= b: " + a); // Saída: 15

        // Operador de atribuição bit a bit (XOR)
        a = 10;  // Resetando o valor de 'a'
        a ^= b;  // Equivalente a: a = a ^ b;
        System.out.println("a ^= b: " + a); // Saída: 15
    }
}
