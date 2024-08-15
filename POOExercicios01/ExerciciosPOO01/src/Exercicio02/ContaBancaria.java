package Exercicio02;

public class ContaBancaria {
   private int numeroConta;
   private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta=numeroConta;
        this.saldo=saldo;
    }
    public void deposito(double valor) {
        this.saldo = this.saldo + valor;
    }
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
