package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RedeHoteis {

    List<Hotel> hoteis;

    public RedeHoteis() {
        hoteis = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        hoteis.add(hotel);
    }

    public List<Acomodacao> buscarAcomodacoesDisponiveisTodosHoteis() {
        List<Acomodacao> listaAcomodacoesDisponiveis = new ArrayList<>();
        for (Hotel hotel : hoteis) {
            for (Acomodacao acomodacao : hotel.acomodacoes) {
                if (acomodacao.isDisponivel()) {
                    listaAcomodacoesDisponiveis.add(acomodacao);
                }
            }
        }
        return listaAcomodacoesDisponiveis;
    }

    public boolean reservarEmQualquerHotel(int numeroAcomodacao, int numNoites) {
        for (Hotel hotel : hoteis) {
            Optional<Acomodacao> acomodacaoOpt = hotel.buscarAcomodacaoPorNumero(numeroAcomodacao);
            if (acomodacaoOpt.isPresent() && acomodacaoOpt.get().isDisponivel()) {
                hotel.reservarAcomodacaoEspecifica(numeroAcomodacao, numNoites);
                return true;
            }
        }
        return false;
    }
}

