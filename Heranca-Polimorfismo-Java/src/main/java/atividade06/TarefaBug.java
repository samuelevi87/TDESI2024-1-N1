package main.java.atividade06;

import main.java.atividade07.Tarefa;

import java.time.LocalDate;

public class TarefaBug extends Tarefa {

    private String plataforma;

    private Severidade severidade;

    public enum Severidade {
        BAIXA(1),
        MEDIA(2),
        ALTA(3),
        CRITICA(4);

        private final int prioridade;

        Severidade(int prioridade) {
            this.prioridade = prioridade;
        }

        public int getPrioridade() {
            return prioridade;
        }
    }

    public TarefaBug(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, String plataforma) {
        super(titulo, descricao, dataCriacao);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }


    @Override
    public int calcularPrioridade() {
        return severidade.getPrioridade();
    }
}
