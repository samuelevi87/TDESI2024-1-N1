package main.java.atividade06;

import java.time.LocalDate;

/**
 * Classe abstrata que representa uma Tarefa
 */
public abstract class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private Status status;

    /**
     * Constrói uma Tarefa
     * @param titulo        título da tarefa
     * @param descricao     descrição da tarefa
     * @param dataLimite    data limite da tarefa
     * @param status        status da tarefa
     */
    public Tarefa(String titulo, String descricao, LocalDate dataLimite, Status status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
        this.status = status;
    }

    /**
     * Atualiza o status da tarefa
     * @param novoStatus status atualizado
     */
    public void atualizarStatus(Status novoStatus){
        this.status = novoStatus;
    }

    /**
     * Método abstrato para calcular a prioridade
     * @return a prioridade da tarefa
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

    @Override
    public String toString() {
        return  "titulo: '" + titulo + '\'' +
                ", descricao: '" + descricao + '\'' +
                ", data de criação: " + dataCriacao +
                ", data limite: " + dataLimite +
                ", status; " + status;
    }
}
