package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Representa um hotel
 */
public class Hotel {

    private List<Acomodacao> acomodacoes;
    private List<Reserva> reservas;

    /**
     * Constrói um hotel inicializando a lista de acomodações e de reservas
     */
    public Hotel(){
        this.acomodacoes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    /**
     * Adiciona uma acomodação à lista de acomodações
     * @param acomodacao acomodação a ser adicionada
     */
    public void adicionarAcomodacao(Acomodacao acomodacao){
        acomodacoes.add(acomodacao);
    }

    /**
     * Lista as acomodações disponíveis utilizando stream
     * @return uma lista de string das acomodações disponíveis
     */
    public List<String> listarAcomodacoesDisponiveis(){
        return acomodacoes.stream().filter(Acomodacao::isDisponivel)
                .map(Acomodacao::toString).toList();
    }

    /**
     * Lista as acomodações disponíveis sem utilizar stream
     * @return uma lista de string das acomodações disponíveis
     */
    public List<String> listarAcomodacoesDisponiveisSimples(){
        List<String> listaAcomodacoes = new ArrayList<>();

        for(Acomodacao acomodacao : acomodacoes){
            if(acomodacao.isDisponivel()){
                listaAcomodacoes.add(acomodacao.toString());
            }
        }
        return listaAcomodacoes;
    }

    /**
     * Reserva uma acomodação de acordo com seu número utilizando streams
     * @param numero numero da acomodação a ser reservada
     * @return resultado da reserva ou exceção caso o número seja inválido
     */
    public boolean reservarAcomodacaoPorNumero(int numero, int numeroNoites){
        return acomodacoes.stream().filter(acomodacao -> acomodacao.getNumero() == numero)
                .findFirst()
                .map(acomodacao -> {
                    if(acomodacao.reservar()){
                        reservas.add(new Reserva(acomodacao, numeroNoites));
                    }
                    return acomodacao.reservar();
                })
                .orElseThrow(() -> new IllegalArgumentException("Número da acomodação inválido"));
    }

    /**
     * Reserva uma acomodação de acordo com seu número sem utilizar streams
     * @param numero numero da acomodação a ser reservada
     * @param numeroNoites numero de noites da reserva
     * @return resultado da reserva ou exceção caso o número seja inválido
     */
    public boolean reservarAcomodacaoPorNumeroSimples(int numero, int numeroNoites){
        for(Acomodacao acomodacao : acomodacoes){
            if(acomodacao.getNumero() == numero){
                if(acomodacao.reservar()){
                    reservas.add(new Reserva(acomodacao, numeroNoites));
                }
                return acomodacao.reservar();
            }
        }
        throw new IllegalArgumentException("Número da acomodação inválido");
    }

    /**
     * Libera acomodação de acordo com o objeto passado
     * @param acomodacao acomodação a ser liberada
     * @return resultado da liberação
     */
    public boolean liberarAcomodacao(Acomodacao acomodacao){
        int index = acomodacoes.indexOf(acomodacao);
        return acomodacoes.get(index).liberar();
    }

    /**
     * Libera uma acomodação de acordo com seu número utilizando streams
     * @param numero numero da acomodação a ser liberada
     * @return resultado da liberação ou exceção caso o número seja inválido
     */
    public boolean liberarAcomodacaoPorNumero(int numero){
        return acomodacoes.stream().filter(acomodacao -> acomodacao.getNumero() == numero)
                .findFirst()
                .map(Acomodacao::liberar)
                .orElseThrow(() -> new IllegalArgumentException("Número da acomodação inválido"));
    }

    /**
     * Libera uma acomodação de acordo com seu número sem utilizar streams
     * @param numero numero da acomodação a ser liberada
     * @return resultado da liberação ou exceção caso o número seja inválido
     */
    public boolean liberarAcomodacaoPorNumeroSimples(int numero){
        for(Acomodacao acomodacao : acomodacoes){
            if(acomodacao.getNumero() == numero){
                return acomodacao.liberar();
            }
        }
        throw new IllegalArgumentException("Número da acomodação inválido");
    }

    /**
     * Calcula receita total das reservas utilizando streams
     * @return receita total das reservas
     */
    public double calcularReceitaTotalReservas(){
       return reservas.stream().mapToDouble(Reserva::calcularPrecoTotal).sum();
    }
    /**
     * Calcula receita total das reservas sem utilizar streams
     * @return receita total das reservas
     */
    public double calcularReceitaTotalReservasSimples(){
        double total = 0;
        for(Reserva reserva : reservas){
            total += reserva.calcularPrecoTotal();
        }
        return total;
    }


}
