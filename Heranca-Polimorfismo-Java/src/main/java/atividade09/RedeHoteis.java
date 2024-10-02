package main.java.atividade09;
import java.util.ArrayList;
import java.util.List;

public class RedeHoteis {
    private List<Hotel> hoteis;

    public RedeHoteis() {
        this.hoteis = new ArrayList<>();
    }

    public void adicionarHotel(Hotel hotel) {
        hoteis.add(hotel);
    }

    public List<Acomodacao> buscarAcomodacoesDisponiveis() {
        List<Acomodacao> todasDisponiveis = new ArrayList<>();
        for (Hotel hotel : hoteis) {
            todasDisponiveis.addAll(hotel.listarAcomodacoesDisponiveis());
        }
        return todasDisponiveis;
    }

    public void fazerReserva(int numero) {
        for (Hotel hotel : hoteis) {
            for (Acomodacao acomodacao : hotel.listarAcomodacoesDisponiveis()) {
                if (acomodacao.getNumero() == numero) {
                    hotel.reservarAcomodacao(numero);
                    return;
                }
            }
        }
        System.out.println("Acomodação não encontrada ou já reservada.");
    }
}

