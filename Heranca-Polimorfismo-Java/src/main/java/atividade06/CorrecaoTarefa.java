package main.java.atividade06;

import java.time.LocalDate;

/**
 * Representa uma tarefa abstrata no sistema de gerenciamento de tarefas.
 * Esta classe serve como base para todos os tipos de tarefas.
 */
public abstract class CorrecaoTarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private Status status;

    /**
     * Enumeração que representa os possíveis status de uma tarefa.
     */
    public enum Status {
        PENDENTE, EM_ANDAMENTO, CONCLUIDA
    }

    /**
     * Constrói uma nova Tarefa.
     *
     * @param titulo O título da tarefa.
     * @param descricao A descrição da tarefa.
     * @param dataLimite A data limite para conclusão da tarefa.
     */
    public CorrecaoTarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
        this.status = Status.PENDENTE;
    }

    /**
     * Atualiza o status da tarefa.
     *
     * @param novoStatus O novo status da tarefa.
     */
    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    /**
     * Calcula a prioridade da tarefa.
     *
     * @return Um inteiro representando a prioridade da tarefa.
     */
    public abstract int calcularPrioridade();

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

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Retorna uma representação em string da tarefa.
     *
     * @return Uma string contendo os detalhes da tarefa.
     */
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