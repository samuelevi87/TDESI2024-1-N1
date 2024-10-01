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
     * @param linguagemProgramacao  linguagem de programação da tarefa
     * @param complexidade          complexidade da tarefa
     */
    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataLimite);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

    /**
     * Calcula a prioridade da tarefa de desenvolvimento.
     * A prioridade é baseada na complexidade da tarefa.
     *
     * @return A prioridade calculada (complexidade * 2).
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
