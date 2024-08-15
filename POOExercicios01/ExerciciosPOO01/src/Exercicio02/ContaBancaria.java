package Exercicio02;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    public void depositar(double deposito){
        this.saldo+=deposito;
    }
    public void saque(double saque){
        this.saldo-=saque;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
