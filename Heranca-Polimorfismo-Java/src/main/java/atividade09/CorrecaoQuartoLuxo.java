package main.java.atividade09;

/**
 * Classe que representa um quarto de luxo.
 */
public class CorrecaoQuartoLuxo extends CorrecaoAcomodacao {
    private boolean temVistaMar;
    private boolean temHidromassagem;

    /**
     * Construtor para a classe QuartoLuxo.
     *
     * @param numero           O número do quarto.
     * @param capacidade       A capacidade do quarto.
     * @param precoPorNoite    O preço por noite do quarto.
     * @param disponivel       A disponibilidade inicial do quarto.
     * @param temVistaMar      Se o quarto tem vista para o mar.
     * @param temHidromassagem Se o quarto tem hidromassagem.
     */
    public CorrecaoQuartoLuxo(int numero, int capacidade, double precoPorNoite, boolean disponivel, boolean temVistaMar, boolean temHidromassagem) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.temVistaMar = temVistaMar;
        this.temHidromassagem = temHidromassagem;
    }

    // Getters e setters específicos
    public boolean temVistaMar() {
        return temVistaMar;
    }

    public void setTemVistaMar(boolean temVistaMar) {
        this.temVistaMar = temVistaMar;
    }

    public boolean temHidromassagem() {
        return temHidromassagem;
    }

    public void setTemHidromassagem(boolean temHidromassagem) {
        this.temHidromassagem = temHidromassagem;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites + (temVistaMar ? 50 : 0) + (temHidromassagem ? 100 : 0);
    }
}