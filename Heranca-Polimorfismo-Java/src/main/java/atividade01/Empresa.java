package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionários.
 */
public class Empresa {
    private List<Funcionario> funcionarios;

    /**
     * Constrói uma nova empresa.
     * Inicializa a lista de funcionários.
     */
    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionário na lista de funcionários.
     * @param funcionarioParaAdicionar Funcionário a ser adicionado.
     */
    public void adicionarFuncionario(Funcionario funcionarioParaAdicionar) {
        this.funcionarios.add(funcionarioParaAdicionar);
    }

    /**
     * Calcula a folha de pagamento total da empresa.
     * @return A folha de pagamento total da empresa.
     */
    public Double calcularFolhaDePagamentoTotal() {
        Double salarioTotal = 0.0;
        for (Funcionario funcionario:funcionarios) {
            salarioTotal += funcionario.calcularSalario();
        }

        return salarioTotal;
    }

    /**
     * Calcula a folha de pagamento total da empresa.
     * @return A folha de pagamento total da empresa.
     */
    public Double calcularFolhaDePagamentoTotalComStream() {
        return funcionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();
    }

    public void listarFuncionarios() {
        funcionarios.forEach(funcionario -> System.out.println(funcionario.getNome() + " - Salário Total: R$ " + String.format("%.2f", funcionario.calcularSalario())));
    }

    public void listaSimples() {
        for (Funcionario funcionario:funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome() + " - Salário Total: R$ " + String.format("%.2f" + funcionario.calcularSalario()));
        }
    }

    public void listaSimples02() {
        funcionarios.forEach(System.out::println);
    }
}
