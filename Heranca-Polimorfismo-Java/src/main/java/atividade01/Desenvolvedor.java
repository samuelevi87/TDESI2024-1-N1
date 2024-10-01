package main.java.atividade01;

public class Desenvolvedor extends Funcionario{
    //atributos da subclasse
    private String linguagemProgramacao;
    //construtor da subclasse, onde Desenvolvedor vai herdar os atributos da classe-mãe Funcionário + os atributos passados dentro dela mesma
    public Desenvolvedor(String nome, int id, double salarioBase, String linguagemProgramacao) { //dentro do () ficam os atributos que depois irão receber seus devidos parametros ex: nome: stephanie
        super(nome, id, salarioBase); //o super() serve para a subclasse herdar os atributos da classe-mãe
        this.linguagemProgramacao = linguagemProgramacao;
    }

    @Override
    public double calcularSalarioTotal() {
        return 0;
    }
    //método para acrescentar 10% ao salário base
    public double
}
