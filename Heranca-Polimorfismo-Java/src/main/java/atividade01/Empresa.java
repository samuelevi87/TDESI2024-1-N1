package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionarios.
 */
public class Empresa {

    private List<Funcionario> listadefuncionarios;

    /**
     * Constroi uma nova empresa.
     * Inicializa a lista de funcionarios.
     * @param listaDeFuncionarios
     */
    public Empresa() {
        this.listadefuncionarios =  new ArrayList<>();
    }

    /**
     * Adiciona um funcionario na lista da empresa.
     * @param FuncionarioParaAdicionar
     */

    public void adicionarFuncionario(Funcionario FuncionarioParaAdicionar){
        this.listadefuncionarios.add(FuncionarioParaAdicionar);
    }
    public double calcularFolhaDePagamentoTotal(){
        double salarioTotalDaEmpresa = 0;
        for (Funcionario funcionario : listadefuncionarios){
            salarioTotalDaEmpresa += funcionario.calcularSalarioTotal();
        }
        return  salarioTotalDaEmpresa;
    }
    public void folhaDePagamento01(){
        return listadefuncionarios.forEach(Funcionario System.out::println( Funcionario + " - Salario Total: R$" + String.format("%.2");));
    }
}
