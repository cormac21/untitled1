package com.cormacx;

public class EmployeeRaiseBot {

    public String processaSalario(String salario, String aumento) {
        Integer salarioN = Integer.parseInt(salario);
        Float aumentoN = Float.parseFloat(aumento);
        Float resultado = salarioN * aumentoN / 100 ;
        Float salarioPosAumento = salarioN + resultado;
        return aumentoN + " ; " + salarioPosAumento;
    }

}
