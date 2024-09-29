package main.java.atividade09;

public abstract class Acomodacao {
    private int numero;
    private int capacidade;
    private double precoPorNoite;
    private boolean disponivel;
    /***
     * Construtor que inicializa os atributos da acomodação.
     *
     * @param numero        O número da acomodação.
     * @param capacidade    A capacidade máxima de pessoas.
     * @param precoPorNoite O preço por noite da acomodação.
     * @param disponivel    Indica se a acomodação está disponível.
     */
    public Acomodacao(int numero, int capacidade, double precoPorNoite, boolean disponivel) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = disponivel;
    }
    /***
     * Obtém o número da acomodação.
     *
     * @return O número da acomodação.
     */
    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }

    public void liberar() {
        this.disponivel = true;
    }
    /***
     * Método abstrato que deve ser implementado por subclasses para calcular o preço total.
     *
     * @param numeroNoites O número de noites a serem consideradas para o cálculo.
     * @return O preço total calculado.
     */
    public abstract double calcularPrecoTotal(int numeroNoites);
}
