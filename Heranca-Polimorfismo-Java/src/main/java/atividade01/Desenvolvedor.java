package main.java.atividade01;

/**
 *
 */

public class Desenvolvedor extends  Funcionario {

    private String linguagemProgramacao;

    /**
     * Constroi um desenvolvedor
     * @param nome   O nome do desenvolvedor
     * @param indentificador    o número  indenficador do Desenvolvedor
     * @param salarioBase o salário base do Desenvolvedor
     * @param linguagemProgramacao  a linguagem de programação principal que o desenvolvedor utiliza.
     */
    public Desenvolvedor(String nome, Integer indentificador, double salarioBase, String linguagemProgramacao) {
        super(nome, indentificador, salarioBase);
        this.linguagemProgramacao = linguagemProgramacao;

    }

    /**
     * Calcula o salário total do desenvolvedor.
     * O desenvolvedor recebe um bonus de 10% sobre o salário base.
     * @return  O salário total do desenvolvedor.
     */

    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase()  * 1.1;
    }

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }
}
