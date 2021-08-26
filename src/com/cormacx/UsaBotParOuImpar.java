package com.cormacx;

import java.util.Scanner;

public class UsaBotParOuImpar {

    public static void main(String[] args) {

        String opcao = "s";
        Scanner leitor = new Scanner(System.in);

        ParOuImparBot bot = new ParOuImparBot();


        while("s".equalsIgnoreCase(opcao)) {
            System.out.println("Informe 10 numeros inteiros:");
            String numeros = leitor.nextLine();

            String[] todosNumeros = numeros.split(";");

            System.out.println(bot.saoParesOuImpares(todosNumeros));
            System.out.println("Deseja calcular novamente? S - SIM / N - NAO");
            opcao = leitor.nextLine();
        }
    }

}
