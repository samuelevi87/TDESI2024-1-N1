package main.java;


import main.java.atividade04.*;
import main.java.atividade05.Boleto;
import main.java.atividade05.CartaoCredito;
import main.java.atividade05.ProcessarPagamento;
import main.java.atividade05.TransferenciaBancaria;


public class Main {
    public static void main(String[] args) {

        ProcessarPagamento processarPagamento = new ProcessarPagamento();

        processarPagamento.adicionarFormasDePagamento(new CartaoCredito("Cartão de Crédito", 5.00, "1234 5678 9876 5432", "Visa"));
        processarPagamento.adicionarFormasDePagamento(new Boleto("Boleto", 2.50, "00190500954014481606906809350314337370000000100"));
        processarPagamento.adicionarFormasDePagamento(new TransferenciaBancaria("Transferência Bancária", 3.00, "Banco do Brasil", "1234", "56789-0"));


        processarPagamento.processarPagamento(100.0, "Cartão de Crédito");
        processarPagamento.processarPagamento(200.0, "Boleto");
        processarPagamento.processarPagamento(300.0, "Transferência Bancária");

        processarPagamento.estornarPagamento(100.0, "Cartão de Crédito");
        processarPagamento.estornarPagamento(200.0, "Boleto");
        processarPagamento.estornarPagamento(300.0, "Transferência Bancária");

        processarPagamento.listarFormasPagamento();
    }
}
