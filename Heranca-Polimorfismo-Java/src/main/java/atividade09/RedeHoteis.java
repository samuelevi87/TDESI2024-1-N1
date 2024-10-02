package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Representa uma rede de hotéis
 */
public class RedeHoteis {
    private List<Hotel> hoteis;

    /**
     * Constrói uma RedeHoteis incializando a lista de hotéis
     */
    public RedeHoteis() {
        this.hoteis = new ArrayList<>();
    }

    /**
     * Adiciona um hotel na rede
     * @param hotel
     */
    public void adicionarHotel(Hotel hotel){
        hoteis.add(hotel);
    }

    /**
     * Imprime as acomodações disponíveis em todos os hotéis
     */
    public void buscarAcomodacoesDisponiveis(){
        for(Hotel hotel : hoteis){
            System.out.println(hotel.listarAcomodacoesDisponiveis());
        }
    }

    /**
     * Reserva uma acomodação em qualquer hotel da rede
     * @param numeroAcomodacao numero da acomodação
     * @param numeroNoites numero de noites da reserva
     * @return resultado da reserva
     */
    public boolean reservarAcomodacaoNaRede(String nomeHotel, int numeroAcomodacao, int numeroNoites) {
        for (Hotel hotel : hoteis) {
            if(hotel.getNome().equalsIgnoreCase(nomeHotel)){
                return hotel.reservarAcomodacaoPorNumeroSimples(numeroAcomodacao, numeroNoites);
            }
        }
        return false;
    }
}
