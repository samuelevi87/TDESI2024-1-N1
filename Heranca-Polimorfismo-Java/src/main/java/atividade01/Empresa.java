package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionários.
 */


public class Empresa {

    private List<Funcionario> listaDeFuncionarios;

    /**
     * Constroi uma nova empresa
     * Inicializa a list de funcionarios
     */
    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionário na lista de funcionários
     *
     * @param funcionarioParaAdincionar
     */
    public void adicionarFuncionario(Funcionario funcionarioParaAdincionar) {

        this.listaDeFuncionarios.add(funcionarioParaAdincionar);
    }

    public double calcularFolhaDePagamentoTotal() {
        double salarioTotalDaEmpresa = 0;

        for (Funcionario funcionario : listaDeFuncionarios) {
            salarioTotalDaEmpresa += funcionario.calcularSalarioTotal();
        }
        return salarioTotalDaEmpresa;
    }

    public void listaFuncionarios() {
        for (Funcionario funcionario : listaDeFuncionarios) {
            System.out.println("Funcionário: " + funcionario.getNome() + " Salário: " + funcionario.calcularSalarioTotal());
        }
    }

}
