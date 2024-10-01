package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Hotel {

    List<Acomodacao> acomodacoes;
    private double receitaTotal;
    private String nome;

    public Hotel(String nome) {
        this.nome = nome;
        acomodacoes = new ArrayList<>();
    }

    public double getReceitaTotal() {
        return receitaTotal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAcomodacao(Acomodacao acomodacao) {
        acomodacoes.add(acomodacao);
    }

    public List<Acomodacao> listarAcomodacoesDisponiveis() {
        List<Acomodacao> listaAcomodacoesDisponiveis = new ArrayList<>();
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.isDisponivel()) {
                listaAcomodacoesDisponiveis.add(acomodacao);
            }
        }
        return listaAcomodacoesDisponiveis;
    }

    public void reservarAcomodacaoEspecifica(int num, int numNoites) {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getNumero() == num && acomodacao.isDisponivel()) {
                acomodacao.reservar();
                this.receitaTotal += acomodacao.calcularPrecoTotal(numNoites);
                System.out.println("Acomodação Reservada!");
                break;
            } else {
                System.out.println("Não foi possível reservar acomodação");
            }
        }
    }

    public void liberarAcomodacaoEspecifica(int num) {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getNumero() == num && !acomodacao.isDisponivel()) {
                acomodacao.liberar();
                System.out.println("Acomodação Liberada");
                break;
            } else {
                System.out.println("Não foi possível liberar está acomodação");
            }
        }
    }

    public double calcularReceitaTotal() {
        return getReceitaTotal();
    }

    public Optional<Acomodacao> buscarAcomodacaoPorNumero(int numero) {
        return acomodacoes.stream().filter(a -> a.getNumero() == numero).findFirst();
    }

}
