package Exercicio02;

public class ContaBancaria {
   int numeroConta;
   double saldo;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void deposito(double valor) {
        this.saldo = this.saldo + valor;
    }
    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    public ContaBancaria() {
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
