package main.java.atividade01;

/**
 * Representa um funcionário genérico na empresa.
 * Esta classe serve como base para todos os tipos de funcionários.
 */
public abstract class Funcionario {

    private String nome;

    private Integer id;

    private Double salarioBase;

    /**
     * Constrói um novo funcionário.
     * @param nome Nome do funcionário.
     * @param id Identificador do funcionário.
     * @param salarioBase Salário base do funcionário.
     */
    public Funcionario(String nome, Integer id, Double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salário total dos Funcionários.
     * Este método deve ser implementado por todas as subclasses.
     * @return O salário total claculado.
     */
    public abstract double calcularSalarioTotal();

    /**
     * Retorna a representação em string do funcionário
     * @return Uma string contendo o nome, o identifcador e o salário base do funionáro.
     */
    @Override
    public String toString() {
        return "Funcionario:" +
                "Nome: " + nome + '\'' +
                ", matrícula:" + id +
                ", salário base: R$ " + salarioBase;
    }
}
