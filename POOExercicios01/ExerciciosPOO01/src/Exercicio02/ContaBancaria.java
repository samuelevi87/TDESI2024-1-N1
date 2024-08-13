package Exercicio02;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void depositar(double valor){
       saldo += valor;
    }
    public void sacar(double valor){
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
