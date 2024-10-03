package main.java.atividade10;

import java.time.LocalDate;

public class Analista extends Funcionario{
private String especialidade;
private NivelSenioridade nivelSenioridade;
/**
 * Construtor da classe
 * nome do analista
 * cpf do analista
 * data de admissao do analista
 * salario base do analiosta
 * especialidade do analista
 * senioridade do analista
 */
    public Analista(String nome, String cpf, LocalDate dataAdmicao, Double salarioBase, String especialidade) {
        super(nome, cpf, dataAdmicao, salarioBase);
        this.especialidade = especialidade;
        this.nivelSenioridade = nivelSenioridade;
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

    @Override
   public Double calcularSalario() {
        return getSalarioBase() * (1 + nivelSenioridade.get.salarioBase());

    }
}
