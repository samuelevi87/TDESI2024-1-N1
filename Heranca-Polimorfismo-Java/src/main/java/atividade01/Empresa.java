package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionários.
 */

public class Empresa {
    private List<Funcionario> listaDeFuncionarios;

    /**
     * Contrói uma nova empresa.
     * Inicializa a lista de funcionários.
     */

    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionário na lista de funcionários da empresa.
     * @param funcionarioParaAdicionar
     */

    public void adicionarFuncionario(Funcionario funcionarioParaAdicionar) {
        this.listaDeFuncionarios.add(funcionarioParaAdicionar);
    }

    /**
     * Calcula a folha de pagamento total.
     * @return O salário total da empresa.
     */

    public double calcularFolhaDePagamentolTotal() {
        double salarioTotalDaEmpresa = 0;

        for (Funcionario funcionario : listaDeFuncionarios) {
            salarioTotalDaEmpresa += funcionario.calcularSalario();
        }

        return salarioTotalDaEmpresa;
    }

    /**
     * Calcula a folha de pagamento total da empresa.
     * @return
     */

    public double calculoDiferente() {
        return listaDeFuncionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();
    }

    /**
     * Lista todos os funcionários da empresa e seus respectivos salários.
     */

    public void listarFuncionarios() {
        listaDeFuncionarios.forEach(funcionario -> System.out.println(funcionario + " - Salario Total: R$ " + String.format("%.2f", funcionario.calcularSalario())));
    }

    public void listaSimples() {
        for(Funcionario funcionario : listaDeFuncionarios) {
            System.out.println("Funcionário: " +funcionario.getNome() + ", Salário: R$ " + funcionario.calcularSalario());
        }
    }

    public void listaSimples02() {
        listaDeFuncionarios.forEach(System.out::println);
    }
}