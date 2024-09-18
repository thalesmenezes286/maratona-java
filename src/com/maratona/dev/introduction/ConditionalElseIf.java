package com.maratona.dev.introduction;

import java.util.Scanner;

public class ConditionalElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua grade: ");
        double grade = scanner.nextDouble();

        if (grade >= 9.0) {
            System.out.println("Classificação: A");
        } else if (grade >= 7.0) {
            System.out.println("Classificação: B");
        } else if (grade >= 5.0) {
            System.out.println("Classificação: C");
        } else if (grade >= 3.0) {
            System.out.println("Classificação: D");
        } else {
            System.out.println("Classificação: F");
        }

        scanner.close();
    }
}
