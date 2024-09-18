package main.java.atividade01;

public class Gerente extends Funcionario{
    private Double bonusAnual;

    public Gerente(String nome, Double salarioBase, Integer identificador, Double bonusAnual) {
        super(nome, salarioBase, identificador);
        this.bonusAnual = bonusAnual;
    }


    @Override
    public double calcularSalarioTotal() {
        return 0.0;
    }
}
