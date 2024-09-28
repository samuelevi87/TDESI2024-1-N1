package main.java.atividade06;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * Classe que representa uma tarefa de revisão, que herda da classe Tarefa.
 */
public class TarefaRevisao extends Tarefa {
    private String autorOriginal;
    private int numeroLinhas;
    /**
     * Construtor da classe TarefaRevisao.
     *
     * @param titulo         O título da tarefa
     * @param descricao      A descrição da tarefa
     * @param dataLimite    A data limite para conclusão da tarefa
     * @param autorOriginal  O autor original do documento
     * @param numeroLinhas   O número de linhas do documento
     */
    public TarefaRevisao(String titulo, String descricao, LocalDate dataLimite,
                         String autorOriginal, int numeroLinhas) {
        super(titulo, descricao, dataLimite);
        this.autorOriginal = autorOriginal;
        this.numeroLinhas = numeroLinhas;
    }
    /**
     * Calcula a prioridade da tarefa com base no número de linhas.
     * Se o número de linhas for maior que 100, a prioridade é 5; caso contrário, é 1.
     *
     * @return A prioridade da tarefa
     */
    @Override
    public int calcularPrioridade() {
        return numeroLinhas > 100 ? 5 : 1;
    }
    /**
     * Obtém o autor original do documento.
     *
     * @return O autor original
     */
    public String getAutorOriginal() {
        return autorOriginal;
    }
    /**
     * Define o autor original do documento.
     *
     * @param autorOriginal O novo autor original
     */
    public void setAutorOriginal(String autorOriginal) {
        this.autorOriginal = autorOriginal;
    }
    /**
     * Obtém o número de linhas do documento.
     *
     * @return O número de linhas
     */
    public int getNumeroLinhas() {
        return numeroLinhas;
    }
    /**
     * Define o número de linhas do documento.
     *
     * @param numeroLinhas O novo número de linhas
     */
    public void setNumeroLinhas(int numeroLinhas) {
        this.numeroLinhas = numeroLinhas;
    }
    /**
     * Representa a tarefa como uma string formatada.
     *
     * @return Uma string com informações detalhadas sobre a tarefa
     */
    @Override
    public String toString() {
        return "TarefaRevisao{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataCriacao=" + getDataCriacao() +
                ", dataLimite=" + getDataLimite() +
                ", status=" + getStatus() +
                ", autorOriginal='" + autorOriginal + '\'' +
                ", numeroLinhas=" + numeroLinhas +
                '}';
    }
}
