package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;

public class Main {
    public static void main(String[] args){

        Empresa empresaDeTeste = new Empresa();

        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Nathália Ohana", 2468, 3000.0, "Java"));

        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Tainá Estefani", 1234, 12000.0, "Java"));

        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Gabriella Maurea", 5678, 10000.0, "JavaScript"));

        empresaDeTeste.adicionarFuncionario(new Gerente("Maria Eduarda", 5569, 18000.0, 12000.0));

        empresaDeTeste.adicionarFuncionario(new Gerente ("Sayonara Da Silva", 5698, 18000.0, 12000.00));

        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Juliana Forbici", 4582, 20000.0, 250));

        empresaDeTeste.listarFuncionarios();
        empresaDeTeste.calcularFolhaDePagamentoTotal();
        empresaDeTeste.calcularFolhaDePagamentoTotalComStream();


    }
}

