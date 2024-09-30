package main.java.atividade06;

import java.time.LocalDate;

/**
 * Classe TarefaBug que estende a classe Tarefa.
 */
public class TarefaBug extends Tarefa {
    /**
     * Enumeração que define os níveis de severidade de um bug
     */

    public enum Severidade {
        BAIXA, MEDIA, ALTA, CRITICA;
    }

    private Severidade severidade;

    private String plataforma;

    /**
     * Construtor que inicializa os atributos de TarefaBug e da classe base Tarefa;
     */

    public TarefaBug(String titulo, String descricao, LocalDate dataLimite, Severidade severidade, String plataforma) {
        super(titulo, descricao,dataLimite);
        this.severidade = severidade;
        this.plataforma = plataforma;
    }
    /**
     * Implementação do método abstrato calcularPrioridade() da classe base.
     * A prioridade é determinada com base no nível de severidade do bug.
     * @return O valor da prioridade.
     */
    @Override
    public int calcularPrioridade() {
        switch (severidade) {
            case BAIXA:
                return 1;
            case MEDIA:
                return 2;
            case ALTA:
                return 3;
            case CRITICA:
                return 4;
            default:
                return 0;
        }
    }
}
