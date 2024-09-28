package main.java.atividade06;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Representa uma notificação abstrata.
 * Esta classe serve como base para todos os tipos de Tarefas.
 */
public abstract class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private Status status;

    // Enum para o status da tarefa
    public enum Status {
        PENDENTE,
        EM_ANDAMENTO,
        CONCLUIDA
    }

    /**
     * Constrói uma nova Tarefa.
     *
     * @param titulo     O título da tarefa.
     * @param descricao  A descrição da tarefa.
     * @param dataLimite A data limite da tarefa.
     */
    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
        this.status = Status.PENDENTE;
    }

    /**
     * Atualiza o status da tarefa.
     *
     * @param novoStatus O novo status a ser definido.
     */
    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    /**
     * Calcula a prioridade da tarefa.
     *
     * @return A prioridade da tarefa como um inteiro.
     */
    public abstract int calcularPrioridade();

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataLimite() {
        return dataLimite; // Corrigido para LocalDate
    }

    public void setDataLimite(LocalDate dataLimite) { // Corrigido para LocalDate
        this.dataLimite = dataLimite;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataLimite=" + dataLimite +
                ", status=" + status +
                '}';
    }
}

