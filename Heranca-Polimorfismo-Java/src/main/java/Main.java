package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;

public class Main {
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa();

        empresa1.adicionarFuncionario(new Desenvolvedor("Joao", 2, 2500, "Node.js"));
        empresa1.adicionarFuncionario(new Desenvolvedor("Pedro", 3, 3000, "Java"));
        empresa1.adicionarFuncionario(new Gerente("Arthur", 1, 6000, 10000.00));
        empresa1.adicionarFuncionario(new Gerente("Junior", 4, 8000, 12000.00));
        empresa1.adicionarFuncionario(new AnalistaQA("Vini", 5, 2000, 15));
        empresa1.adicionarFuncionario(new AnalistaQA("Henrique", 5, 1800, 5));

        System.out.println("LISTA DE FUNCIONÁRIO");
        empresa1.listaFuncionarios();

        System.out.println("\n" + "FOLHA DE PAGAMENTO");
        System.out.printf("Folha de pagamento total: R$ %.2f%n", empresa1.calcularFolhaDePagamentoTotal());

    }
}
