package Exercicio02;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;



    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void getSaldo() {
        System.out.println(saldo);
    }

    public void depositar(double saldo) {
        this.saldo = this.saldo + saldo;
    }

    public void sacar(double saldo) {
        this.saldo = this.saldo - saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                '}';
    }
}
