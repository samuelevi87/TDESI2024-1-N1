package main.java.atividade01;

/**
 * Representa um Desenvolvedor na empresa
 */
public class Desensolvedor extends Funcionario {
    private  String liguagemDeProgramacao;

    /**
     * constroi um Desenvolvedor
     * @param nome
     * @param id
     * @param salarioBase
     * @param liguagemDeProgramacao
     */
    public Desensolvedor(String nome, Integer id, Double salarioBase, String liguagemDeProgramacao) {
        super(nome, id, salarioBase);
        this.liguagemDeProgramacao = liguagemDeProgramacao;
    }

    /**
     * calcular o salario total do Desenvolvedor
     * @return o salario com o bonus de 10%
     */
    @Override
    public Double calcularSalario() {
        return getSalarioBase() * 1.1 ;
    }
}
