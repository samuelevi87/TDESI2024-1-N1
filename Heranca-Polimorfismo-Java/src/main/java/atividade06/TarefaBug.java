package main.java.atividade06;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * Classe que representa uma tarefa de bug, que herda da classe Tarefa.
 */
public class TarefaBug extends Tarefa{
    /**
     * Enum que representa os níveis de severidade do bug.
     */
    public enum Severidade {
        BAIXA,
        MEDIA,
        ALTA,
        CRITICA
    }

    private Severidade severidade;
    private String plataforma;
    /**
     * Construtor da classe TarefaBug.
     *
     * @param titulo       O título da tarefa
     * @param descricao    A descrição da tarefa
     * @param dataLimite  A data limite para conclusão da tarefa
     * @param severidade   A severidade do bug
     * @param plataforma    A plataforma onde o bug foi encontrado
     */
    public TarefaBug(String titulo, String descricao, LocalDate dataLimite,
                     Severidade severidade, String plataforma) {
        super(titulo, descricao, dataLimite);
        this.severidade = severidade;
        this.plataforma = plataforma;
    }
    /**
     * Calcula a prioridade da tarefa com base na severidade do bug.
     *
     * @return A prioridade da tarefa
     */
    @Override
    public int calcularPrioridade() {
        switch (severidade) {
            case CRITICA:
                return 10;
            case ALTA:
                return 7;
            case MEDIA:
                return 5;
            case BAIXA:
            default:
                return 1;
        }
    }
    /**
     * Obtém a severidade do bug.
     *
     * @return A severidade do bug
     */
    public Severidade getSeveridade() {
        return severidade;
    }
    /**
     * Define a severidade do bug.
     *
     * @param severidade A nova severidade do bug
     */
    public void setSeveridade(Severidade severidade) {
        this.severidade = severidade;
    }
    /**
     * Obtém a plataforma onde o bug foi encontrado.
     *
     * @return A plataforma do bug
     */
    public String getPlataforma() {
        return plataforma;
    }

    /**
     * Define a plataforma onde o bug foi encontrado.
     *
     * @param plataforma A nova plataforma do bug
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    /**
     * Representa a tarefa como uma string formatada.
     *
     * @return Uma string com informações detalhadas sobre a tarefa
     */
    @Override
    public String toString() {
        return "TarefaBug{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataCriacao=" + getDataCriacao() +
                ", dataLimite=" + getDataLimite() +
                ", status=" + getStatus() +
                ", severidade=" + severidade +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
