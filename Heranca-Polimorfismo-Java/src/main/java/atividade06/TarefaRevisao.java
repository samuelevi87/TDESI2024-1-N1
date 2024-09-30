package main.java.atividade06;

import main.java.atividade07.Tarefa;

import java.time.LocalDate;

public class TarefaRevisao extends Tarefa {

    private String autorOriginal;
    private int numeroLinhas;

    public TarefaRevisao(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, String autorOriginal, int numeroLinhas) {
        super(titulo, descricao, dataCriacao);
        this.autorOriginal = autorOriginal;
        this.numeroLinhas = numeroLinhas;
    }

    public String getAutorOriginal() {
        return autorOriginal;
    }

    public void setAutorOriginal(String autorOriginal) {
        this.autorOriginal = autorOriginal;
    }

    public int getNumeroLinhas() {
        return numeroLinhas;
    }

    public void setNumeroLinhas(int numeroLinhas) {
        this.numeroLinhas = numeroLinhas;
    }

    @Override
    public int calcularPrioridade() {
        return numeroLinhas / 100;
    }
}
