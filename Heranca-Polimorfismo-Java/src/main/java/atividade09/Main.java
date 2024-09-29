package main.java.atividade09;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /***
         * Criação da rede de hotéis
         */
        RedeHoteis redeHoteis = new RedeHoteis();

        /***
         * Criação de hotéis
         */
        Hotel hotel1 = new Hotel("Hotel Paradise");
        Hotel hotel2 = new Hotel("Hotel Luxo");

        /***
         * Adicionando acomodações ao Hotel Paradise
         */
        hotel1.adicionarAcomodacao(new QuartoStandard(101, 2, 100.0, true, QuartoStandard.TipoCama.SOLTEIRO));
        hotel1.adicionarAcomodacao(new QuartoLuxo(201, 2, 200.0, true, true, false));
        hotel1.adicionarAcomodacao(new Suite(301, 4, 300.0, true, 2, true));

        /***
         * Adicionando acomodações ao Hotel Luxo
         */
        hotel2.adicionarAcomodacao(new QuartoStandard(102, 2, 120.0, true, QuartoStandard.TipoCama.CASAL));
        hotel2.adicionarAcomodacao(new QuartoLuxo(202, 2, 250.0, true, false, true));
        hotel2.adicionarAcomodacao(new Suite(302, 5, 400.0, true, 3, false));

        /***
         * Adicionando hotéis à rede
         */
        redeHoteis.adicionarHotel(hotel1);
        redeHoteis.adicionarHotel(hotel2);

        /***
         * Listando acomodações disponíveis
         */
        System.out.println("Acomodações disponíveis:");
        List<Acomodacao> disponiveis = redeHoteis.buscarAcomodacoesDisponiveis();
        for (Acomodacao acomodacao : disponiveis) {
            System.out.println("Acomodação " + acomodacao.getNumero() + ": " + acomodacao.getClass().getSimpleName() + " - Preço: " + acomodacao.getPrecoPorNoite());
        }

        /***
         * Realizando uma reserva
         */
        System.out.println("\nReservando acomodação número 101 no Hotel Paradise...");
        redeHoteis.fazerReserva(hotel1, 101);

        /***
         * Tentando listar novamente as acomodações disponíveis
         */
        System.out.println("\nAcomodações disponíveis após a reserva:");
        disponiveis = redeHoteis.buscarAcomodacoesDisponiveis();
        for (Acomodacao acomodacao : disponiveis) {
            System.out.println("Acomodação " + acomodacao.getNumero() + ": " + acomodacao.getClass().getSimpleName() + " - Preço: " + acomodacao.getPrecoPorNoite());
        }
    }
}
