package main.java.atividade09;

public class Suite extends Acomoacao{
    private int numeroQuartos;
    private boolean temSalaEstar;

    public Suite(int numero, int capacidade, double precoPorNoite, int numeroQuartos, boolean temSalaEstar) {
        super(numero, capacidade, precoPorNoite);
        this.numeroQuartos = numeroQuartos;
        this.temSalaEstar = temSalaEstar;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites * 1.5;
    }
}
