package main.java;

<<<<<<< HEAD
import main.java.atividade03.Caminhao;
import main.java.atividade03.Carro;
import main.java.atividade03.Frota;
import main.java.atividade03.Moto;
=======
import main.java.atividade05.Boleto;
import main.java.atividade05.CartaoCredito;
import main.java.atividade05.ProcessadorPagamento;
import main.java.atividade05.TransferenciaBancaria;
>>>>>>> a074b06023477a0d68898921485d4633672faf4e

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();
        processadorPagamento.adicionarPagamentos(new Boleto("teste 1", 100.0, "123456789"));
        processadorPagamento.adicionarPagamentos(new CartaoCredito("teste 2", 250.0, "123456789012345", "MasterCard"));
        processadorPagamento.adicionarPagamentos(new TransferenciaBancaria("teste 3", 570.0, "Itaú", "01234", "0000-1"));

<<<<<<< HEAD
        System.out.println("***** LISTA DE VEÍCULOS *****");
        frota.listarVeiculos();
        System.out.println("Custo total de viagem: R$" + frota.calcularCustoDeViagemTotal(100.0));

        frota.removerVeiculo("efgh456");
        frota.removerVeiculo("mnop123");
        frota.removerVeiculo("uvwx456");

        System.out.println("***** LISTA DE VEÍCULOS *****");
        frota.listarVeiculos();
        System.out.println("Custo total de viagem: R$" + frota.calcularCustoDeViagemTotal(100.0));
=======
        processadorPagamento.getFormasPagamento().forEach(formaPagamento -> formaPagamento.processarPagamento(formaPagamento.getTaxaTransacao()));
        processadorPagamento.getFormasPagamento().forEach(formaPagamento -> formaPagamento.estornarPagamento(formaPagamento.getTaxaTransacao()));
        System.out.println("===== Formas de pagamento =====");
        processadorPagamento.listarFormasPagamento();
>>>>>>> a074b06023477a0d68898921485d4633672faf4e
    }
}
