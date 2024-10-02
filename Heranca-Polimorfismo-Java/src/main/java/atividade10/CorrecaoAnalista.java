package main.java.atividade10;

import java.time.LocalDate;

/**
 * Classe que representa um Analista.
 */
public class CorrecaoAnalista extends CorrecaoFuncionario {
    private String especialidade;
    private CorrecaoNivelSenioridade nivelSenioridade;

    /**
     * Construtor para a classe Analista.
     *
     * @param nome             O nome do analista.
     * @param cpf              O CPF do analista.
     * @param dataAdmissao     A data de admissão do analista.
     * @param salarioBase      O salário base do analista.
     * @param especialidade    A especialidade do analista.
     * @param nivelSenioridade O nível de senioridade do analista.
     */
    public CorrecaoAnalista(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String especialidade, CorrecaoNivelSenioridade nivelSenioridade) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.especialidade = especialidade;
        this.nivelSenioridade = nivelSenioridade;
    }

    // Getters e setters específicos
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public CorrecaoNivelSenioridade getNivelSenioridade() {
        return nivelSenioridade;
    }

    public void setNivelSenioridade(CorrecaoNivelSenioridade nivelSenioridade) {
        this.nivelSenioridade = nivelSenioridade;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + nivelSenioridade.getValor());
    }
}