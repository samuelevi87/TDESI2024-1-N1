package main.java.atividade06;

import java.time.LocalDate;

/**
 * Classe TarefaDesenvolvimento que estende a classe Tarefa.
 */
public class TarefaDesenvolvimento extends Tarefa{

    private String linguagemProgramacao;

    private int complexidade; // Complexidade da tarefa, variando de 1 a 5

    /**
     * Construtor que inicializa os atributos de TarefaDesenvolvimento e da classe base Tarefa.
     */
    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite, String linguagemProgramacao, int complexidade) {
        super(titulo, descricao,dataLimite);
        this.linguagemProgramacao = linguagemProgramacao;
        this.complexidade = complexidade;
    }
    /**
     * Implementação do método abstrato calcularPrioridade() da classe base.
     * A prioridade é calculada como a complexidade multiplicada por 2.
     * @return O valor da prioridade.
     */
    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }
}
