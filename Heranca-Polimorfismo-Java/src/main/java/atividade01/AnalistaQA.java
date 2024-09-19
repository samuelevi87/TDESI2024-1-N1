package main.java.atividade01;

/**
 * Representa um AnalistaQA, com métodos e atributos padrões de Funcionario
 */

public class AnalistaQA extends Funcionario{

    private Integer projetosTestados;

    public AnalistaQA(String nome, Integer id, Double salarioBase, Integer projetosTestados) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    public Integer getProjetosTestados() {
        return projetosTestados;
    }

    public void setProjetosTestados(Integer projetosTestados) {
        this.projetosTestados = projetosTestados;
    }

    /**
     * Calcula o salario total do analista de QA
     * O anilista de QA recebe um adicional de 5% sobre o salario base,
     * mais um bônus de R$100,00 por cada projeto testado.
     * @return
     */

    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() * 1.05) + projetosTestados * 100;
    }
}
