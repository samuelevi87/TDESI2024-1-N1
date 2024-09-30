package main.java.atividade06;

import java.time.LocalDate;

/**
 * A classe Tarefa é uma classe abstrata que representa uma tarefa genérica.
 */
public abstract class Tarefa {

    private String titulo;

    private String descricao;

    private LocalDate dataCriacao;

    private LocalDate dataLimite;

    private Status status;

    /**
     * Enumeração que define os possíveis status da tarefa.
     */

    public enum Status {
        PENDENTE, EM_ANDAMENTO, CONCLUIDA
    }
    /**
     * Construtor da classe Tarefa, que inicializa os atributos.
     */

    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
        this.status = status;
    }

    /**
     * Métodos getter e setter para os atributos.
     */
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
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Status getStatus() {
        return status;
    }
    /**
     * Método para escrever as informações de uma tarefa.
     * @return Atributos de Tarefa.
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
    /**
     * Método para atualizar o status da tarefa.
     */
    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }
    /**
     * Método abstrato que deve ser implementado pelas subclasses.
     * @return A prioridade da tarefa como um valor inteiro.
     */

    public abstract int calcularPrioridade();
}
