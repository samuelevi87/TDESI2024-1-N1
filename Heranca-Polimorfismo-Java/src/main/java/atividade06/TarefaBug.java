package main.java.atividade06;

import java.time.LocalDate;

/**
 * A classe TarefaBug é uma extensão da classe Tarefa, representando uma tarefa que envolve
 * a correção de um bug. Possui atributos adicionais como severidade do bug e a plataforma
 * onde o bug foi encontrado.
 */
public class TarefaBug extends Tarefa {
    private Severidade severidade;
    private String plataforma;

    /**
     * Construtor para a classe TarefaBug.
     *
     * @param titulo O título da tarefa.
     * @param descricao A descrição da tarefa.
     * @param dataLimite A data limite para a conclusão da tarefa.
     * @param severidade O nível de severidade do bug.
     * @param plataforma A plataforma onde o bug foi encontrado.
     */
    public TarefaBug(String titulo, String descricao, LocalDate dataLimite, Severidade severidade, String plataforma) {
        super(titulo, descricao, dataLimite);
        this.severidade = severidade;
        this.plataforma = plataforma;
    }

    /**
     * Calcula a prioridade da tarefa com base no nível de severidade do bug.
     * @return O valor da prioridade correspondente ao nível de severidade.
     */
    @Override
    public int calcularPrioridade() {
        switch (severidade) {
            case BAIXA:
                return 1;
            case MEDIA:
                return 2;
            case ALTA:
                return 3;
            case CRITICA:
                return 4;
            default:
                return 0;
        }
    }
}