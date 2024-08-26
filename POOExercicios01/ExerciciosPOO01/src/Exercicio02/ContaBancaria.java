package Exercicio02;

public class ContaBancaria {

    private int numeroConta;

    private double saldo;

    private double sacar;

    public ContaBancaria(int numeroConta, double saldoInicial){

        this.numeroConta=numeroConta;
        this.saldo=saldoInicial;
    }
    public void depositar (double quantidadeParaDepositar){
        this.saldo += quantidadeParaDepositar;
    }

    public void sacar(double quantidadeParaSacar) {
        this.sacar -= quantidadeParaSacar ;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSacar() {
        return sacar;
    }
}
