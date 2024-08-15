package Exercicio02;

public class ContaBancaria {

    private int numeroConta;
    private double saldoConta;

    public ContaBancaria(int numeroConta, double saldoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }
    public double setDepositar(double valor) {

        saldoConta += valor;

        return saldoConta;
    }
    public double setSacar(double valor) {

        saldoConta -= valor;

        return saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
}
