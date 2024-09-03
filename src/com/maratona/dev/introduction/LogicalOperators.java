package com.maratona.dev.introduction;

public class LogicalOperators {
    public static void main(String[] args) {

        int age = 22;
        boolean hasDiploma = false;
        boolean hasExperience = true;

        //And && Or ||
        // Usando operadores lógicos para determinar a mensagem a ser exibida
        String message = (age >= 18 && hasDiploma) ? "Pode se inscrever no curso com diploma." :
                (age >= 18 && !hasDiploma && hasExperience) ? "Pode se inscrever no curso sem diploma, mas com experiência." :
                        (age < 18 && !hasDiploma) ? "Você precisa ter pelo menos 18 anos e um diploma para se inscrever." :
                                "Verifique os requisitos do curso.";

        // Exibindo a mensagem
        System.out.println(message);
    }
}
