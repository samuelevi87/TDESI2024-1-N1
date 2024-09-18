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
     * Constrói um novo Funcionario.
     * @param nome O nome do Funcionario.
     * @param id O número identificador do Funcionario.
     * @param salarioBase O salário base do Funcionario.
     */

    public Funcionario(String nome, int id, double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salário do Funcionario.
     * Esse método deve ser aplicado em todas as subclasses.
     * @return O salário total do Funcionario.
     */

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Retorna a representação em string do funcionário.
     * @return uma string contendo o nome, id e o salario base do funcionário.
     */

    @Override
    public String toString() {
        return "Funcionario: " +
                "nome: " + nome + '\'' +
                ", id: " + id +
                ", salarioBase: " + salarioBase +
                '}';
    }
}
