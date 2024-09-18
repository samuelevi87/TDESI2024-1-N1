package main.java.atividade01;

public class AnalistaQA extends Funcionario{

    private int projetosTestados;


    /**
     * Constrói um novo AnalistaQA.
     *
     * @param nome          O nome do AnalistaQA.
     * @param identificador A matricula do AnalistaQA.
     * @param salarioBase   O salário base do AnalistaQA.
     * @param projetos O total de projetos testados pelo AnalistaQA.
     */
    public AnalistaQA(String nome, Integer identificador, Double salarioBase, int projetos) {
        super(nome, identificador, salarioBase);
        this.projetosTestados = projetos;
    }

    /**
     * Calcula o salário do AnalistaQA acrescentando 5%
     * do valor do salário base mais R$ 100 por projeto testados
     *
     * @return O salário calculado do AnalistaQA.
     */
    @Override
    public double calcularSalarioTotal() {
        return (getSalarioBase() * 1.05) + (this.projetosTestados * 100);
    }
}
