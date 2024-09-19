package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa empresaDeTeste = new Empresa();

        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Gabriella", 1, 15000.0, "Java"));
        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Taina", 2, 20000.0, "JavaScript"));
        empresaDeTeste.adicionarFuncionario(new Gerente("Nathalia", 3, 10000.0, 10000));
        empresaDeTeste.adicionarFuncionario(new Gerente("Maria", 4,12000.0, 5000));
        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Sayonara", 5, 14000, 200));
        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Juliana", 6, 50000, 5));

        empresaDeTeste.listarFuncionarios();
        empresaDeTeste.listarFuncionarios02();
        empresaDeTeste.calcularFolhaDePagamentoTotal();
        empresaDeTeste.listarFuncionarios02();
    }

}

