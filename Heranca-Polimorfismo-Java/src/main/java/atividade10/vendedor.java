package main.java.atividade10;

import java.time.LocalDate;

public class vendedor extends Funcionario{
    private Double comissao;
    private Double vendasMensais;
    /**
     * Construtor vendedor
     * nome do vendedor
     * cpf do vedendor
     * data admissao do vendedor
     * salario base do vendedor
     * comissao do vedendor
     * vendas mensais do vendedor
     */
    public vendedor(String nome, String cpf, LocalDate dataAdmicao, Double salarioBase, Double comissao) {
        super(nome, cpf, dataAdmicao, salarioBase);
        this.comissao = comissao;
        this.vendasMensais = vendasMensais;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public Double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(Double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }
    @Override
    public Double calcularSalario() {
        return getSalarioBase() + (comissao * vendasMensais);

    }
}
