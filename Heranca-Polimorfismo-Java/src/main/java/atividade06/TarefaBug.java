package main.java.atividade06;

import java.time.LocalDate;

public class TarefaBug extends Tarefa {
    private Severidade severidade ;
    private String plataforma;

    public enum Severidade{
        BAIXA,
        MEDIA,
        ALTA,
        CRITICA
    }




    public TarefaBug(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, Status status) {
        super(titulo, descricao, dataCriacao, dataLimite, status);
    }

public  TarefaBug calcularPrioridade(){
        Integer prioridade = severidade
}
}
