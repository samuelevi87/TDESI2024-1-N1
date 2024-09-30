package main.java.atividade06;

import java.time.LocalDate;

/**
 * A classe abstrata Tarefa representa uma tarefa genérica que pode ter título, descrição,
 * datas de criação e limite, e um status. Ela também possui um método abstrato para
 * calcular a prioridade da tarefa.
 */
public abstract class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private Status status;

    /**
     * Construtor para a classe Tarefa.
     * @param titulo O título da tarefa.
     * @param descricao A descrição da tarefa.
     * @param dataLimite A data limite para conclusão da tarefa.
     */
    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.status = status.PENDENTE;
        this.dataCriacao = LocalDate.now();
    }

    /**
     * Atualiza o status da tarefa.
     * @param novoStatus O novo status da tarefa.
     */
    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    /**
     * Método abstrato para calcular a prioridade da tarefa.
     * Cada subclasse deve implementar seu próprio cálculo de prioridade.
     * @return O nível de prioridade da tarefa.
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
     * Sobrescreve o método toString() para fornecer uma representação textual
     * da tarefa, incluindo título, descrição, datas e status.
     * @return Uma string representando a tarefa.
     */
    @Override
    public String toString() {
        return "Título: " + titulo + '\'' +
                ", Descrição: " + descricao + '\'' +
                ", Data Criação: " + dataCriacao +
                ", Data Limite: " + dataLimite +
                ", Status: " + status;
    }
}