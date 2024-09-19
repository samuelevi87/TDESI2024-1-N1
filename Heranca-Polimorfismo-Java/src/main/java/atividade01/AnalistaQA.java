package main.java.atividade01;

public class AnalistaQA extends Funcionario{
    private Integer projetosTestados;

    /**
     * constoi AnalistaQA
     * @param nome
     * @param identificador
     * @param salarioBase
     */
    public AnalistaQA(String nome, Integer identificador, Double salarioBase) {
        super(nome, identificador, salarioBase);
        this.projetosTestados = projetosTestados;
    }

    /**
     * calcula salario total analistaQA
     * 5% sobre salario base, mais R$100 por projeto testado
     * @return
     */
    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase()*1.05);
    }
}
