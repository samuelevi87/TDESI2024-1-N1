package main.java.atividade06;

import java.time.LocalDate;

/**
 * A classe TarefaRevisao é uma especialização de Tarefa que representa uma tarefa de revisão de texto.
 * Ela possui atributos adicionais como o nome do autor original e o número de linhas a serem revisadas.
 */
public class TarefaRevisao extends Tarefa {
    private String autorOriginal;
    private Integer numeroLinhas;

    /**
     * Construtor para a classe TarefaRevisao.
     * @param titulo O título da tarefa de revisão.
     * @param descricao A descrição da tarefa de revisão.
     * @param dataLimite A data limite para conclusão da tarefa.
     * @param autorOriginal O nome do autor original do texto a ser revisado.
     * @param numeroLinhas O número de linhas do texto a ser revisado.
     */
    public TarefaRevisao(String titulo, String descricao, LocalDate dataLimite, String autorOriginal, Integer numeroLinhas) {
        super(titulo, descricao, dataLimite);
        this.autorOriginal = autorOriginal;
        this.numeroLinhas = numeroLinhas;
    }

    /**
     * Calcula a prioridade da tarefa de revisão.
     * A prioridade é calculada com base no número de linhas a serem revisadas, onde
     * cada 100 linhas correspondem a um ponto de prioridade.
     * @return O nível de prioridade da tarefa, baseado na divisão do número de linhas por 100.
     */
    @Override
    public int calcularPrioridade() {
        return numeroLinhas / 100;
    }
}