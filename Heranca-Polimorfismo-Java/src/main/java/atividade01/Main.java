package main.java.atividade01;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa empresaTeste = new Empresa();

        empresaTeste.adicionarFuncionario(new Desenvolvedor("Jackson", 1, 5000.0, "Javão"));
        empresaTeste.adicionarFuncionario(new Desenvolvedor("Sanatiel", 2, 6000.0, "C"));
        empresaTeste.adicionarFuncionario(new Gerente("Pedro", 3, 7000.0, 10000));
        empresaTeste.adicionarFuncionario(new Gerente("Matue", 4, 8000.0, 10000));
        empresaTeste.adicionarFuncionario(new AnalistaQA("Jonathan", 5, 12000.00, 15));
        empresaTeste.adicionarFuncionario(new AnalistaQA("Taina", 6, 15000.00, 35));

        System.out.println("***** Lista de Funcionarios *****");
        empresaTeste.listarFuncionarios();

        System.out.println("===== Folha de Pagamento");
        empresaTeste.calcularFolhaPagamentoTotal();
    }
}
