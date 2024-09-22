package main.java.atividade01;

/**
 * Representa um Desenvolvedor na empresa.
 * Estende a classe Funcionario e adiciona funcionalidades específicas do Desenvolvedor.
 */

public class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;

    /**
     * Constrói um Desenvolvedor.
     * @param nome O nome do Desenvolvedor.
     * @param id O número identificador do Desenvolvedor.
     * @param salarioBase O salário base do Desenvolvedor.
     * @param linguagemProgramacao A linguagem de programação do Desenvolvedor.
     */

    public Desenvolvedor(String nome, Integer id, Double salarioBase, String linguagemProgramacao) {
        super(nome, id, salarioBase);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }

    /**
     * Calcula o salário total do Desenvolvedor.
     * O Desenvolvedor recebe um bônus de 10% sobre o salário base.
     * @return O salário do Desenvolvedor.
     */

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.1;
    }
}
