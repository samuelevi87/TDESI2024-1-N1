package main.java.atividade01;

/**
 * Representa um funcionágio genérico da empresa
 * Esta classe serve como base para todos os tipos de funcionarios
 */

public abstract class Funcionario {
    private String nome;
    private Integer id;
    private Double salarioBase;

    /**
     * Constrói um Funcionário
     * Inicializa um funcionário
     * @param nome O nome do funcionário
     * @param id O id do funcionário
     * @param salarioBase O salário do funcionário
     */

    public Funcionario(String nome, Integer id, Double salarioBase) {
        this.nome = nome;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Calcular o salário total do funcionário.
     * Este método deve ser implemento por TODAS as subclasses.
     *
     * @return O salário total calculado.
     */

    public abstract double calcularSalarioTotal();

    /**
     * Retorna a representação em String do funcionário.
     *
     * @return Uma String contendo o nome, id e salario base do funcionário.
     */

    @Override
    public String toString() {
        return "Funcionario: \nNome: " + nome + '\'' +
                ", Matrúcula: " + id +
                ", Salario base R$: " + salarioBase + "\n";
    }


}
