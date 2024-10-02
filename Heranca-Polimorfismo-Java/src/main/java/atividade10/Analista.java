package main.java.atividade10;

import java.time.LocalDate;

public class Analista extends Funcionario {
    private String especialidade;
    private NivelSenioridade nivelSenioridade;

    public Analista(String nome, String cpf, LocalDate dataAdmissao, Double salarioBase, String especialidade, NivelSenioridade nivelSenioridade) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.especialidade = especialidade;
        this.nivelSenioridade = nivelSenioridade;
    }

    @Override
    public double calcularSalario() {
        return 0; // salarioBase * (1 + nivelSenioridade.valor);
    }
}
