package main.java.atividade01;

public class Gerente extends  Funcionario{

    private Double bonusAtual;

    public Gerente(String nome, int id, double salarioBase) {
        super(nome, id, salarioBase);
        this.bonusAtual = bonusAtual;
    }

    public Double getBonusAtual() {
        return bonusAtual;
    }

    public void setBonusAtual(Double bonusAtual) {
        this.bonusAtual = bonusAtual;
    }

    @Override
    public double calcularSalarioTotal() {
        return 0;

    }
}
