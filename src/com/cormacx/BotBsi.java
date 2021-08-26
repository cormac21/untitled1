package com.cormacx;

public class BotBsi {

    public String processaBsi( String texto ) {

        if (texto.isEmpty())
            return null;
        String msg = texto.toUpperCase();

        if (msg.contains("PROF")) {
            if (msg.contains("FUJIOKA")) {

            }
            if (msg.contains("RAFAELLA")) {

            }
        }
        if (msg.contains("DISCIPLINA")) {
            if (msg.contains("PENSAMENTO MATEMATICO")) {

            }
            if (msg.contains("PROJETO FINAL")) {

            }
        }
        return null;
    }

}
