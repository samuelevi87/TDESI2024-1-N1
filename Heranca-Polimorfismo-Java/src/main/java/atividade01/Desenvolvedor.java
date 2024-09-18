package main.java.atividade01;

/**
 * Representa um desenvolvedor na empresa
 * Estende a classe Funcionário e adiciona funcionalidades específicas para desenvolvedores.
 */
public class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;

    /**
     * Constrói um desenvolvedor.
     * @param nome O nome do desenvolvedor.
     * @param identificador O número identficador do Desenvolvedor.
     * @param salarioBase O salário base do Desenvolvedor.
     * @param linguagemProgramacao a linguagem de programação principal que o Desenvolvedor utiliza.
     */
    public Desenvolvedor(String nome, Integer identificador, Double salarioBase, String linguagemProgramacao) {
        super(nome, identificador, salarioBase);
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
     * O desenvolvedor recebe um bônus de 10% sobre o salário base.
     * @return O salário total do Desenvolvedor.
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() * 1.1;
    }

}
