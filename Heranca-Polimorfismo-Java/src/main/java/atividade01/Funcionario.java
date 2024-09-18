package main.java.atividade01;

/**
 * Representa um funcionário genérico na empresa
 * Esta classe serve para todos os tipos de funcionários
 */
public abstract class Funcionario {
    private String nome;
    private Integer id;
    private Double salarioBase;

    /**
     * Constroi um novo funcionario
     * @param nome nome do funcionário
     * @param id identificador do funcionários
     * @param salarioBase salário base do funcionário
     */
    public Funcionario(String nome, Integer id, Double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salario total do funcionário
     * Este método deve ser implementado por todas as subclasses
     * @return o salario total calculado
     */
    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Retorna a representação em string do funcionário
     * @return uma string contendo o nome, o id e o salario base do funcionário
     */
    @Override
    public String toString() {
        return "Funcionario:\n" +
                "nome: " + nome + '\'' +
                ", matricula: " + id +
                ", salario base: R$" + salarioBase +
                '}';
    }
}
