package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia meus funcionários
 */
public class Empresa {

    private List<Funcionario> listaDeFuncionarios;

    /**
     * Constrói uma nova empresa.
     * Inicializa a lista de funcionários.
     */
    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionário na lista de funcionários.
     * @param funcionarioParaAdicionar
     */
    public void adicionarFuncionario(Funcionario funcionarioParaAdicionar){
        this.listaDeFuncionarios.add(funcionarioParaAdicionar);
    }

    /**
     * Calcula folha de pagamento total.
     * @return O valor total da folha de pagamento.
     */
    public double calcularFolhaDePagamentoTotal(){

        double salarioTotalDaEmpresa = 0;

        for (Funcionario funcionario : listaDeFuncionarios) {
            salarioTotalDaEmpresa += funcionario.calcularSalarioTotal();
        }
        return salarioTotalDaEmpresa;
    }

    /**
     * Forma alternativa de clacular folha de pagamento.
     * @return O valor total da folha de pagamento.
     */
    public double calcularFolhaDePagamentoTotalComStream(){
        return listaDeFuncionarios.stream().mapToDouble(Funcionario::calcularSalarioTotal).sum();
    }

    /**
     * Lista todos os funcionários da empresa e seus receptivos salários.
     */
    public void listarFuncionarios(){
        listaDeFuncionarios.forEach(funcionario -> System.out.println(funcionario + "Salario total: R$  " + String.format("%2f", funcionario.calcularSalarioTotal())));
    }
}
