package main.java.atividade06;

import java.time.LocalDate;

/**
 * Classe TarefaRevisao que estende a classe Tarefa.
 */
public class TarefaRevisao extends Tarefa{

    private String autorOriginal;

    private int numeroLinhas;

    /**
     *Construtor que inicializa os atributos de TarefaRevisao e da classe base Tarefa.
     */

    public TarefaRevisao(String titulo, String descricao, LocalDate dataLimite, String autorOriginal, int numeroLinhas) {
        super(titulo, descricao, dataLimite);
        this.autorOriginal = autorOriginal;
        this.numeroLinhas = numeroLinhas;
    }

    /**
     * Implementação do método abstrato calcularPrioridade() da classe base.
     * A prioridade é calculada dividindo o número de linhas por 100.
     * @return O valor da prioridade.
     */
    @Override
    public int calcularPrioridade() {
        return numeroLinhas / 100;
    }
}
