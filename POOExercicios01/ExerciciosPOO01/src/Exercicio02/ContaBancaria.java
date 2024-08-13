package Exercicio02;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void Sacar(double valor){
        this.saldo -= valor;
    }

    public void Depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroConta +
                "\nSaldo: R$" + saldo;
    }
}
