package main.java.atividade01;

/**
 * Representa um desenvolvedor na empresa
 */
public class Desenvolvedor extends Funcionario {

    private String linguagemProgramacao;

    /**
     * Constroi um desenvolvedor.
     * @param nome        O nome do desenvolvedor
     * @param id o numero identificador do desenvolvedor.
     * @param salarioBase O salario base do desenvolvedor.
     */
    public Desenvolvedor(String nome, int id, double salarioBase) {
        super(nome, id, salarioBase);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    /**
     * calcula o salario total do desenvolvedor.
     * o desenvolvedor recebe um bonus de 10% sobre o salario base
     * @return O salario total do desenvolvedor
     */

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() * 1.1;
    }

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }
}
