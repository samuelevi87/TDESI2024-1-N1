package main.java.atividade01;

public class AnalistaQA  extends Funcionario{

    private Integer projetosTestados;

    /**
     * Constrói um novo funcionário.
     *
     * @param nome        Nome do AnalistaQA.
     * @param id          Identificador do AnalistaQA.
     * @param salarioBase Salário base do AnalistaQA.
     */
    public AnalistaQA(String nome, Integer id, Double salarioBase, Integer projetosTestados) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }


    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() * 1.05) + (projetosTestados * 100);
    }
}
