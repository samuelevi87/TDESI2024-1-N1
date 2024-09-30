package main.java.atividade06;

import java.time.LocalDate;

/**
 * Representa uma tarefa de bug
 */
public class TarefaBug extends Tarefa{
    private  Severidade severidade;
    private  String plataforma;

    /**
     * Constrói uma tarefa bug
     * @param titulo        título da tarefa
     * @param descricao  descrição da tarefa
     * @param dataLimite  data limite da tarefa
     * @param status      status da tarefa
     * @param severidade  severidade da tarefa
     * @param plataforma  plataforma da tarefa
     */
    public TarefaBug(String titulo, String descricao, LocalDate dataLimite, Status status, Severidade severidade, String plataforma) {
        super(titulo, descricao, dataLimite, status);
        this.severidade = severidade;
        this.plataforma = plataforma;
    }

    /**
     * Cacula a prioridade da tarefa de acordo com a severidade
     * @return prioridade de 1 à 4
     */
    @Override
    public int calcularPrioridade() {
        return switch (severidade) {
            case BAIXA -> 1;
            case MEDIA -> 2;
            case ALTA -> 3;
            case CRITICA -> 4;
        };
    }
}
