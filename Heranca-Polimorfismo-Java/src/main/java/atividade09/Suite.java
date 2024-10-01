package main.java.atividade09;

public class Suite extends Acomodacao {
    private Integer numeroQuartos;
    private Boolean temSalaEstar;

    public Suite(Integer numero, Integer capacidade, Double precoPorNoite, Boolean disponivel, Integer numeroQuartos, Boolean temSalaEstar) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.numeroQuartos = numeroQuartos;
        this.temSalaEstar = temSalaEstar;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return precoPorNoite * numeroNoites * 1.5;
    }
}
