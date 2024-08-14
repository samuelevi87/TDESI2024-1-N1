package Exercicio02;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        }
    }
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para o saque.");
            }
        }
    }
    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(12345, 1000.00);

        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(200.00);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(2000.00);
        System.out.println("Saldo final: R$ " + conta.getSaldo());

        conta.depositar(-50.00);
    }
}
