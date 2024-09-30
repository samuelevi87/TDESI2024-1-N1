package main.java.atividade06;

import java.time.LocalDate;

public class TarefaRevisao extends Tarefa {
    private String autoOriginal;
    private Integer numeroLinhas;

    public TarefaRevisao(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, Status status, String autoOriginal, Integer numeroLinhas) {
        super(titulo, descricao, dataCriacao, dataLimite, status);
        this.autoOriginal = autoOriginal;
        this.numeroLinhas = numeroLinhas;
    }

    public String getAutoOriginal() {
        return autoOriginal;
    }

    public void setAutoOriginal(String autoOriginal) {
        this.autoOriginal = autoOriginal;
    }

    public Integer getNumeroLinhas() {
        return numeroLinhas;
    }

    public void setNumeroLinhas(Integer numeroLinhas) {
        this.numeroLinhas = numeroLinhas;
    }

    public TarefaRevisao(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, Status status) {
        super(titulo, descricao, dataCriacao, dataLimite, status);
    }

    public TarefaRevisao calcularPrioridade(){
        Integer prioridade = numeroLinhas/100 ;
                return calcularPrioridade();
    }
}
