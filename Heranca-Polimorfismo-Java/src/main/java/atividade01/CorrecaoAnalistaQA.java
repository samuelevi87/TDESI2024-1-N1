package main.java.atividade01;

/**
 * Representa um analista de QA na empresa.
 * Estende a classe Funcionario e adiciona funcionalidades específicas para analistas de QA.
 */
public class CorrecaoAnalistaQA extends CorrecaoFuncionario {
    private int numeroTestesRealizados;

    /**
     * Constrói um novo AnalistaQA.
     *
     * @param nome O nome do analista de QA.
     * @param identificador O número de identificação único do analista de QA.
     * @param salarioBase O salário base do analista de QA.
     * @param numeroTestesRealizados O número de testes realizados pelo analista de QA.
     */
    public CorrecaoAnalistaQA(String nome, int identificador, double salarioBase, int numeroTestesRealizados) {
        super(nome, identificador, salarioBase);
        this.numeroTestesRealizados = numeroTestesRealizados;
    }

    /**
     * Calcula o salário total do analista de QA.
     * O analista de QA recebe um bônus de 5% sobre o salário base, mais R$ 100 por teste realizado.
     *
     * @return O salário total calculado.
     */
    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() * 1.05) + (numeroTestesRealizados * 100);
    }

    /**
     * Obtém o número de testes realizados pelo Analista QA.
     * @return O número inteiro de testes realizados pelo Analista QA.
     */
    public int getNumeroTestesRealizados() {
        return numeroTestesRealizados;
    }

    /**
     * Define quantidade testes realizados pelo Analista QA.
     * @param numeroTestesRealizados O número inteiro de testes realizados pelo Analista QA.
     */
    public void setNumeroTestesRealizados(int numeroTestesRealizados) {
        this.numeroTestesRealizados = numeroTestesRealizados;
    }
}

