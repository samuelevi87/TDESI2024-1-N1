package main.java.atividade01;

/**
 * Representa um gerente na empresa.
 * Estende a classe Funcionário e adiciona funcionalidades específicas para gerentes.
 */
public class Gerente extends Funcionario{
    private Double bonusAnual;

    /**
     * Constrói um gerente.
     * @param nome O nome do gerente.
     * @param identificador O número identficador do gerente.
     * @param salarioBase O salário base do gerente.
     * @param bonusAnual O bônus anual do gerente.
     */
    public Gerente(String nome, Integer identificador, Double salarioBase, Double bonusAnual) {
        super(nome, identificador, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    public Double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(Double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }


    /**
     * Calcula o salário total do gerente.
     * O gerente recebe seu salário base mais o bônus anual dividido por 12 (meses)
     * @return O salário total calculado.
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (bonusAnual/12);
    }
}
