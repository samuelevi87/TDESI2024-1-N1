package main.java.atividade09;

/**
 * Representa um quarto de luxo
 */
public class QuartoLuxo extends Acomodacao{

    private boolean temVistaMar;
    private boolean temHidromassagem;

    /**
     * Constrói um QuartoLuxo
     * @param numero numero do quarto
     * @param capacidade capacidade de pessoas do quarto
     * @param precoPorNoite preço por noite do quarto
     * @param temVistaMar existência de vista mar no quarto
     * @param temHidromassagem existência de hidromassagem no quarto
     */

    public QuartoLuxo(int numero, int capacidade, double precoPorNoite, boolean temVistaMar, boolean temHidromassagem) {
        super(numero, capacidade, precoPorNoite);
        this.temVistaMar = temVistaMar;
        this.temHidromassagem = temHidromassagem;
    }

    /**
     * Calcula o preço total baseado no preço por noite e número de noites com valores extras caso tenha vista mar e/ou hidromassagem
     * @param numeroNoites numero de noites da reserva
     * @return o preço total
     */
    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites +
                (temVistaMar ? 50 : 0) +
                (temHidromassagem ? 100 : 0);
    }

    public boolean isTemVistaMar() {
        return temVistaMar;
    }

    public void setTemVistaMar(boolean temVistaMar) {
        this.temVistaMar = temVistaMar;
    }

    public boolean isTemHidromassagem() {
        return temHidromassagem;
    }

    public void setTemHidromassagem(boolean temHidromassagem) {
        this.temHidromassagem = temHidromassagem;
    }
}
