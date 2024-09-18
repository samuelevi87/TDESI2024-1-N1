package main.java.atividade01;

public class Desenvolvedor extends Funcionario{

    private String linguagemProgramacao;

    public Desenvolvedor(String nome, Double salarioBase, Integer identificador, String linguagemProgramacao) {
        super(nome, salarioBase, identificador);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    /**
     * Calcula o Salario total
     * @return retorna o salario
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() * 1.1;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }
}
