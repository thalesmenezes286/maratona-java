package com.maratona.dev.introduction;

public class TernaryOperators {
    public static void main(String[] args) {

        // Doar se salary > 5.000
        double salary = 6000;
        String messageDonate = "Eu vou doar para o DevDojo.";
        String messageNotDonate = "Ainda eu não tenho condições de doar.";

        //(condicao) ? verdadeiro : falso
        String result = salary > 5000 ? messageDonate : messageNotDonate;

        System.out.println(result);
    }
}
