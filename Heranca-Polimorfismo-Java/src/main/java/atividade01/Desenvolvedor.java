package main.java.atividade01;

public class Desenvolvedor extends Funcionario{

    private String linguagemDeProgramacao;

    /**
     * Constrói um novo Desenvolvedor.
     *
     * @param nome          O nome do desenvolvedor.
     * @param identificador A matricula do desenvolvedor.
     * @param salarioBase   O salário base do desenvolvedor.
     * @param linguagem     A linguagem de programação que o desenvolvedor utiliza.
     */
    public Desenvolvedor(String nome, Integer identificador, Double salarioBase, String linguagem) {
        super(nome, identificador, salarioBase);
        this.linguagemDeProgramacao = linguagem;
    }

    public String getLinguagemDeProgramacao() {
        return linguagemDeProgramacao;
    }

    public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
        this.linguagemDeProgramacao = linguagemDeProgramacao;
    }

    /**
     * Calcula o salário do desenvolvedor da empresa, retornando a soma do salario base mais 10%
     * @return O salário calculado do desenvolvedor.
     */
    @Override
    public double calcularSalarioTotal() {
        return this.getSalarioBase() * 1.1;
    }
}
