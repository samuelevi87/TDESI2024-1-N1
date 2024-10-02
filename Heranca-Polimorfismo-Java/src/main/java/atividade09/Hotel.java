package main.java.atividade09;
import java.util.ArrayList;
import java.util.List;

public class Hotel extends Acomoacao{
    private List<Acomodacao> acomodacoes;

    public Hotel() {
        this.acomodacoes = new ArrayList<>();
    }

    public void adicionarAcomodacao(Acomodacao acomodacao) {
        acomodacoes.add(acomodacao);
    }

    public List<Acomodacao> listarAcomodacoesDisponiveis() {
        List<Acomodacao> disponiveis = new ArrayList<>();
        for (Acomodacao a : acomodacoes) {
            if (a.isDisponivel()) {
                disponiveis.add(a);
            }
        }
        return disponiveis;
    }

    public void reservarAcomodacao(int numero) {
        for (Acomodacao a : acomodacoes) {
            if (a.getNumero() == numero && a.isDisponivel()) {
                a.reservar();
                break;
            }
        }
    }

    public void liberarAcomodacao(int numero) {
        for (Acomodacao a : acomodacoes) {
            if (a.getNumero() == numero) {
                a.liberar();
                break;
            }
        }
    }

    public double calcularReceitaTotal() {
        double total = 0;
        for (Acomodacao a : acomodacoes) {
            if (!a.isDisponivel()) {
                // Para simplificar, consideramos 1 noite
                total += a.calcularPrecoTotal(1);
            }
        }
        return total;
    }
}
