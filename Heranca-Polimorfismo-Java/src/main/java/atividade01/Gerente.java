package main.java.atividade01;

/**
 * representa o gerente.
 */
public class Gerente extends Funcionario{
    private Double bonusAnual;

    /**
     * constroi o gerente
     * @param nome nome do gerente
     * @param identificador id do gerente
     * @param salarioBase salario base do gerente
     * @param bonusAnual bonus de
     */
    public Gerente(String nome, Integer identificador, Double salarioBase, Double bonusAnual) {
        super(nome, identificador, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    /**
     * calcula salario total do gerente
     * salsrio base mais bonus anual
     * @return o salario total calculado
     */
    @Override
    public double calcularSalarioTotal() {
        return getSalarioBase() + (bonusAnual/12);
    }
}
