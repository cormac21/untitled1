package com.cormacx;

public class TabuadaBot {

    public String[] processaTabuada( int numeroDaTabuada ) {
        String x1 = String.valueOf(numeroDaTabuada * 1);
        String x2 = String.valueOf(numeroDaTabuada * 2);
        String x3 = String.valueOf(numeroDaTabuada * 3);
        String x4 = String.valueOf(numeroDaTabuada * 4);
        String x5 = String.valueOf(numeroDaTabuada * 5);
        String x6 = String.valueOf(numeroDaTabuada * 6);
        String x7 = String.valueOf(numeroDaTabuada * 7);
        String x8 = String.valueOf(numeroDaTabuada * 8);
        String x9 = String.valueOf(numeroDaTabuada * 9);
        String x10 = String.valueOf(numeroDaTabuada * 10);
        String[] resultado = {x1, x2, x3, x4, x5, x6, x7, x8, x9, x10};

        return resultado;
    }

}
