package main.java.atividade10;

import java.time.LocalDate;

public class Vendedor extends  Funcionario{
    private double comissao;
    private double vendasMensais;
    public Vendedor(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, double comissao, double vendasMensais) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.comissao = comissao;
        this.vendasMensais = vendasMensais;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (comissao * vendasMensais);
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
}
