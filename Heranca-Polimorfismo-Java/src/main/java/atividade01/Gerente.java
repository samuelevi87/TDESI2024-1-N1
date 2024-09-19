package main.java.atividade01;

public class Gerente extends Funcionario{

    private Double bonusAnual;

    /**
     * Constrói um novo gerente.
     *
     * @param nome        Nome do gerente.
     * @param id          Identificador do gerente.
     * @param salarioBase Salário base do gerente.
     * @param bonusAnual  Bônus que o gerente ganhará anualmente.
     */
    public Gerente(String nome, Integer id, Double salarioBase, Double bonusAnual) {
        super(nome, id, salarioBase);
        this.bonusAnual = bonusAnual;

    }

    /**
     * Calcula o salário total do Gerente.
     * O gerente recebe um bônus anual sobre o salário base.
     * @return O valor total.
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (bonusAnual / 12);
    }

}
