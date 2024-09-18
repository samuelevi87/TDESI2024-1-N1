package main.java.atividade01;

/**
 * Representa um funcionario genérico na empresa.
 * Está classe serve com base para todos os tipos de funcionários.
 */

public abstract class Funcionario {

    private String nome;
    private Integer indentificador;
    private Double salarioBase;

    public Funcionario(String nome, Integer indentificador, double salarioBase) {
        this.nome = nome;
        this.indentificador = indentificador;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(Integer indentificador) {
        this.indentificador = indentificador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salário total do funcionário.
     * Este método deve ser implementado por
     * TODAS as subclases.
     * @return o salário total calculado
     */
    public abstract  double calcularSalarioTotal () ;

    /**
     * Retora a representação em string do funcionário.
     * @return Uma string contendo o nome, o
     * indentificador e o salário base do funcionario.
     */
    @Override
    public String toString() {
        return "Funcionario: " +
                "Nome: " + nome +
                "Matricula: " + indentificador +
                "Salário base: R$  " + salarioBase ;
    }
}
