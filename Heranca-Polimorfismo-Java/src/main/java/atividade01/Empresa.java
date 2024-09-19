package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionarios
 */
public class Empresa {
    List<Funcionario> listaDeFuncionarios;

    /**
     * Constroi uma nova empresa
     * Inicializa a lista de funcionarios
     */
    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionario na lista de funcionarios
     * @param funcionarioParaAdicionar
     */
    public void adicionarFuncionario(Funcionario funcionarioParaAdicionar){
        this.listaDeFuncionarios.add(funcionarioParaAdicionar);
    }

    /**
     * Calcula a folha de pagamento total
     * @return salario total da empresa
     */
    public double calcularFolhaDePagamentoTotal(){
        double salarioTotalDaEmpresa = 0;

        for(Funcionario funcionario : listaDeFuncionarios){
            salarioTotalDaEmpresa += funcionario.calcularSalario();
        }
        return salarioTotalDaEmpresa;
    }

    /**
     * Forma alternativa de calcular a folha de pagamento
     * @return salario total da empresa
     */
    public double calculoDiferente(){
        return listaDeFuncionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();
    }

    /**
     * Lista os funcionarios da lista de funcionarios
     */
    public void listarFuncionarios(){
        listaDeFuncionarios.forEach(funcionario -> System.out.println(funcionario + " - Salário Total: R$ " + String.format("%2f", funcionario.calcularSalario())));
    }

    /**
     * Forma alternativa de listar funcionarios
     */
    public void listarFuncionarios02(){
        listaDeFuncionarios.forEach(System.out::println);
    }
}
