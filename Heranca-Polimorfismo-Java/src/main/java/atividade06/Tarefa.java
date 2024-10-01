package main.java.atividade06;
import java.time.LocalDate;


public abstract class Tarefa {
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private Status status;

    public enum Status {
        PENDENTE, EM_ANDAMENTO, CONCLUIDA
    }
    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
        this.status = Tarefa.Status.PENDENTE;
    }

    /**
     * Atualiza o status da tarefa.
     *
     * @param novoStatus O novo status da tarefa.
     */
    public void atualizarStatus(Tarefa.Status novoStatus) {
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

    public void setStatus(Tarefa.Status status) {
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

