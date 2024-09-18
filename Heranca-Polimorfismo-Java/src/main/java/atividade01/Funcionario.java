package main.java.atividade01;

/**
 * Representa um funcionario generico na empresa.
 * Esta classe serve como base para todos os tipos de funcionarios.
 */

public abstract class Funcionario {

    private String nome;
    private Integer identificador;
    private Double salarioBase;

    /**
     * Constroi um novo Funcionario.
     * @param nome O nome do Funcionario
     * @param id
     * @param salarioBase
     */

    public Funcionario(String nome, int id, double salarioBase) {
        this.nome = nome;
        this.identificador= id;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return identificador  ;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.identificador = id;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * Calcula o salario total do funcionario.
     * Este metodo deve ser implementado poir  TODAS as subclasses.
     * @return O salario total calculado.
     */

    public abstract double calcularSalarioTotal();

    /**
     * Retorna a representaçao rm string do funcionario.
     * @return Uma String contendo o nome
     * Identificador
     */
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome:'" + nome +
                ", matricula:" + identificador +
                ", Salario base: R$" + salarioBase +
                '}';
    }
}
