package com.cormacx;

import java.util.ArrayList;
import java.util.List;

public class ParOuImparBot {

    public String ehParOuImpar( int numero ) {
        if ( numero % 2 == 0 ) {
            return "Par";
        }
        return "Ímpar";
    }

    public List<String> saoParesOuImpares(String[] numeros ) {
        ArrayList<String> resultado = new ArrayList<>();
        for (String numero : numeros) {
            Integer numeroN = Integer.parseInt(numero);
            resultado.add(ehParOuImpar(numeroN));
        }
        return resultado;
    }

}
