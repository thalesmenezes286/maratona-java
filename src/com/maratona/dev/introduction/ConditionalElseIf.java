package com.maratona.dev.introduction;

import java.util.Scanner;

public class ConditionalElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 9.0) {
            System.out.println("Classificação: A");
        } else if (nota >= 7.0) {
            System.out.println("Classificação: B");
        } else if (nota >= 5.0) {
            System.out.println("Classificação: C");
        } else if (nota >= 3.0) {
            System.out.println("Classificação: D");
        } else {
            System.out.println("Classificação: F");
        }

        scanner.close();
    }
}
