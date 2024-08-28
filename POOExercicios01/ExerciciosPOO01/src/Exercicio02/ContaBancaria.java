package Exercicio02;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numerodaConta, double saldoInicial) {
        this.numeroConta = numerodaConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double quantiaParaDeposito) {
        this.saldo += quantiaParaDeposito;
    }

    public void sacar(double quantiaParaSaque) {
        this.saldo -= quantiaParaSaque;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
}