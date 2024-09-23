package main.java.atividade01;

/**
 * Represnta um desenvolvedor da empresa
 * entende a classe
 */
public class Desenvolvedor extends Funcionario {

    private String linguagemDeProgramação;

    /**
     * constroi um desenvolvedor.
     * @param nome o nome do desenvolvedor.
     * @param indetificador ID do desenvolvolvedor
     * @param salarioBase salario base do desenvolvedor
     * @return
     */
    public Desenvolvedor(String nome, Integer indetificador, Double salarioBase, String linguagemDeProgramação) {
        super(nome, indetificador, salarioBase);
        this.linguagemDeProgramação = linguagemDeProgramação;
    }
    /**
     * calcula o salario total do desenvolvedor
     * o desenvolvedor recebe um bonus de 10% sobre o salario base
     * @return o salario total do desenvolvedor.
     *
     */

    public String getLinguagemDeProgramação() {
        return linguagemDeProgramação;
    }

    public void setLinguagemDeProgramação(String linguagemDeProgramação) {
        this.linguagemDeProgramação = linguagemDeProgramação;
    }
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() * 1.1;
    }
}
