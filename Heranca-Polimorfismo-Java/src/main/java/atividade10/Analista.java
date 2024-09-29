package main.java.atividade10;
import java.time.LocalDate;

public class Analista extends Funcionario {
    public enum NivelSenioridade {
        JUNIOR(0.1), PLENO(0.2), SENIOR(0.3);

        private double valor;

        NivelSenioridade(double valor) {
            this.valor = valor;
        }
    }

    private String especialidade;
    private NivelSenioridade nivelSenioridade;

    /***
     * Construtor que inicializa todos os atributos do analista.
     *
     * @param nome Nome do funcionário
     * @param cpf CPF do funcionário
     * @param dataAdmissao Data de admissão do funcionário
     * @param salarioBase Salário base do funcionário
     * @param especialidade Especialidade do analista
     * @param nivelSenioridade Nível de senioridade do analista
     */
    public Analista(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String especialidade, NivelSenioridade nivelSenioridade) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.especialidade = especialidade;
        this.nivelSenioridade = nivelSenioridade;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + nivelSenioridade.valor);
    }

    // Getters e setters
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
