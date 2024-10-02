package main.java.atividade10;

import java.time.LocalDate;

public class Vendedor extends Funcionario {
    private Double comissao;
    private Double vendasMensais;

    public Vendedor(String nome, String cpf, LocalDate dataAdmissao, Double salarioBase, Double comissao, Double vendasMensais) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.comissao = comissao;
        this.vendasMensais = vendasMensais;
    }
}
