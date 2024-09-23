package main.java.atividade01;

public class Gerente {extends CorrecaoFuncionario {
    private double bonusAnual;

    /**
     * Constrói um novo Gerente.
     *
     * @param nome O nome do gerente.
     * @param identificador O número de identificação único do gerente.
     * @param salarioBase O salário base do gerente.
     * @param bonusAnual O bônus anual do gerente.
     */
    public Gerente(String nome, int identificador, double salarioBase, double bonusAnual) {
        super(nome, identificador, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    /**
     * Calcula o salário total do gerente.
     * O gerente recebe seu salário base mais o bônus anual dividido por 12 (meses).
     *
     * @return O salário total calculado.
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (bonusAnual / 12);
    }

    /**
     * Obtém o valor do Bônus Anual do Gerente.
     * @return bonusAnual O valor double do Bônus Anual.
     */
    public double getBonusAnual() {
        return bonusAnual;
    }

    /**
     * Define o valor do Bônus Anual do Gerente.
     * @param bonusAnual Valor double do valor do Bônus Anual do Gerente.
     */
    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
}

