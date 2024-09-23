package main.java.atividade01;

public abstract class Funcionario { private String nome;
    private int identificador;
    private double salarioBase;

    /**
     * Constrói um novo Funcionario.
     *
     * @param nome O nome do funcionário.
     * @param identificador O número de identificação único do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Funcionario(String nome, int identificador, double salarioBase) {
        this.nome = nome;
        this.identificador = identificador;
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salário total do funcionário.
     * Este método deve ser implementado por todas as subclasses.
     *
     * @return O salário total calculado.
     */
    public abstract double calcularSalarioTotal();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Retorna uma representação em string do funcionário.
     *
     * @return Uma string contendo o nome, identificador e salário base do funcionário.
     */
    @Override
    public String toString() {
        return "Funcionario: \n" +
                "Nome: " + nome + ", Identificador nº: " + identificador +
                ", Salário Base: R$ " + salarioBase;
    }
}

