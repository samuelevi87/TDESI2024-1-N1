package Exercicio02;

import Exercicio01.Pessoa;

public class ContaBancaria {
    // Exercício 2:
    // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
    // 2. Depositar um valor na conta.
    // 3. Sacar um valor da conta.
    // 4. Exibir o saldo final.

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double dinheiro) {
        this.saldo -= dinheiro;
    }

    public void depositar(double dinheiro) {
        this.saldo += dinheiro;
    }

}
