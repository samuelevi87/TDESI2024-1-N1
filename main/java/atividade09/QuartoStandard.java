package main.java.atividade09;

/**
 * Classe que representa um quarto standard.
 */
public class QuartoStandard extends Acomodacao {
    private TipoCama tipoCama;

    /**
     * Construtor para a classe QuartoStandard.
     *
     * @param numero        O número do quarto.
     * @param capacidade    A capacidade do quarto.
     * @param precoPorNoite O preço por noite do quarto.
     * @param disponivel    A disponibilidade inicial do quarto.
     * @param tipoCama      O tipo de cama do quarto.
     */
    public QuartoStandard(int numero, int capacidade, double precoPorNoite, boolean disponivel, TipoCama tipoCama) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.tipoCama = tipoCama;
    }

    // Getter e setter específico
    public TipoCama getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(TipoCama tipoCama) {
        this.tipoCama = tipoCama;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites;
    }

}
