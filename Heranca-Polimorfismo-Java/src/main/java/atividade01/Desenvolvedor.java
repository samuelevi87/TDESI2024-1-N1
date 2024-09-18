package main.java.atividade01;

/**
 * Representa um desenvolvedor na empresa
 * EStende
 */

public class Desenvolvedor extends Funcionario{

    private  String linguagemProgramador;

    /**
     * Constrói um desenvolvedor.
     * @param nome O nome do desenvolvedor.
     * @param id Onúmero identificação do Desenvolvedor.
     * @param salarioBase O salário base do Desenvolvedor.
     * @param linguagemProgramador a linguagem de programação principal
     * que o Desenvolvedor utiliza.
     */

    public Desenvolvedor(String nome, int id, double salarioBase, String linguagemProgramador) {
        super(nome, id, salarioBase);
        this.linguagemProgramador = linguagemProgramador;
    }

    /**
     * Calcula o salário total do desenvolvedor.
     * O desenvolvedor recebe um bônus de 10% sobre o
     * salário base.
     * @return O salário total do Desenvolvedor.
     */

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.1;
    }

    public String getLinguagemProgramador() {
        return linguagemProgramador;
    }

    public void setLinguagemProgramador(String linguagemProgramador) {
        this.linguagemProgramador = linguagemProgramador;
    }
}
