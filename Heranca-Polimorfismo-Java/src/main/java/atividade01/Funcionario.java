package main.java.atividade01;

/**
 * Representa um funcionário genéricona empresa.
 * Esta classe serve como base para todos os tipos de funcionários.
 */
public abstract class Funcionario {
    private String nome;
    private Integer id;
    private Double salarioBase;

    /**
     * Constrói um novo funcionário.
     * @param nome O nome do funcionário.
     * @param id O número de identificação do funcionário.
     * @param salarioBase O salário base do funcionário.
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
     * Calcula o salário total do funcionário.
     * Este método deve ser implementado por TODAS as subclasses.
     * @return O salário total calculado.
     */
    public abstract Double calcularSalario();

    /**
     * Retorna a representação em string do funcionário.
     * @return Uma string contendo o nome, o identificador e o salário base do funcionário.
     */
    @Override
    public String toString() {
        return "Funcionario: " +
                "\n\nNome= '" + nome + '\'' +
                "\nMatrícula= " + id +
                "\nSalário base= R$ " + salarioBase +
                "\nSalário total= R$ " + calcularSalario();
    }
}
