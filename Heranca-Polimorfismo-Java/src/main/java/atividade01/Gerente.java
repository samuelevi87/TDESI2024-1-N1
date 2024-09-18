package main.java.atividade01;

/**
 * Representa um gerente na empresa
 * Estende a classe funcionario e adiciona funcionalidades especificas
 */
public class Gerente extends Funcionario{

    private Double bonusAnual;

    /**
     * Constroi um gerente
     * @param nome nome do gerente
     * @param id identificador do gerente
     * @param salarioBase salario base do gerente
     * @param bonusAnual bonus recebido anualmente
     */
    public Gerente(String nome, Integer id, Double salarioBase, double bonusAnual) {
        super(nome, id, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (bonusAnual / 12);
    }
}
