package main.java.atividade10;

import java.time.LocalDate;

public class Analista extends Funcionario{

    private String especialidade;
    private  NivelSenioridade nivelSenioridade;
    public enum NivelSenioridade{
        JUNIOR(0.1), PLENO(0.2), SENIOR(0.3);
        private final double valor;

        NivelSenioridade(double valor) {
            this.valor = valor;
        }

        public double getValor() {
            return valor;
        }
    }
    public Analista(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String especialidade, NivelSenioridade nivelSenioridade) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.especialidade = especialidade;
        this.nivelSenioridade = nivelSenioridade;
    }
    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + nivelSenioridade.valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public NivelSenioridade getNivelSenioridade() {
        return nivelSenioridade;
    }

    public void setNivelSenioridade(NivelSenioridade nivelSenioridade) {
        this.nivelSenioridade = nivelSenioridade;
    }
}
