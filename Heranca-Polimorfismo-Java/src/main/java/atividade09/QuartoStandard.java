package main.java.atividade09;

public class QuartoStandard extends Acomoacao{
    private TipoCama tipoCama;

    public QuartoStandard(int numero, int capacidade, double precoPorNoite, TipoCama tipoCama) {
        super(numero, capacidade, precoPorNoite);
        this.tipoCama = tipoCama;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites;
    }

    public TipoCama getTipoCama() {
        return tipoCama;
    }
}

