package main.java.atividade09;

public class Suite extends Acomodacao{
    private Integer numeroQuartos;
    private Boolean temSalaEstar;

    public Suite(Integer numero, Integer capacidade, Double precoPorNoite, Integer numeroQuartos, Boolean temSalaEstar) {
        super(numero, capacidade, precoPorNoite);
        this.numeroQuartos = numeroQuartos;
        this.temSalaEstar = temSalaEstar;
    }

    @Override
    public Double calcularPrecoTotal(Integer numeroNoites) {
        return getPrecoPorNoite() * numeroNoites * 1.5;
    }
}
