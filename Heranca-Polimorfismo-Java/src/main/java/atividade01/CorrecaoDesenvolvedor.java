package main.java.atividade01;

/**
 * Representa um desenvolvedor na empresa.
 * Estende a classe Funcionario e adiciona funcionalidades específicas para desenvolvedores.
 */
public class CorrecaoDesenvolvedor extends CorrecaoFuncionario {
    private String linguagemPrincipal;

    /**
     * Constrói um novo Desenvolvedor.
     *
     * @param nome O nome do desenvolvedor.
     * @param identificador O número de identificação único do desenvolvedor.
     * @param salarioBase O salário base do desenvolvedor.
     * @param linguagemPrincipal A linguagem de programação principal do desenvolvedor.
     */
    public CorrecaoDesenvolvedor(String nome, int identificador, double salarioBase, String linguagemPrincipal) {
        super(nome, identificador, salarioBase);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    /**
     * Calcula o salário total do desenvolvedor.
     * O desenvolvedor recebe um bônus de 10% sobre o salário base.
     *
     * @return O salário total calculado.
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() * 1.1;
    }

    /**
     * Retorna a linguagem de programação principal, usada pelo Desenvolvedor.
     * @return Uma String contendo o nome da linguagem de programação.
     */
    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    /**
     * Define a linguagem de programação principal, usada pelo Desenvolvedor.
     * @param linguagemPrincipal String com o nome da linguagem de programação.
     */
    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
}
