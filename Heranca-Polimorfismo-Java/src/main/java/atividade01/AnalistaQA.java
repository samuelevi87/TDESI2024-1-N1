package main.java.atividade01;

public class AnalistaQA extends Funcionario{
    private String linguagemProgramacao;
    private Integer projetoTestados;

    public AnalistaQA(String nome, Double salarioBase, Integer identificador, String linguagemProgramacao, Integer projetoTestados) {
        super(nome, salarioBase, identificador);
        this.linguagemProgramacao = linguagemProgramacao;
        this.projetoTestados = projetoTestados;
    }

    @Override
    public double calcularSalarioTotal() {
        return 0;
    }
}
