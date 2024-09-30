package main.java.atividade06;

import java.time.LocalDate;

/**
 * A classe TarefaDesenvolvimento é uma extensão da classe Tarefa, representando uma tarefa
 * de desenvolvimento de software. Possui atributos adicionais como a linguagem de programação
 * utilizada e o nível de complexidade da tarefa.
 */
public class TarefaDesenvolvimento extends Tarefa {
    private String linguagemProgramacao;
    private int complexidade;

    /**
     * Construtor para a classe TarefaDesenvolvimento.
     *
     * @param titulo O título da tarefa.
     * @param descricao A descrição da tarefa.
     * @param dataLimite A data limite para a conclusão da tarefa.
     * @param linguagemProgramacao A linguagem de programação utilizada na tarefa.
     * @param complexidade O nível de complexidade da tarefa.
     */
    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataLimite);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }

    /**
     * Calcula a prioridade da tarefa com base no nível de complexidade.
     * @return O valor da prioridade, que é o dobro da complexidade.
     */
    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }
}