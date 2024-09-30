package main.java.atividade06;


import java.time.LocalDate;

public class TarefaDesenvolvimento extends Tarefa {
    private String linguagemDeProgramcaco;
    private Integer complexidade;

    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, Status status, String linguagemDeProgramcaco, Integer complexidade) {
        super(titulo, descricao, dataCriacao, dataLimite, status);
        this.linguagemDeProgramcaco = linguagemDeProgramcaco;
        this.complexidade = complexidade;
    }

    public String getLinguagemDeProgramcaco() {
        return linguagemDeProgramcaco;
    }

    public void setLinguagemDeProgramcaco(String linguagemDeProgramcaco) {
        this.linguagemDeProgramcaco = linguagemDeProgramcaco;
    }

    public Integer getComplexidade() {
        return complexidade;
    }

    public void setComplexidade(Integer complexidade) {
        if (complexidade>=1 && complexidade<=5){
            this.complexidade = complexidade;
        }else {
            throw new IllegalArgumentException("A complexidade tem que estar entre 1-5");
        }
    }

    public TarefaDesenvolvimento(String titulo, String descricao, LocalDate dataCriacao, LocalDate dataLimite, Status status) {
        super(titulo, descricao, dataCriacao, dataLimite, status);
    }

    public TarefaDesenvolvimento calcularPrioridade(){
        Integer prioridade = complexidade * 2 ;

        return calcularPrioridade();
    }
}
