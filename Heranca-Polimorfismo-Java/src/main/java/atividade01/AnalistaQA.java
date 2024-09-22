package main.java.atividade01;

/**
 * Representa um AnalistaQA
 */
public class AnalistaQA extends Funcionario{
    private Integer projetosTestados;

    /**
     * constroi um AnalistaQA com :
     * @param nome
     * @param id
     * @param salarioBase
     * @param projetosTestados
     */
    public AnalistaQA(String nome, Integer id, Double salarioBase, Integer projetosTestados) {
        super(nome, id, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    /**
     * calcula o salario total do AnalaistaQA
     * @return o salario base com a porcentagem de 5% e o bonus de 100 reais por projetos testados
     */
    @Override
    public Double calcularSalario() {
        return getSalarioBase() * 1.05 + (100 * projetosTestados);
    }
}
