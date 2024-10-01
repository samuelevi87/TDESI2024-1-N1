package main.java.atividade09;

public class QuartoStandard extends Acomodacao{
    private TipoToCama tipoToCama;

    public enum TipoToCama {
        SOLTEIRO, CASAL
    }

    public QuartoStandard(Integer numero, Integer capacidade, Double precoPorNoite, TipoToCama tipoToCama) {
        super(numero, capacidade, precoPorNoite);
        this.tipoToCama = tipoToCama;
    }

    @Override
    public Double calcularPrecoTotal(Integer numeroNoites) {
        return getPrecoPorNoite() * numeroNoites;
    }
}
