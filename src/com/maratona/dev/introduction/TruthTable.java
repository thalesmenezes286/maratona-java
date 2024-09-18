package com.maratona.dev.introduction;

public class TruthTable {
    public static void main(String[] args) {

        System.out.println("A\tB\tA AND B\tA OR B\tNOT A\tNOT B");
        System.out.println("-----------------------------------------");

        boolean[] valores = {true, false};

        for (boolean A : valores) {
            for (boolean B : valores) {
                boolean and = A && B;
                boolean or = A || B;
                boolean notA = !A;
                boolean notB = !B;

                System.out.printf("%b\t%b\t%b\t\t%b\t\t%b\t%b%n", A, B, and, or, notA, notB);
            }
        }
    }
}
