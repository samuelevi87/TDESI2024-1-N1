package Exercicio02;

public class ContaBancaria {
 private int contaBancaria;
 private double saldo;

    public ContaBancaria(int contaBancaria, double saldo) {
        this.contaBancaria = contaBancaria;
        this.saldo = saldo;
    }
    public void depositar(double valor)
    {
        saldo += valor;
    }
    public void sacar(double valor)
    {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
