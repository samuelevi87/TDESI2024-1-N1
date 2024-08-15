package Exercicio02;

public class ContaBancario {

    private int numeroConta;
    private double saldo;


    public ContaBancario(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public double setDepositar(double valor){
        saldo += valor;
        return saldo;
    }

    public double setSacar(double valor){

        saldo-=valor;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
