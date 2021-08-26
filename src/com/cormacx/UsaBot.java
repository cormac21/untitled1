package com.cormacx;

import java.util.Scanner;

public class UsaBot {

    public static void main(String[] args) {

        String opcao = "s";
        Scanner leitor = new Scanner(System.in);

        EmployeeRaiseBot bot = new EmployeeRaiseBot();

        while("s".equalsIgnoreCase(opcao)) {
            System.out.println("Informe o salario:");
            String salario = leitor.nextLine();

            System.out.println("Informe o aumento em porcentagem (%):");
            String aumento = leitor.nextLine();
            String resultado = bot.processaSalario(salario, aumento);

            System.out.println(resultado);
            System.out.println("Deseja calcular novamente? S - SIM / N - NAO");
            opcao = leitor.nextLine();
        }
    }

}
