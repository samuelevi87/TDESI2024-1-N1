package main.java.atividade01;

public abstract class Funcionario {
    private String nome;
    private Double salarioBase;
    private Integer identificador;

    public Funcionario(String nome, Double salarioBase, Integer identificador) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    /**
     * Calcula o Salario final do funcionario
     * @return
     */
    public abstract double calcularSalarioTotal();

    /**
     * TO String que informa os valores em String
     * @return
     */
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome: '" + nome + '\'' +
                ", Salario Base: " + salarioBase +
                ", identificador: " + identificador +
                '}';
    }
}
