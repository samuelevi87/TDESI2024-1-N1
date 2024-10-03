public class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;

    public Desenvolvedor(String nome, int id, double salarioBase, String linguagemProgramacao) {
        super(nome, id, salarioBase);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.10;
    }
}

