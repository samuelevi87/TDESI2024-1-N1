package main.java.atividade09;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nome;
    private List<Acomodacao> acomodacoes;
    /***
     * Construtor que inicializa os atributos do hotel.
     *
     * @param nome O nome do hotel.
     */
    public Hotel(String nome) {
        this.nome = nome;
        this.acomodacoes = new ArrayList<>();
    }
    /***
     * Obtém o nome do hotel.
     *
     * @return O nome do hotel.
     */
    public String getNome() {
        return nome;
    }
    /***
     * Adiciona uma acomodação ao hotel.
     *
     * @param acomodacao A acomodação a ser adicionada.
     */
    public void adicionarAcomodacao(Acomodacao acomodacao) {
        acomodacoes.add(acomodacao);
    }
    /***
     * Lista todas as acomodações disponíveis no hotel.
     *
     * @return Uma lista de acomodações disponíveis.
     */
    public List<Acomodacao> listarAcomodacoesDisponiveis() {
        List<Acomodacao> disponiveis = new ArrayList<>();
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.isDisponivel()) {
                disponiveis.add(acomodacao);
            }
        }
        return disponiveis;
    }
    /***
     * Reserva uma acomodação específica pelo número.
     *
     * @param numero O número da acomodação a ser reservada.
     */
    public void reservarAcomodacao(int numero) {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getNumero() == numero && acomodacao.isDisponivel()) {
                acomodacao.reservar();
                System.out.println("Acomodação " + numero + " reservada com sucesso.");
                return;
            }
        }
        System.out.println("Acomodação " + numero + " não disponível para reserva.");
    }
    /***
     * Libera uma acomodação específica pelo número.
     *
     * @param numero O número da acomodação a ser liberada.
     */
    public void liberarAcomodacao(int numero) {
        for (Acomodacao acomodacao : acomodacoes) {
            if (acomodacao.getNumero() == numero) {
                acomodacao.liberar();
                System.out.println("Acomodação " + numero + " liberada com sucesso.");
                return;
            }
        }
    }
    /***
     * Calcula a receita total das acomodações reservadas.
     *
     * @return A receita total das reservas.
     */
    public double calcularReceitaTotal() {
        double receita = 0;
        for (Acomodacao acomodacao : acomodacoes) {
            if (!acomodacao.isDisponivel()) {
                // Aqui você pode implementar a lógica para somar a receita com base nas reservas
                // Por exemplo, você poderia armazenar o número de noites reservadas em cada Acomodacao.
            }
        }
        return receita;
    }
}
