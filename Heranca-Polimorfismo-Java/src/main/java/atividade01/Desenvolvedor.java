package main.java.atividade01;

/**
 * Representa um desenvolvedor na empresa
 * Estende a classe funcionario e adiciona funcionalidades especificas
 */
public class Desenvolvedor extends Funcionario{

    private String linguagemProgramacao;

    /**
     * Constroi um desenvolvedor
     * @param nome nome do desenvolvedor
     * @param id identificador do desenvolvedor
     * @param salarioBase salario base do desenvolvedor
     * @param linguagemProgramacao linguagem de programação principal que o Desenvolvedor utiliza
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
     * Calcula o salário total do desenvolvedor
     * O desenvolvedor recebe um bonus de 10% sobre o salário base
     * @return o salario total do Desenvolvedor
     */
    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.1;
    }
}
