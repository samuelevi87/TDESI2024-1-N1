package main.java.atividade10;

import java.time.LocalDate;

public class Analista extends Funcionario{
    private String especialidade;
    private NivelSenioridade nivelSenioridade;

    public enum NivelSenioridade {
        JUNIOR(0.1), PLENO(0.2), SENIOR(0.3);

        private final Double valor;

        NivelSenioridade(Double valor) {
            this.valor = valor;
        }

        public Double getValor() {
            return valor;
        }
    }

    public Analista(String nome, String cpf, LocalDate dataAdmissao, Double salarioBase, String especialidade, NivelSenioridade nivelSenioridade) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.especialidade = especialidade;
        this.nivelSenioridade = nivelSenioridade;
    }

    @Override
    public Double calcularSalario() {
        return getSalarioBase() * (1 + nivelSenioridade.getValor());
    }
}
