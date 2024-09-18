package main.java.atividade01;

/**
 * Representa um funcionário genérico na empresa.
 * Esta classe serve como base para todos os tipos de funcionários.
 */
public abstract class Funcionario {
    private String nome;
    private Integer identificador;
    private Double salarioBase;

    /**
     * Constrói um novo Funcionário.
     * @param nome O nome do funcionário.
     * @param identificador O número de indentificação do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Funcionario(String nome, Integer identificador, Double salarioBase) {
        this.nome = nome;
        this.identificador = identificador;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salário total do funcionário.
     * Este método deve ser implementado por TODAS as subclasses.
     * @return O salário total calculado.
     */
    public abstract double calcularSalarioTotal();

    /**
     * Retorna a representação em string do funcionário.
     * @return Uma string contendo o nome, o identificador e o salário base do funcionário.
     */
    @Override
    public String toString() {
        return "Funcionario:\n" +
                "Nome: " + nome +
                ", matrícula: " + identificador +
                ", Salário base: R$ " + salarioBase;
    }
}
