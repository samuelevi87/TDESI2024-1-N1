package main.java.atividade09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class RedeHoteis {
    private List<Hotel> listaDeHoteis;

    public RedeHoteis() {
        this.listaDeHoteis = new ArrayList<>();
    }

    public void adicionarHotel(Hotel hotel) {
        this.listaDeHoteis.add(hotel);
    }

    public void buscarAcomodacoesDisponiveis() {
        listaDeHoteis.forEach(hotel -> hotel.getListaDeAcomodacoes().stream().filter(Acomodacao::getDisponivel).forEach(System.out::println));
    }

    public void reservarAcomodacaoEspecifica(Integer numero) {
        listaDeHoteis.stream().map(Hotel::getListaDeAcomodacoes).flatMap(Collection::stream).filter(acomodacao -> acomodacao.getNumero().equals(numero)).findFirst().ifPresent(Acomodacao::reservar);
    }
}
