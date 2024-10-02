package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que representa uma rede de hotéis.
 */
public class RedeHoteis {
    private List<CorrecaoHotel> listaDeHoteis;

    public RedeHoteis() {
        this.listaDeHoteis = new ArrayList<>();
    }

    /**
     * Adiciona um hotel à rede.
     *
     * @param hotel O hotel a ser adicionado.
     */
    public void adicionarHotel(CorrecaoHotel hotel) {
        listaDeHoteis.add(hotel);
    }

    /**
     * Busca acomodações disponíveis em todos os hotéis da rede.
     *
     * @return Uma lista de acomodações disponíveis em todos os hotéis.
     */
    public List<Acomodacao> buscarAcomodacoesDisponiveis() {
        return listaDeHoteis.stream()
                .flatMap(hotel -> hotel.listarAcomodacoesDisponiveis().stream())
                .collect(Collectors.toList());
    }

    /**
     * Versão simples do método buscarAcomodacoesDisponiveis.
     *
     * @return Uma lista de acomodações disponíveis em todos os hotéis.
     */
    public List<Acomodacao> buscarAcomodacoesDisponiveisSimples() {
        List<Acomodacao> disponiveis = new ArrayList<>();
        for (CorrecaoHotel hotel : listaDeHoteis) {
            disponiveis.addAll(hotel.listarAcomodacoesDisponiveisSimples());
        }
        return disponiveis;
    }

    /**
     * Faz uma reserva em qualquer hotel da rede.
     *
     * @param nomeHotel O nome do hotel onde fazer a reserva.
     * @param numeroAcomodacao O número da acomodação a ser reservada.
     * @return true se a reserva foi bem-sucedida, false caso contrário.
     */
    public boolean fazerReserva(String nomeHotel, int numeroAcomodacao) {
        return listaDeHoteis.stream()
                .filter(hotel -> hotel.getNome().equals(nomeHotel))
                .findFirst()
                .map(hotel -> hotel.reservarAcomodacao(numeroAcomodacao))
                .orElse(false);
    }

    /**
     * Versão simples do método fazerReserva.
     *
     * @param nomeHotel O nome do hotel onde fazer a reserva.
     * @param numeroAcomodacao O número da acomodação a ser reservada.
     * @return true se a reserva foi bem-sucedida, false caso contrário.
     */
    public boolean fazerReservaSimples(String nomeHotel, int numeroAcomodacao) {
        for (CorrecaoHotel hotel : listaDeHoteis) {
            if (hotel.getNome().equals(nomeHotel)) {
                return hotel.reservarAcomodacaoSimples(numeroAcomodacao);
            }
        }
        return false;
    }
}