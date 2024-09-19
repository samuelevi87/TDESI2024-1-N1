package main.java;

import main.java.atividade01.AnalistaQA;
import main.java.atividade01.Desenvolvedor;
import main.java.atividade01.Empresa;
import main.java.atividade01.Gerente;

public class Main {
    public static void main(String[] args) {
        Empresa empresaDeTeste = new Empresa();

        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Samuel Levi",123456, 15000.0,"Javão"));
        empresaDeTeste.adicionarFuncionario(new Desenvolvedor("Jackson Callado",456789, 20000.0,"C++"));
        empresaDeTeste.adicionarFuncionario(new Gerente("Sanatiel", 789456, 6000.0, 10000.0));
        empresaDeTeste.adicionarFuncionario(new Gerente("Jackson Stumpf", 7856, 7000.0, 10000.0));
        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Jonathan Sost", 75624, 12000.0, 15));
        empresaDeTeste.adicionarFuncionario(new AnalistaQA("Tainá Estefani", 951424, 15000.0, 35));

        System.out.println("******** LISTA DE FUNCIONÁRIOS **********");
        empresaDeTeste.listarFuncionarios();

        System.out.println("========== Folha de Pagamento ============");
        System.out.println("Folha de pagamento total: R$ " + String.format("%.2f",empresaDeTeste.calcularFolhaDePagamentoTotal()));


    }
}
