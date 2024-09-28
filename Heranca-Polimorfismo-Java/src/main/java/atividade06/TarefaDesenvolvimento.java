package main.java.atividade06;

import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * Classe que representa uma tarefa de desenvolvimento, que herda da classe Tarefa.
 */
public class TarefaDesenvolvimento extends Tarefa{
    private String linguagemProgramacao;
    private int complexidade; //1-5
    /**
     * Construtor da classe TarefaDesenvolvimento.
     *
     * @param titulo           O título da tarefa
     * @param descricao        A descrição da tarefa
     * @param dataLimite      A data limite para conclusão da tarefa
     * @param linguagemProgramacao A linguagem de programação utilizada
     * @param complexidade     A complexidade da tarefa (1-5)
     */
    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataLimite,
                                 String linguagemProgramacao, int complexidade) {
        super(titulo, descricao, dataLimite);
        this.linguagemProgramacao = linguagemProgramacao;
        setComplexidade(complexidade);
    }
    /**
     * Calcula a prioridade da tarefa, multiplicando a complexidade por 2.
     *
     * @return A prioridade da tarefa
     */
    @Override
    public int calcularPrioridade() {
        return complexidade * 2;
    }
    /**
     * Obtém a linguagem de programação da tarefa.
     *
     * @return A linguagem de programação
     */
    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    /**
     * Define a linguagem de programação da tarefa.
     *
     * @param linguagemProgramacao A nova linguagem de programação
     */
    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }
    /**
     * Obtém a complexidade da tarefa.
     *
     * @return A complexidade da tarefa
     */
    public int getComplexidade() {
        return complexidade;
    }
/**
 * Define a complexidade da tarefa, com validação.
 *
 * @param complexidade A nova complexidade da tarefa
 * */
    public void setComplexidade(int complexidade) {
        if (complexidade < 1 || complexidade > 5) {
            throw new IllegalArgumentException("Complexidade deve ser entre 1 e 5.");
        }
        this.complexidade = complexidade;
    }
    /**
     * Representa a tarefa como uma string formatada.
     *
     * @return Uma string com informações detalhadas sobre a tarefa
     */
    @Override
    public String toString() {
        return "TarefaDesenvolvimento{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataCriacao=" + getDataCriacao() +
                ", dataLimite=" + getDataLimite() +
                ", status=" + getStatus() +
                ", linguagemProgramacao='" + linguagemProgramacao + '\'' +
                ", complexidade=" + complexidade +
                '}';
    }
}
