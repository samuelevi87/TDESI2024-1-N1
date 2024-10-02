package main.java.atividade09;

public class QuartoStantard extends Acomodacao {
    public QuartoStantard(Integer numero, Integer capacidade, Double precoPorNoite, Boolean disponivel) {
        super(numero, capacidade, precoPorNoite, disponivel);
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return precoPorNoite * numeroNoites;
    }
}
