package main.java;

import main.java.atividade09.*;

public class Main {

    public static void main(String[] args) {
        RedeHoteis redeHoteis = new RedeHoteis();

        // Criando dois hotéis
        Hotel hotel1 = new Hotel("Hotel Central");
        Hotel hotel2 = new Hotel("Hotel Praiano");

        // Adicionando acomodações ao Hotel Central
        hotel1.addAcomodacao(new QuartoLuxo(101, 2, 200, true, true, true));
        hotel1.addAcomodacao(new QuartoLuxo(102, 4, 500, true, true, true));
        hotel1.addAcomodacao(new Suite(103, 6, 1000, true, 3, false));

        // Adicionando acomodações ao Hotel Praiano
        hotel2.addAcomodacao(new QuartoLuxo(202, 3, 600, false, true, false));
        hotel2.addAcomodacao(new Suite(203, 5, 1200, true, 3, true));

        // Adicionando hotéis à rede
        redeHoteis.addHotel(hotel1);
        redeHoteis.addHotel(hotel2);

        // Listando acomodações disponíveis
        System.out.println("Acomodações disponíveis:");
        for (Acomodacao acomodacao : redeHoteis.buscarAcomodacoesDisponiveisTodosHoteis()) {
            System.out.println("Hotel: " + (hotel1.buscarAcomodacaoPorNumero(acomodacao.getNumero()).isPresent() ? hotel1.getNome() : hotel2.getNome()) +
                    " - Acomodação nº: " + acomodacao.getNumero() + " - Preço por noite: " + acomodacao.getPrecoPorNoite());
        }

        // Fazendo uma reserva
        System.out.println("\nReservando a acomodação nº 101...");
        redeHoteis.reservarEmQualquerHotel(101, 3);

        // Listando acomodações disponíveis após reserva
        System.out.println("\nAcomodações disponíveis após reserva:");
        for (Acomodacao acomodacao : redeHoteis.buscarAcomodacoesDisponiveisTodosHoteis()) {
            System.out.println("Hotel: " + (hotel1.buscarAcomodacaoPorNumero(acomodacao.getNumero()).isPresent() ? hotel1.getNome() : hotel2.getNome()) +
                    " - Acomodação nº: " + acomodacao.getNumero() + " - Preço por noite: " + acomodacao.getPrecoPorNoite());
        }
    }
}
