package com.maratona.dev.exercise;

public class AnnualSalaryPay {
    public static void main(String[] args) {
        double annualSalary = 70000;

        double firstTax = 9.70 / 100;
        double secondTax = 37.35 / 100;
        double thirdTax = 49.50 / 100;
        double valueTax;

        if (annualSalary <= 34712) {
            valueTax = annualSalary * firstTax;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            valueTax = annualSalary * secondTax;
        }else{
            valueTax = annualSalary * thirdTax;
        }

        System.out.println("Valor do salário anual: R$ "+valueTax);
    }
}
