package main.java.atividade01;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * represanta a empresa que gerencia os funcionarios
 */
public class Empresa {
    private List<Funcionario> listaDeFuncionarios;

    /**
     * constroi uma nova empresa.
     * incicializa a listade funcionarios.
     */

    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um Funcionario na lista de Funcionarios.
     *
     * @param funcionarioParaAdicionar
     */
    public void adicionarFuncionario(Funcionario funcionarioParaAdicionar) {
        this.listaDeFuncionarios.add(funcionarioParaAdicionar);
    }

    public Double calcularFolhaDePagamentoTotal() {
        double salarioTotalDaEmpresa = 0;
        for (Funcionario funcionario : listaDeFuncionarios) {
            salarioTotalDaEmpresa += funcionario.calcularSalarioTotal();
        }
        return salarioTotalDaEmpresa;
    }

    /**
     *
     */
    public double calcularFolhaDePagamentoTotaStream(){
        return listaDeFuncionarios.stream().mapToDouble
                (Funcionario ::calcularSalarioTotal).sum();


    }

    /**
     * Lista todos os funcionarios da empresa e seus
     * respectivos salarios
     */
    public void folhaDePagamento01() {
        listaDeFuncionarios.forEach(funcionario ->
                System.out.println(funcionario + "- salario total R$ " + String.format("%.2",
                        funcionario.calcularSalarioTotal())));
    }

    public void listaSimples() {
        for (Funcionario funcionario : listaDeFuncionarios) {
            System.out.println("Funcionariof: " + funcionario.getNome()
                    + "Salario: R$ " + funcionario.calcularSalarioTotal());
        }
    }

    public void listaSimples02() {
        listaDeFuncionarios.forEach(System.out::println);
        for (Funcionario funcionario : listaDeFuncionarios) {
            System.out.println("Funcionariof: " + funcionario.getNome()
                    + "Salario: R$ " + funcionario.calcularSalarioTotal());
        }
    }
}
