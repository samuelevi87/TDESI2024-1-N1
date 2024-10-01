package main.java;

import main.java.atividade05.Boleto;
import main.java.atividade05.CartaoCredito;
import main.java.atividade05.ProcessadorPagamento;
import main.java.atividade05.TransferenciaBancaria;
import main.java.atividade09.*;

public class Main {
    public static void main(String[] args) {
        ProcessadorPagamento processadorPagamento = new ProcessadorPagamento();
        processadorPagamento.adicionarPagamentos(new Boleto("teste 1", 100.0, "123456789"));
        processadorPagamento.adicionarPagamentos(new CartaoCredito("teste 2", 250.0, "123456789012345", "MasterCard"));
        processadorPagamento.adicionarPagamentos(new TransferenciaBancaria("teste 3", 570.0, "Itaú", "01234", "0000-1"));

        RedeHoteis redeDeHoteis = new RedeHoteis();
        Hotel hotel1 = new Hotel();
        Hotel hotel2 = new Hotel();
        Hotel hotel3 = new Hotel();

        hotel1.adicionarAcomodacoes(new QuartoLuxo(1234, 4, 200.0, true, true));
        hotel2.adicionarAcomodacoes(new QuartoLuxo(4321, 3, 250.0, false, true));
        hotel3.adicionarAcomodacoes(new QuartoLuxo(2143, 4, 175.0, false, false));
        hotel1.adicionarAcomodacoes(new QuartoStandard(9823, 4, 300.0, QuartoStandard.TipoToCama.CASAL));
        hotel2.adicionarAcomodacoes(new QuartoStandard(7462, 3, 350.0, QuartoStandard.TipoToCama.CASAL));
        hotel3.adicionarAcomodacoes(new QuartoStandard(5726, 4, 275.0, QuartoStandard.TipoToCama.SOLTEIRO));
        hotel1.adicionarAcomodacoes(new Suite(9283, 4, 400.0, 4, true));
        hotel2.adicionarAcomodacoes(new Suite(2748, 4, 425.0, 3, false));
        hotel3.adicionarAcomodacoes(new Suite(5837, 4, 450.0, 2, false));
        redeDeHoteis.adicionarHotel(hotel1);
        redeDeHoteis.adicionarHotel(hotel2);
        redeDeHoteis.adicionarHotel(hotel3);

        System.out.println("===== Acomodações disponíveis no hotel 1 =====");
        hotel1.listarAcomodacoesDisponiveis();
        System.out.println("===== Acomodações disponíveis no hotel 2 =====");
        hotel2.listarAcomodacoesDisponiveis();
        System.out.println("===== Acomodações disponíveis no hotel 3 =====");
        hotel3.listarAcomodacoesDisponiveis();

        redeDeHoteis.reservarAcomodacaoEspecifica(2143);
        System.out.println("===== Acomodações disponíveis no hotel 3 =====");
        hotel3.listarAcomodacoesDisponiveis();
        System.out.println("===== Acomodações disponíveis na rede de hotéis =====");
        redeDeHoteis.buscarAcomodacoesDisponiveis();
        System.out.println("===== Cálculo de receita para 10 noites no hotel 1 =====");
        System.out.println("R$ " + hotel1.calcularReceitaTotal(10));
    }
}
