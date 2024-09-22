package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a emprese que gerencia os funcionarios
 */
public class Empresa {
    private List<Funcionario>listaDeFuncionarios;

    /**
     * constroi uma nova empresa
     * inicializa a lista de funcionarios
     * @param
     */
    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>() ;
    }

    /**
     * Adiciona um funcionario na empresa
     * @param funcionarioParaAdicionar
     */
    public void adicionnarFuncionarios(Funcionario funcionarioParaAdicionar){
        this.listaDeFuncionarios.add(funcionarioParaAdicionar);
    }

    /**
     * Calcula a folha de pagamento total da empresa.
     * @return A folha de pagamento total da empresa.
     */
    public Double folhaDePagamentoTotal(){
        Double salarioTotalDaEmpresa = 0.0;
        for (Funcionario funcionario : listaDeFuncionarios ){
            salarioTotalDaEmpresa += funcionario.calcularSalario();
        }
        return salarioTotalDaEmpresa;
    }

    /**
     * lista todos os funcionarios da empresa da empresa e seus respectivos salarios
     */
    public void listaDeFuncionario(){
        for (Funcionario funcionario : listaDeFuncionarios){
            System.out.println("Funcionario : " + funcionario.getNome() + " Id : " + funcionario.getId() + " salario : R$ " + funcionario.calcularSalario()+ "\n");
        }
    }
}
