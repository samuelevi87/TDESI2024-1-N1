package main.java.atividade01;

/**
 * Representa um analista de QA na empresa.
 * Estende a classe Funcionário e adiciona funcionalidades específicas para analistas de QA.
 */
public class AnalistaQA extends Funcionario {
    private Integer projetosTestados;

    /**
     * Constrói um analista de QA.
     *
     * @param nome             O nome do analista de QA.
     * @param identificador    O número identficador do analista de QA.
     * @param salarioBase      O salário base do analista de QA.
     * @param projetosTestados O número de testes realizados pelo analista de QA.
     */
    public AnalistaQA(String nome, Integer identificador, Double salarioBase, Integer projetosTestados) {
        super(nome, identificador, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    public Integer getProjetosTestados() {
        return projetosTestados;
    }

    public void setProjetosTestados(Integer projetosTestados) {
        this.projetosTestados = projetosTestados;
    }


    /**
     * Calcula o salário total do analista de QA.
     * O analista de QA recebe um adicional de 5% sobre o salário base, mais um bônus de R$ 100 por cada projeto testado.
     *
     * @return
     */
    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() * 1.05) + (projetosTestados * 100);
    }
}
