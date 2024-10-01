package main.java.atividade06;

import java.time.LocalDate;

/**
 * Representa uma tarefa de revisão
 */
public class TarefaRevisao extends Tarefa{
    private String autorOriginal;
    private int numeroLinhas;

    /**
     * @param titulo        título da tarefa
     * @param descricao  descrição da tarefa
     * @param dataLimite  data limite da tarefa
     * @param autorOriginal autor original da tarefa
     * @param numeroLinhas número de linhas da tarefa
     */
    public TarefaRevisao(String titulo, String descricao, LocalDate dataLimite, String autorOriginal, int numeroLinhas) {
        super(titulo, descricao, dataLimite);
        this.autorOriginal = autorOriginal;
        this.numeroLinhas = numeroLinhas;
    }

    /**
     * Calcula a prioridade sendo o número de linhas dividido por 100
     * @return a prioridade da tarefa
     */
    @Override
    public int calcularPrioridade() {
        return numeroLinhas / 100;
    }

    public String getAutorOriginal() {
        return autorOriginal;
    }

    public void setAutorOriginal(String autorOriginal) {
        this.autorOriginal = autorOriginal;
    }

    public int getNumeroLinhas() {
        return numeroLinhas;
    }

    public void setNumeroLinhas(int numeroLinhas) {
        this.numeroLinhas = numeroLinhas;
    }
}
