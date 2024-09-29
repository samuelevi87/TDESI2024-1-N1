package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;

public class RedeHoteis {
    private List<Hotel> hoteis;
    /***
     * Construtor que inicializa a lista de hotéis.
     */
    public RedeHoteis() {
        hoteis = new ArrayList<>();
    }
    /***
     * Adiciona um hotel à rede.
     *
     * @param hotel O hotel a ser adicionado.
     */
    public void adicionarHotel(Hotel hotel) {
        hoteis.add(hotel);
        System.out.println("Hotel " + hotel.getNome() + " adicionado à rede.");
    }
    /***
     * Busca acomodações disponíveis em todos os hotéis da rede.
     *
     * @return Uma lista de acomodações disponíveis.
     */
    public List<Acomodacao> buscarAcomodacoesDisponiveis() {
        List<Acomodacao> disponiveis = new ArrayList<>();
        for (Hotel hotel : hoteis) {
            disponiveis.addAll(hotel.listarAcomodacoesDisponiveis());
        }
        return disponiveis;
    }
    /***
     * Faz uma reserva em um hotel específico.
     *
     * @param hotel O hotel onde a reserva será feita.
     * @param numero O número da acomodação a ser reservada.
     */
    public void fazerReserva(Hotel hotel, int numero) {
        hotel.reservarAcomodacao(numero);
    }
}
