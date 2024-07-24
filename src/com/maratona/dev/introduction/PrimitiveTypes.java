package com.maratona.dev.introduction;

public class PrimitiveTypes {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        // Tipos numéricos inteiros
        byte age = 30;          // Tipo byte para idade
        short numero = 1500;      // Tipo short para número pequeno
        int population = 1500000;  // Tipo int para população
        long balance = 1500000000L; // Tipo long para números grandes (usando sufixo L)

        // Tipos numéricos de ponto flutuante
        float height = 1.75f;     // Tipo float para altura (usando sufixo f)
        double weight = 68.5;       // Tipo double para peso

        // Tipo char para caracteres Unicode
        char initialCharacter = 'J';       // Tipo char para inicial de nome

        // Tipo boolean para valores lógicos
        boolean isStudent = true; // Tipo boolean para indicar se é estudante


        // Exibindo os valores
        System.out.println("Age: " + age);
        System.out.println("Number: " + numero);
        System.out.println("Population: " + population);
        System.out.println("Balance: " + balance);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Initial Character: " + initialCharacter);
        System.out.println("Are you a student? " + isStudent);
    }
}
