package main.java.atividade10;
import java.time.LocalDate;

/***
 * Classe que representa um Vendedor, que é um tipo de funcionário.
 */
public class Vendedor extends Funcionario {
    private double comissao;
    private double vendasMensais;

    /***
     * Construtor que inicializa todos os atributos do vendedor.
     *
     * @param nome Nome do funcionário
     * @param cpf CPF do funcionário
     * @param dataAdmissao Data de admissão do funcionário
     * @param salarioBase Salário base do funcionário
     * @param comissao Comissão do vendedor
     * @param vendasMensais Vendas mensais do vendedor
     */
    public Vendedor(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, double comissao, double vendasMensais) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.comissao = comissao;
        this.vendasMensais = vendasMensais;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (comissao * vendasMensais);
    }

    // Getters e setters
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }
}
