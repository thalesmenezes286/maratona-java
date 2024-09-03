package com.maratona.dev.introduction;

import java.util.Scanner;

public class ConditionalIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;

        System.out.println("Entre com o primeiro número:");
        number1 = input.nextInt();

        System.out.println("Entre com o segundo número:");
        number2 = input.nextInt();

        System.out.println("");

        if(number1 == number2){
            System.out.printf("%d == %d%n", number1,number2);
        }

        if(number1 != number2){
            System.out.printf("%d != %d%n", number1,number2);
        }

        if(number1 < number2){
            System.out.printf("%d < %d%n", number1,number2);
        }

        if(number1 > number2){
            System.out.printf("%d > %d%n", number1,number2);
        }

        if(number1 <= number2){
            System.out.printf("%d <= %d%n", number1,number2);
        }

        if(number1 >= number2){
            System.out.printf("%d >= %d%n", number1,number2);
        }
    }
}
