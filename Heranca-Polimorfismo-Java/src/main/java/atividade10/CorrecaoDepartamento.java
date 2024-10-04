package main.java.atividade10;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um Departamento.
 */
public class CorrecaoDepartamento {
    private String nome;
    private List<CorrecaoFuncionario> funcionarios;

    /**
     * Construtor para a classe Departamento.
     *
     * @param nome O nome do departamento.
     */
    public CorrecaoDepartamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionário ao departamento.
     *
     * @param funcionario O funcionário a ser adicionado.
     */
    public void adicionarFuncionario(CorrecaoFuncionario funcionario) {
        funcionarios.add(funcionario);
    }

    /**
     * Remove um funcionário do departamento.
     *
     * @param funcionario O funcionário a ser removido.
     */
    public void removerFuncionario(CorrecaoFuncionario funcionario) {
        funcionarios.remove(funcionario);
    }

    /**
     * Lista todos os funcionários do departamento.
     */
    public void listarFuncionarios() {
        funcionarios.forEach(System.out::println);
    }

    /**
     * Versão simples do método listarFuncionarios.
     */
    public void listarFuncionariosSimples() {
        for (CorrecaoFuncionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    /**
     * Calcula a folha de pagamento total do departamento.
     *
     * @return O total da folha de pagamento.
     */
    public double calcularFolhaPagamento() {
        return funcionarios.stream()
                .mapToDouble(CorrecaoFuncionario::calcularSalario)
                .sum();
    }

    /**
     * Versão simples do método calcularFolhaPagamento.
     *
     * @return O total da folha de pagamento.
     */
    public double calcularFolhaPagamentoSimples() {
        double total = 0;
        for (CorrecaoFuncionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public List<CorrecaoFuncionario> getFuncionarios() {
        return funcionarios;
    }
}