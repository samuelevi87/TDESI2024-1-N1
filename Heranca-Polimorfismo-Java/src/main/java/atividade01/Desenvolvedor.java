package main.java.atividade01;

/**
 */
public class Desenvolvedor extends  Funcionario{
    private String linguagemDeProgramaçao;

    /**
     * constroi dev
     * @param nome nome do dev
     * @param identificador id do dev
     * @param salarioBase salario base do dev
     * @param linguagemDeProgramaçao principal linguagem de programação do dev
     */
    public Desenvolvedor(String nome, Integer identificador, Double salarioBase, String linguagemDeProgramaçao) {
        super(nome, identificador, salarioBase);
        this.linguagemDeProgramaçao = linguagemDeProgramaçao;
    }

    /**
     * calcula salario total do dev.
     * dev recebe bonus de 10%
     * @return o salario base
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() * 1.1;
    }

    public String getLinguagemDeProgramaçao() {
        return linguagemDeProgramaçao;
    }

    public void setLinguagemDeProgramaçao(String linguagemDeProgramaçao) {
        this.linguagemDeProgramaçao = linguagemDeProgramaçao;
    }
}
