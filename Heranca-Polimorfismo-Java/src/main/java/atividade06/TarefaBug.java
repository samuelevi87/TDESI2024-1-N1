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
     * @param severidade  severidade da tarefa
     * @param plataforma  plataforma da tarefa
     */
    public TarefaBug(String titulo, String descricao, LocalDate dataLimite, Severidade severidade, String plataforma) {
        super(titulo, descricao, dataLimite);
        this.severidade = severidade;
        this.plataforma = plataforma;
    }

    /**
     * Cacula a prioridade da tarefa de acordo com a severidade
     * @return prioridade de 1 à 4
     */
    @Override
    public int calcularPrioridade() {
        return severidade.getValor();
    }

    public Severidade getSeveridade() {
        return severidade;
    }

    public void setSeveridade(Severidade severidade) {
        this.severidade = severidade;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
