package main.java;

import main.java.atividade05.Boleto;
import main.java.atividade05.CartaoCredito;
import main.java.atividade05.ProcessadorPagamento;
import main.java.atividade05.TransferenciaBancaria;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();
        processadorPagamento.adicionarPagamentos(new Boleto("teste 1", 100.0, "123456789"));
        processadorPagamento.adicionarPagamentos(new CartaoCredito("teste 2", 250.0, "123456789012345", "MasterCard"));
        processadorPagamento.adicionarPagamentos(new TransferenciaBancaria("teste 3", 570.0, "Itaú", "01234", "0000-1"));

        processadorPagamento.getFormasPagamento().forEach(formaPagamento -> formaPagamento.processarPagamento(formaPagamento.getTaxaTransacao()));
        processadorPagamento.getFormasPagamento().forEach(formaPagamento -> formaPagamento.estornarPagamento(formaPagamento.getTaxaTransacao()));
        System.out.println("===== Formas de pagamento =====");
        processadorPagamento.listarFormasPagamento();
    }
}
