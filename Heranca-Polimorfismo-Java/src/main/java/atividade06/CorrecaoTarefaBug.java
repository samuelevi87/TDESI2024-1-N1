package main.java.atividade06;

import java.time.LocalDate;

/**
 * Representa uma tarefa de correção de bug no sistema.
 * Estende a classe Tarefa e adiciona funcionalidades específicas para tarefas de bug.
 */
public class CorrecaoTarefaBug extends CorrecaoTarefa {
    private Severidade severidade;
    private String plataforma;

    /**
     * Enumeração que representa os níveis de severidade de um bug.
     */
    public enum Severidade {
        BAIXA(1), MEDIA(2), ALTA(3), CRITICA(4);

        private final int valor;

        Severidade(int valor) {
            this.valor = valor;
        }

        public int getValor() {
            return valor;
        }
    }

    /**
     * Constrói uma nova TarefaBug.
     *
     * @param titulo O título da tarefa.
     * @param descricao A descrição da tarefa.
     * @param dataLimite A data limite para conclusão da tarefa.
     * @param severidade A severidade do bug.
     * @param plataforma A plataforma onde o bug foi encontrado.
     */
    public CorrecaoTarefaBug(String titulo, String descricao, LocalDate dataLimite,
                             Severidade severidade, String plataforma) {
        super(titulo, descricao, dataLimite);
        this.severidade = severidade;
        this.plataforma = plataforma;
    }

    /**
     * Calcula a prioridade da tarefa de bug.
     * A prioridade é baseada na severidade do bug.
     *
     * @return A prioridade calculada (valor da severidade).
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