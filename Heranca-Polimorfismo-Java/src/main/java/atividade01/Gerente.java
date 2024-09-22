package main.java.atividade01;

/**
 * Represnete um Gerente na empresa
 */
public class Gerente extends Funcionario{
  private Double bonusAnual;

    /**
     * constroi um Gerente com:
     * @param nome
     * @param id
     * @param salarioBase
     * @param bonusAnual
     */
    public Gerente(String nome, Integer id, Double salarioBase, Double bonusAnual) {
        super(nome, id, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    /**
     * calcula o salario total do Gerente
     * @return o salario com o bonus anual
     */
    @Override
    public Double calcularSalario() {
        return getSalarioBase() + (bonusAnual/12);
    }
}
