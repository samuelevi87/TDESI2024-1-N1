package main.java.atividade01;

/**
 * Representa um funcionario generico na empresa.
 * esta classe serve como base para todos os tipos de funcionários.
 */
public abstract class Funcionario {
    private String nome;
    private Integer identificador;
    private Double salarioBase;

    public Funcionario(String nome, Integer identificador, Double salarioBase) {
        this.nome = nome;
        this.identificador = identificador;
        this.salarioBase = salarioBase;
    }

    /**
     * controi um novo funcionario.
     *
     */
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
     * calcula salario total do funcionario.
     * este metodo deve ser implementado por todas as subclasses
     * @return o salario total
     */
    public abstract double calcularSalarioTotal();

    /**
     * retorna representação do funcionario.
     * @return uma string contendo
     */
    @Override
    public String toString() {
        return "Funcionario: " +
                "nome: " + nome + '\'' +
                ", identificador: " + identificador +
                ", salarioBase: " + salarioBase +
                '}';
    }
}
