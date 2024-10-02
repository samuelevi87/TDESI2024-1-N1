package main.java.atividade09;

public class Acomodacao {
    private int numero;
    private int capacidade;
    private double precoPorNoite;
    private boolean disponivel;

    public Acomodacao(int numero) {
        this.numero = numero;
    }

    public Acomodacao(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }

    public Acomodacao(boolean disponivel) {
        this.disponivel = disponivel;

    }
    public int getnumero() {
        return numero;
    }
    public void setnumero(int numero) {
        this.numero = numero;
    }
    public int getcapacidade() {
        return capacidade;
    }
    public void setcapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public double getprecoPorNoite() {
        return precoPorNoite;
    }
    public void setprecoPorNoite(double precoPorNoite) {
        this.precoPorNoite = precoPorNoite;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public void reservar(){

    }
}
