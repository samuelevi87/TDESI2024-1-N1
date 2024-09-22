package main.java.atividade01;

/**
 * representa um funcionario generico na empresa
 * essa classe serve base para todos os tipos de funcionarios
 */
public abstract class Funcionario {
    private String nome ;
    private Integer id ;
    private Double salarioBase;

    /**
     * controi um novo funcionario
     * @param nome
     * @param id
     * @param salarioBase
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
     * calcula o salario total do funcionario
     * esse metodo deve ser implementado por todas as classes
     * @param
     */
    public abstract Double calcularSalario() ;

    /**
     * Retorna a reprentcacao em String do funcionario
     * @return um String contendo nome, id, salario base do funcionario
     */
     @Override
    public String toString(){
         return "Funcionario : " + "\n" +
                 "nome : " +nome + "\n" +
                 " id  : " + id + "\n"+
                 " salario : " + salarioBase ;
     }

}
