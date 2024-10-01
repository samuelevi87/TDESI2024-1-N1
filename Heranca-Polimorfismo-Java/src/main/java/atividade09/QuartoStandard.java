package main.java.atividade09;

public class QuartoStandard extends Acomodacao {

    private enum TipoToCama {
        SOLTEIRO,
        CASAL
    }

    private TipoToCama tipoToCama;

    public QuartoStandard(int numero, int capacidade, double precoPorNoite, boolean disponivel, TipoToCama tipoToCama) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.tipoToCama = tipoToCama;
    }

    public TipoToCama getTipoToCama() {
        return tipoToCama;
    }

    public void setTipoToCama(TipoToCama tipoToCama) {
        this.tipoToCama = tipoToCama;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites;
    }
}
