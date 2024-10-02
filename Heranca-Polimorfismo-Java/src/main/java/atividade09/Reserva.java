package main.java.atividade09;

public class Reserva {
    private Acomodacao acomodacao;
    private int numeroNoites;

    public Reserva(Acomodacao acomodacao, int numeroNoites) {
        this.acomodacao = acomodacao;
        this.numeroNoites = numeroNoites;
    }
    public double calcularPrecoTotal() {
        return acomodacao.calcularPrecoTotal(numeroNoites);
    }

    public Acomodacao getAcomodacao() {
        return acomodacao;
    }

    public void setAcomodacao(Acomodacao acomodacao) {
        this.acomodacao = acomodacao;
    }

    public int getNumeroNoites() {
        return numeroNoites;
    }

    public void setNumeroNoites(int numeroNoites) {
        this.numeroNoites = numeroNoites;
    }
}
