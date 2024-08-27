package Exercicio02;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public ContaBancaria() {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        this.saldo -= valor;
    }
}

