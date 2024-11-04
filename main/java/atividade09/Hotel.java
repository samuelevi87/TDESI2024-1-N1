package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que representa um hotel.
 */
public class CorrecaoHotel {
    private String nome;
    private List<Acomodacao> listaDeAcomodacoes;

    /**
     * Construtor para a classe Hotel.
     *
     * @param nome O nome do hotel.
     */
    public CorrecaoHotel(String nome) {
        this.nome = nome;
        this.listaDeAcomodacoes = new ArrayList<>();
    }

    /**
     * Adiciona uma acomodação ao hotel.
     *
     * @param acomodacao A acomodação a ser adicionada.
     */
    public void adicionarAcomodacao(Acomodacao acomodacao) {
        listaDeAcomodacoes.add(acomodacao);
    }

    /**
     * Lista todas as acomodações disponíveis no hotel.
     *
     * @return Uma lista de acomodações disponíveis.
     */
    public List<Acomodacao> listarAcomodacoesDisponiveis() {
        return listaDeAcomodacoes.stream()
                .filter(Acomodacao::estaDisponivel)
                .collect(Collectors.toList());
    }

    /**
     * Versão simples do método listarAcomodacoesDisponiveis.
     *
     * @return Uma lista de acomodações disponíveis.
     */
    public List<Acomodacao> listarAcomodacoesDisponiveisSimples() {
        List<Acomodacao> disponiveis = new ArrayList<>();
        for (Acomodacao acomodacao : listaDeAcomodacoes) {
            if (acomodacao.estaDisponivel()) {
                disponiveis.add(acomodacao);
            }
        }
        return disponiveis;
    }

    /**
     * Reserva uma acomodação específica.
     *
     * @param numero O número da acomodação a ser reservada.
     * @return true se a reserva foi bem-sucedida, false caso contrário.
     */
    public boolean reservarAcomodacao(int numero) {
        return listaDeAcomodacoes.stream()
                .filter(acomodacao -> acomodacao.getNumero() == numero && acomodacao.estaDisponivel())
                .findFirst()
                .map(acomodacao -> {
                    acomodacao.reservar();
                    return true;
                })
                .orElse(false);
    }

    /**
     * Versão simples do método reservarAcomodacao.
     *
     * @param numero O número da acomodação a ser reservada.
     * @return true se a reserva foi bem-sucedida, false caso contrário.
     */
    public boolean reservarAcomodacaoSimples(int numero) {
        for (Acomodacao acomodacao : listaDeAcomodacoes) {
            if (acomodacao.getNumero() == numero && acomodacao.estaDisponivel()) {
                acomodacao.reservar();
                return true;
            }
        }
        return false;
    }

    /**
     * Libera uma acomodação específica.
     *
     * @param numero O número da acomodação a ser liberada.
     * @return true se a liberação foi bem-sucedida, false caso contrário.
     */
    public boolean liberarAcomodacao(int numero) {
        return listaDeAcomodacoes.stream()
                .filter(acomodacao -> acomodacao.getNumero() == numero && !acomodacao.estaDisponivel())
                .findFirst()
                .map(acomodacao -> {
                    acomodacao.liberar();
                    return true;
                })
                .orElse(false);
    }

    /**
     * Calcula a receita total das reservas atuais.
     *
     * @param numeroNoites O número de noites para o cálculo.
     * @return A receita total.
     */
    public double calcularReceitaTotal(int numeroNoites) {
        return listaDeAcomodacoes.stream()
                .filter(acomodacao -> !acomodacao.estaDisponivel())
                .mapToDouble(acomodacao -> acomodacao.calcularPrecoTotal(numeroNoites))
                .sum();
    }

    /**
     * Versão simples do método calcularReceitaTotal.
     *
     * @param numeroNoites O número de noites para o cálculo.
     * @return A receita total.
     */
    public double calcularReceitaTotalSimples(int numeroNoites) {
        double total = 0;
        for (Acomodacao acomodacao : listaDeAcomodacoes) {
            if (!acomodacao.estaDisponivel()) {
                total += acomodacao.calcularPrecoTotal(numeroNoites);
            }
        }
        return total;
    }

    public String getNome() {
        return nome;
    }
}