package com.maratona.dev.introduction;

public class ConditionalSwitch {

    private enum DAY_OF_WEEK {SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO};

    public static void main(String[] args) {
        System.out.println(traditionalSwitch(DAY_OF_WEEK.DOMINGO));
        System.out.println(newSwitch(DAY_OF_WEEK.SEGUNDA));
    }

    public static String traditionalSwitch(DAY_OF_WEEK day){
        String result = null;

        switch (day){
            case SEGUNDA:
            case TERCA:
            case QUARTA:
            case QUINTA:
            case SEXTA:
                result = "Dia Útil";
                break;
            case SABADO:
            case DOMINGO:
                result = "Final de Semana";
                break;
            default: result = "Dia inválido!";
        }

        return result;
    }

    public static String newSwitch(DAY_OF_WEEK day){
        return switch (day) {
            case SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA -> "Dia Útil";
            case SABADO, DOMINGO -> "Final de Semana";
            default -> "Dia inválido!";
        };
    }
}
