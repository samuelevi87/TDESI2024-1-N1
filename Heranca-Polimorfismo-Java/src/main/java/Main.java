package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(new Desenvolvedor("Jonathan Sost", 2837, 10000.00, "Java"));
        empresa.adicionarFuncionario(new Desenvolvedor("Roberto", 6473, 15000.00, "Python"));
        empresa.adicionarFuncionario(new Gerente("Jubiscreudo", 9283, 6000.00, 10000.00));
        empresa.adicionarFuncionario(new Gerente("Josevaldo", 1826, 7000.00, 10000.00));
        empresa.adicionarFuncionario(new AnalistaQA("Joseval", 3746, 12000.00, 15));
        empresa.adicionarFuncionario(new AnalistaQA("Cleverson", 2973, 15000.00, 35));

        System.out.println("***** LISTA DE FUNCIONÁRIOS *****");
        empresa.listarFuncionarios();

        System.out.println("===== Folha de pagamento =====");
        System.out.println("R$ " + String.format("%.2f", empresa.calcularFolhaDePagamentoTotalComStream()));
    }
}
