package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionarios.
 */
public class Empresa {
    private List<Funcionario> listaDeFuncionarios;

    /**
     * Constrói uma nova empresa.
     * Inicializa a lista de funcionarios.
     */
    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionario na empresa.
     * @param funcionarioParaAdicionar
     */

    public void adicionarFuncionario(Funcionario funcionarioParaAdicionar){
        this.listaDeFuncionarios.add(funcionarioParaAdicionar);
    }

    /**
     * Calcula a folha total de pagamento.
     * @return
     */

    public double calcularFolhaDePagamentoTotal(){
        double salarioTotalDaEmpresa = 0;
        for (Funcionario funcionario : listaDeFuncionarios) {
            salarioTotalDaEmpresa += funcionario.calcularSalario();
        }
        return salarioTotalDaEmpresa;
    }

    public void listaFuncionarios(){
        listaDeFuncionarios.forEach(funcionario -> System.out.println(funcionario + " - Salário Total: R$ " + String.format("%.2",funcionario.calcularSalario())));
    }
}
