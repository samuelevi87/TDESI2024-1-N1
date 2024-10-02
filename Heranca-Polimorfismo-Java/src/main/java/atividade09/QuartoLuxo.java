package main.java.atividade09;

public class QuartoLuxo extends Acomoacao{
    private boolean temVistaMar;
    private boolean temHidromassagem;

    public QuartoLuxo(int numero, int capacidade, double precoPorNoite, boolean temVistaMar, boolean temHidromassagem) {
        super(numero, capacidade, precoPorNoite);
        this.temVistaMar = temVistaMar;
        this.temHidromassagem = temHidromassagem;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        double precoTotal = getPrecoPorNoite() * numeroNoites;
        if (temVistaMar) precoTotal += 50;
        if (temHidromassagem) precoTotal += 100;
        return precoTotal;
    }
}
