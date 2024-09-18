package main.java.atividade01;

/**
 * Representa um Funcionario generico na empresa.
 * Esta clase serve como base todos os tipos de Funcionarios.
 */
public abstract class Funcionario {

    private String nome;
    private Integer indetificador;
    private Double salarioBase;

    /**
     *Constroi um novo funcionario.
     */
    public Funcionario(String nome, Integer indetificador, Double salarioBase){
        this.nome=nome;
        this.indetificador=indetificador;
        this.salarioBase=salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIndetificador() {
        return indetificador;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }


    /**
     * Calcula o salario total do funcionario.
     * esse metodos deve ser implementado por TODAS as subclasses.
     * @return O salario total calculado.
     */
    public abstract double calcularSalarioTotal();

    /**
     * Retorna a representação em String do Funcionario.
     * @return Uma String contendo  contendo
     */
    @Override
    public String toString() {
        return "Funcionario:\n" +
                "Nome:" + nome + '\'' +
                ", indetificador=" + indetificador
                +
                ", salarioBase= R$" +
                salarioBase;
    }
}
