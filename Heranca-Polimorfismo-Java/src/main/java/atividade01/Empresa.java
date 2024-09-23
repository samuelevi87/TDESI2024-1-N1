package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

public class Empresa {private List<CorrecaoFuncionario> listaFuncionarios;

    /**
     * Constrói uma nova Empresa.
     * Inicializa a lista de funcionários.
     */
    public Empresa() {
        this.listaFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionário à empresa.
     *
     * @param funcionario O funcionário a ser adicionado.
     */
    public void adicionarFuncionario(CorrecaoFuncionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    /**
     * Calcula a folha de pagamento total da empresa.
     *
     * @return O valor total da folha de pagamento.
     */
    public double calcularFolhaPagamentoTotal() {
        return listaFuncionarios.stream()
                .mapToDouble(CorrecaoFuncionario::calcularSalarioTotal)
                .sum();
    }

    /**
     * Lista todos os funcionários da empresa e seus respectivos salários.
     */
    public void listarFuncionarios() {
        listaFuncionarios.forEach(funcionario ->
                System.out.println(funcionario + " - Salário Total: R$" +
                        String.format("%.2f", funcionario.calcularSalarioTotal())));
    }
}

