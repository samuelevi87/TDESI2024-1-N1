package main.java.atividade06;

import java.time.LocalDate;

/**
 * Representa uma tarefa de desenvolvimento
 */
public class TarefaDesenvolvimento extends Tarefa{
    private String linguagemProgramacao;
    private int complexidade;

    /**
     *
     * @param titulo                título da tarefa
     * @param descricao             descrição da tarefa
     * @param dataLimite            data limite da tarefa
     * @param status                status da tarefa
     * @param linguagemProgramacao  linguagem de programação da tarefa
     * @param complexidade          complexidade da tarefa
     */
    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite, Status status, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataLimite, status);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

    /**
     * Calcula a prioridade sendo duas vezes a complexidade
     * @return a prioridade da tarefa
     */
    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public int getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(int complexidade) {
        this.complexidade = complexidade;
    }
}
