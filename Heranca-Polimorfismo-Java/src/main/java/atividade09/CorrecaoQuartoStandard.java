package main.java.atividade09;

/**
 * Classe que representa um quarto standard.
 */
public class CorrecaoQuartoStandard extends CorrecaoAcomodacao {
    private CorrecaoTipoCama tipoCama;

    /**
     * Construtor para a classe QuartoStandard.
     *
     * @param numero        O número do quarto.
     * @param capacidade    A capacidade do quarto.
     * @param precoPorNoite O preço por noite do quarto.
     * @param disponivel    A disponibilidade inicial do quarto.
     * @param tipoCama      O tipo de cama do quarto.
     */
    public CorrecaoQuartoStandard(int numero, int capacidade, double precoPorNoite, boolean disponivel, CorrecaoTipoCama tipoCama) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.tipoCama = tipoCama;
    }

    // Getter e setter específico
    public CorrecaoTipoCama getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(CorrecaoTipoCama tipoCama) {
        this.tipoCama = tipoCama;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites;
    }
}