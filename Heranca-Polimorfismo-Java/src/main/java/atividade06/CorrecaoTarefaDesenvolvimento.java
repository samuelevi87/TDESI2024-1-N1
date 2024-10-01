package main.java.atividade06;

import java.time.LocalDate;

/**
 * Representa uma tarefa de desenvolvimento no sistema.
 * Estende a classe Tarefa e adiciona funcionalidades específicas para tarefas de desenvolvimento.
 */
public class CorrecaoTarefaDesenvolvimento extends CorrecaoTarefa {
    private String linguagemProgramacao;
    private int complexidade;

    /**
     * Constrói uma nova TarefaDesenvolvimento.
     *
     * @param titulo O título da tarefa.
     * @param descricao A descrição da tarefa.
     * @param dataLimite A data limite para conclusão da tarefa.
     * @param linguagemProgramacao A linguagem de programação utilizada.
     * @param complexidade A complexidade da tarefa (1-5).
     */
    public CorrecaoTarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite,
                                         String linguagemProgramacao, int complexidade) {
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