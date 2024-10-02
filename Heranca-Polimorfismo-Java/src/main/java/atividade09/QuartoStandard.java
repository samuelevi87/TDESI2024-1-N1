package main.java.atividade09;

/**
 * Representa um quarto standard
 */
public class QuartoStandard extends Acomodacao{

    public enum TipoToCama {
        SOLTEIRO, CASAL
    }

    private TipoToCama tipoToCama;

    /**
     * Constrói um QuartoStandard
     * @param numero numero do quarto
     * @param capacidade capacidade de pessoas do quarto
     * @param precoPorNoite preço por noite do quarto
     * @param tipoToCama tipo da cama do quarto
     */
    public QuartoStandard(int numero, int capacidade, double precoPorNoite, TipoToCama tipoToCama) {
        super(numero, capacidade, precoPorNoite);
        this.tipoToCama = tipoToCama;
    }

    /**
     * Calcula o preço total com base no preço por noite e número de noites
     * @param numeroNoites numero de noites da reserva
     * @return preço total
     */
    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites;
    }

    public TipoToCama getTipoToCama() {
        return tipoToCama;
    }

    public void setTipoToCama(TipoToCama tipoToCama) {
        this.tipoToCama = tipoToCama;
    }
}
