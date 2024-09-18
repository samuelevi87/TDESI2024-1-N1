package main.java.atividade01;

/**
 * Representa um desenvolvedor.
 * Estende a classe Funcionario e adiciona funcionalidades específicas.
 */
public class Desenvolvedor extends Funcionario {

    private String linguagemProgramacao;

    /**
     * Constrói um desenvolvedor.
     *
     * @param nome                 O nome do desenvolvedor.
     * @param id                   O número identificador do desenvolvedor.
     * @param salarioBase          O salário base do desenvolvedor.
     * @param linguagemProgramacao A linguagem de programação principal que o desenvolvedor utiliza.
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
     * Calcula o salário total do desenvolvedor.
     * O desenvolvedor recebe um bônus de 10% sobre salário base.
     *
     * @return O salário total.
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() * 1.1;
    }
}

