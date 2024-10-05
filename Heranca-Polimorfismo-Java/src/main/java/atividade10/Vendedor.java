package main.java.atividade10;

import java.time.LocalDate;

/**
 * Classe que representa um vendedor.
 */
public class Vendedor extends Funcionario {
    private  double comissao;
    private double vendasMensais;

    /**
     * Construtor para a classe Vendedor.
     *
     * @param nome          O nome do vendedor.
     * @param cpf           O CPF do vendedor.
     * @param dataAdmissao  A data de admissão do vendedor.
     * @param salarioBase   O salário base do vendedor.
     * @param comissao      A comissão do vendedor.
     * @param vendasMensais As vendas mensais do vendedor.
     */
    public Vendedor(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, double comissao, double vendasMensais) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.comissao = comissao;
        this.vendasMensais = vendasMensais;
    }

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

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (comissao * vendasMensais); }
    }
}
