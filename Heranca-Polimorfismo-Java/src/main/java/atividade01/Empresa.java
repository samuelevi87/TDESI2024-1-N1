package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionários
 */

public class Empresa {

    private List<Funcionario> listaFuncionarios;

    /**
     * Constrói uma nova empresa
     * Inicializa a lista de funcionários
     */

    public Empresa() {
        this.listaFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionário na lista de funcionarios da empresa
     *
     * @param funcionarioParaAdd
     */

    public void adicionarFuncionario(Funcionario funcionarioParaAdd) {
        this.listaFuncionarios.add(funcionarioParaAdd);
    }

    public double calcularFolhaPagamentoTotal() {
        double salarioTotalEmpresa = 0;
        for (Funcionario funcionario : listaFuncionarios) {
            salarioTotalEmpresa += funcionario.calcularSalarioTotal();
        }
        return salarioTotalEmpresa;
    }

    public void listarFuncionarios() {
        listaFuncionarios.forEach(funcionario -> System.out.println(funcionario + "Salário Total: R$" + String.format("%.2f", funcionario.calcularSalarioTotal())));
    }

    public void calcularDiferente(){
        listaFuncionarios.stream().mapToDouble(Funcionario::calcularSalarioTotal).sum();
    }

    public void listaSimples(){
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(
                    "Funcionário: " + funcionario.getNome() + ", Salário: R$ " + funcionario.calcularSalarioTotal()
            );
        }
    }

}
