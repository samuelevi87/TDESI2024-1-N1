package main.java.atividade01;

public class Desenvolvedor extends Funcionario {

    /**
     * Representa um desenvolvedor, com métodos e atributos padrões do Funcionario
     */

    private String linguagemProgramação;

    /**
     * Constrói um desenvolvedor
     * Inicializa um desenvolvedor
     * @param nome O nome do desenvovedor
     * @param id O id do desenvolvedor
     * @param salarioBase O salario base do desenvolvedor
     * @param linguagemProgramação A linguagem de programção do desenvolvedor
     */

    public Desenvolvedor(String nome, Integer id, Double salarioBase, String linguagemProgramação) {
        super(nome, id, salarioBase);
        this.linguagemProgramação = linguagemProgramação;
    }

    public String getLinguagemProgramação() {
        return linguagemProgramação;
    }

    public void setLinguagemProgramação(String linguagemProgramação) {
        this.linguagemProgramação = linguagemProgramação;
    }

    /**
     * Calcula o salário total do desenvolvedor
     * O desenvolvedor recebe um bônus de 10% sobre o salário base.
     * @return Salário total do desenvolvedor
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() * 1.1;
    }

}
