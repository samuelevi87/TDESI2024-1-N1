package main.java.atividade01;

public class Gerente extends Funcionario{

    private Double bonusAnual;

    /**
     * Constrói um novo Gerente.
     *
     * @param nome          O nome do Gerente.
     * @param identificador A matricula do Gerente.
     * @param salarioBase   O salário base do Gerente.
     * @param bonus         O bonus que do Gerente.
     */
    public Gerente(String nome, Integer identificador, Double salarioBase, Double bonus) {
        super(nome, identificador, salarioBase);
    }

    public Double getBonus() {
        return bonusAnual;
    }

    public void setBonus(Double bonus) {
        this.bonusAnual = bonus;
    }

    /**
     * Calcula o salário do Gerente somando o salário base a parte equivalente(1/12) do
     * bonus que é Anual.
     *
     * @return O salario calculado do Gerente.
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (bonusAnual/12);
    }
}
