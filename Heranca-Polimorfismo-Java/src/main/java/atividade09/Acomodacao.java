import java.util.ArrayList;

// Classe base abstrata Acomodacao
abstract class Acomodacao {
    private int numero;
    private int capacidade;
    private double precoPorNoite;
    private boolean disponivel;

    public Acomodacao(int numero, int capacidade, double precoPorNoite) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.disponivel = true; // Inicialmente disponível
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

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }

    public void liberar() {
        this.disponivel = true;
    }

    // Método abstrato para cálculo do preço total
    public abstract double calcularPrecoTotal(int numeroNoites);
}
