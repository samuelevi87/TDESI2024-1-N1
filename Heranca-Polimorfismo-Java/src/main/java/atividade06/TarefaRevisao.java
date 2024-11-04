package main.java.atividade06;
import java.time.LocalDate;

/**
 * Representa uma tarefa de revisão no sistema.
 * Estende a classe Tarefa e adiciona funcionalidades específicas para tarefas de revisão.
 */
public class TarefaRevisao extends Tarefa {
    private String autorOriginal;
    private int numeroLinhas;

    /**
     * Constrói uma nova TarefaRevisao.
     *
     * @param titulo O título da tarefa.
     * @param descricao A descrição da tarefa.
     * @param dataLimite A data limite para conclusão da tarefa.
     * @param autorOriginal O autor original do código a ser revisado.
     * @param numeroLinhas O número de linhas do código a ser revisado.
     */
    public TarefaRevisao(String titulo, String descricao, LocalDate dataLimite,
                                 String autorOriginal, int numeroLinhas) {
        super(titulo, descricao, dataLimite);
        this.autorOriginal = autorOriginal;
        this.numeroLinhas = numeroLinhas;
    }

    /**
     * Calcula a prioridade da tarefa de revisão.
     * A prioridade é baseada no número de linhas do código a ser revisado.
     *
     * @return A prioridade calculada (numeroLinhas / 100).
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