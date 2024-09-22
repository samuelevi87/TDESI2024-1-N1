package main.java;

import main.java.atividade01.*;

public class Main {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();

        empresa1.adicionnarFuncionarios(new Desensolvedor("Pablo",2565,
                4000.0,"Java"));
        empresa1.adicionnarFuncionarios(new Desensolvedor("Rocky",2330,
                3500.0,"Python"));

        empresa1.adicionnarFuncionarios(new Gerente("Jhon",3565,
                10000.0,5000.0));
        empresa1.adicionnarFuncionarios(new Gerente("Carla",2707,
                12000.0,6000.0));

        empresa1.adicionnarFuncionarios(new AnalistaQA("Silva",2345,
                15000.0,3));
        empresa1.adicionnarFuncionarios(new AnalistaQA("Claudyson",2560,
                18000.0,5));
        System.out.println(" ****lista de Funcionarios*** ");
empresa1.listaDeFuncionario();
Double pagamentoTotal = empresa1.folhaDePagamentoTotal();
        System.out.println(" folha de pagamento total : "+ String.format("2%f",pagamentoTotal));
    }
}