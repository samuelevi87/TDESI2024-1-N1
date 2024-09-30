package main.java;

import main.java.atividade05.ProcessadorPagamento;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        processador.adicionarFormaPagamento(new CartaoCredito("1234-5678-9101-1121", "Visa", 2.5));
        processador.adicionarFormaPagamento(new Boleto("123456789012", 1.0));
        processador.adicionarFormaPagamento(new TransferenciaBancaria("Banco do Brasil", "1234", "56789-0", 1.5));

        processador.listarFormasPagamento();

        processador.processarPagamento(100.0, "Cartão de Crédito");
        processador.processarPagamento(150.0, "Boleto");
        processador.processarPagamento(200.0, "Transferência Bancária");

        processador.estornarPagamento(100.0, "Cartão de Crédito");
        processador.estornarPagamento(150.0, "Boleto");
        processador.estornarPagamento(200.0, "Transferência Bancária");
    }
}
