package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionários
 */
public class Empresa {
    private List<Funcionario> listaDeFuncionarios;
    private Double totalDosSalários = 0.0;

    /**
     * Constrói uma nova empresa.
     * Inicializa alista de funcionários
     */
    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    /**
     * Adicionar um Funcionário na lista de Funcionários da empresa.
     * @param funcionarioParaAdicionar
     */
    public void adicionarFuncionario(Funcionario funcionarioParaAdicionar){
        this.listaDeFuncionarios.add(funcionarioParaAdicionar);
    }

    public Double calcularFolhaDePagamentoTotal(){
        listaDeFuncionarios.forEach(funcionario -> {
            this.totalDosSalários += funcionario.calcularSalarioTotal();
        });
        return this.totalDosSalários;
    }

    public Double calcularFolhaDePagamentoTotalComStream(){
        return listaDeFuncionarios.stream().mapToDouble(Funcionario::calcularSalarioTotal).sum();
    }

    public void listarTodosFuncionarios(){
        listaDeFuncionarios.forEach(funcionario -> System.out.println("Funcionário: " + funcionario.getNome()
        + " - Salário Total: R$ " + String.format("%.2f",funcionario.calcularSalarioTotal())));
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "listaDeFuncionarios=" + listaDeFuncionarios +
                ", totalDosSalários=" + totalDosSalários +
                '}';
    }
}


