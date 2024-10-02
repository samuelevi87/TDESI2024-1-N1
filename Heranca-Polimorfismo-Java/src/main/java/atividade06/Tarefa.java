package main.java.atividade06;
import java.time.LocalDate;

<<<<<<< HEAD
public class Tarefa {
=======

public abstract class Tarefa {
>>>>>>> f49528e65b0468488bed61580893494517663322
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataLimite;
    private Status status;

<<<<<<< HEAD
=======
    public enum Status {
        PENDENTE, EM_ANDAMENTO, CONCLUIDA
    }
>>>>>>> f49528e65b0468488bed61580893494517663322
    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = LocalDate.now();
        this.dataLimite = dataLimite;
<<<<<<< HEAD
        this.status = Status.PENDENTE;
    }
    public enum Status {
        PENDENTE, EM_ANDAMENTO, CONCLUIDA
    }

=======
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

>>>>>>> f49528e65b0468488bed61580893494517663322
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

<<<<<<< HEAD
=======
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

>>>>>>> f49528e65b0468488bed61580893494517663322
    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Status getStatus() {
        return status;
    }

<<<<<<< HEAD
    public void atualizarStatus(Status novoStatus) {
        this.status = novoStatus;
    }

    public int calcularPrioridade() {
        return 0;
=======
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
>>>>>>> f49528e65b0468488bed61580893494517663322
    }
}

