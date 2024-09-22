package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(new Desenvolvedor("Samuel Levi", 123456, 15000.0, "Java"));
        empresa.adicionarFuncionario(new Desenvolvedor("Jackson Callado", 123456, 20000.0, "C++"));
        empresa.adicionarFuncionario(new Gerente("Sanatiel", 789456, 6000.0, 10000.0));
        empresa.adicionarFuncionario(new Gerente("Jackson Stumpf", 789456, 7000.0, 10000.0));
        empresa.adicionarFuncionario(new AnalistaQA("Jonathan Sost", 756248, 12000.0, 15));
        empresa.adicionarFuncionario(new AnalistaQA("Tainá Estefani", 951424, 15000.0, 35));

        System.out.println("******* LISTA DE FUNCIONÁRIOS *******");
        empresa.listarFuncionarios();

        System.out.println("\n======= FOLHA DE PAGAMENTO =======");
        System.out.println("Folha de pagamento total: R$ " + String.format("%.2f", empresa.calcularFolhaDePagamentolTotal()));
    }
}
