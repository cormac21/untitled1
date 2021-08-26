package com.cormacx;

import java.util.Scanner;

public class UsaTabuadaBot {

    public static void main(String[] args) {

        String opcao = "s";
        Scanner leitor = new Scanner(System.in);

        TabuadaBot bot = new TabuadaBot();

        while("s".equalsIgnoreCase(opcao)) {
            System.out.println("Informe o numero que queres a tabuada");
            String numero = leitor.nextLine();
            Integer numeroN = Integer.parseInt(numero);

            String[] resultado = bot.processaTabuada(numeroN);
            for (int i = 0; i < resultado.length; i++) {
                System.out.println(resultado[i]);
            }

            System.out.println("Deseja calcular novamente? S - SIM / N - NAO");
            opcao = leitor.nextLine();
        }
    }

}
