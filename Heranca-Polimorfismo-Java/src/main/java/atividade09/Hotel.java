package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    private List<Acomodacao> listaDeAcomodacoes;

    public Hotel() {
        this.listaDeAcomodacoes = new ArrayList<>();
    }

    public List<Acomodacao> getListaDeAcomodacoes() {
        return listaDeAcomodacoes;
    }

    public void adicionarAcomodacoes(Acomodacao acomodacao) {
        this.listaDeAcomodacoes.add(acomodacao);
    }

    public void listarAcomodacoesDisponiveis() {
        listaDeAcomodacoes.stream().filter(Acomodacao::getDisponivel).toList().forEach(System.out::println);
    }

    public void reservarAcomodacaoEspecifica(Integer numero) {
        listaDeAcomodacoes.stream().filter(acomodacao -> acomodacao.getNumero().equals(numero)).findFirst().ifPresent(Acomodacao::reservar);
    }

    public void liberarAcomodacaoEspecifica(Integer numero) {
        listaDeAcomodacoes.stream().filter(acomodacao -> acomodacao.getNumero().equals(numero)).findFirst().ifPresent(Acomodacao::liberar);
    }

    public Double calcularReceitaTotal(Integer numeroNoites) {
        return listaDeAcomodacoes.stream().mapToDouble(acomodacao -> acomodacao.calcularPrecoTotal(numeroNoites)).sum();
    }
}
