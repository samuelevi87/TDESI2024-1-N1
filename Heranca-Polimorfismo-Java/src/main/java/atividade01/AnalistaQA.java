package main.java.atividade01;

/**
 * represnta analista QA na empresa
 */
public class AnalistaQA extends Funcionario{

    private Integer projetosTestados;
    /**
     * constroi um desenvolvedor.
     * @param nome o nome do analista
     * @param indetificador ID do analista
     * @param salarioBase salario base do analista
    */
    public AnalistaQA(String nome, Integer indetificador, Double salarioBase, Integer projetosTestados) {
        super(nome, indetificador, salarioBase);
        this.projetosTestados = projetosTestados;
    }
    /**
     * calcula o salario total do analista QA.
     * o analista de QA recebe um adiciobnal de 5% sobre o salario base, mais um bonus de R$100
     * por cada projeto testado
     * @return
     */
    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() *1.05);
    }
}
