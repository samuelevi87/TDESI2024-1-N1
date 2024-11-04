package main.java.atividade09;

/**
 * Classe abstrata base para representar uma acomodação no sistema de reservas de hotel.
 */
public abstract class Acomodacao {
    private int numero;
    private int capacidade;
    private double precoPorNoite;
    private boolean disponivel;

    /**
     * Construtor para a classe Acomodacao.
     *
     * @param numero        O número da acomodação.
     * @param capacidade    A capacidade da acomodação.
     * @param precoPorNoite O preço por noite da acomodação.
     * @param disponivel    A disponibilidade inicial da acomodação.
     */
    public Acomodacao(int numero, int capacidade, double precoPorNoite, boolean disponivel) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = disponivel;
    }

    // Getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public boolean estaDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * Reserva a acomodação.
     */
    public void reservar() {
        this.disponivel = false;
    }

    /**
     * Libera a acomodação.
     */
    public void liberar() {
        this.disponivel = true;
    }

    /**
     * Método abstrato para calcular o preço total da estadia.
     *
     * @param numeroNoites O número de noites da estadia.
     * @return O preço total da estadia.
     */
    public abstract double calcularPrecoTotal(int numeroNoites);

    @Override
    public String toString() {
        return String.format("Acomodacao{numero=%d, capacidade=%d, precoPorNoite=%.2f, disponivel=%s}", numero, capacidade, precoPorNoite, disponivel);
    }
}