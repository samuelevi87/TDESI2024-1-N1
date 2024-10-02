package main.java.atividade09;

/**
 * Classe abstrata que representa uma acomodação genérica de um hotel
 */
public abstract class Acomodacao {
    private int numero;
    private int capacidade;
    private double precoPorNoite;
    private boolean disponivel;

    /**
     * Constrói uma Acomodacao
     * @param numero numero da acomodação
     * @param capacidade capacidade de pessoas na acomodação
     * @param precoPorNoite preço por noite da acomodação
     */
    public Acomodacao(int numero, int capacidade, double precoPorNoite) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = true;
    }

    /**
     * Reserva a acomodação setando a disponibilidade como falsa
     * @return true se a reserva foi bem sucedida e false caso contrário
     */
    public boolean reservar(){
        if(disponivel){
            disponivel = false;
            return true;
        }
        return false;
    }
    /**
     * Libera a acomodação setando a disponibilidade como verdadeira
     * @return true se a liberação foi bem sucedida e false caso contrário
     */
    public boolean liberar(){
        if(!disponivel){
            disponivel = true;
            return true;
        }
        return false;
    }

    /**
     * Método abstrato que calcula o preço total da reserva
     * @param numeroNoites numero de noites da reserva
     * @return o preço total
     */
    public abstract double calcularPrecoTotal(int numeroNoites);


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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Acomodacao{" +
                "numero=" + numero +
                ", capacidade=" + capacidade +
                ", precoPorNoite=" + precoPorNoite +
                ", disponivel=" + disponivel +
                '}';
    }
}
