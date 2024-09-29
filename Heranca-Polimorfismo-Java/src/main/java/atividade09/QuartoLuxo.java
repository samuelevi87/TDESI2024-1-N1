package main.java.atividade09;

public class QuartoLuxo extends Acomodacao {
    private boolean temVistaMar;
    private boolean temHidromassagem;
    /***
     * Construtor que inicializa os atributos do quarto de luxo.
     *
     * @param numero          O número do quarto.
     * @param capacidade      A capacidade máxima de pessoas.
     * @param precoPorNoite   O preço por noite do quarto.
     * @param disponivel      Indica se o quarto está disponível.
     * @param temVistaMar     Indica se o quarto tem vista para o mar.
     * @param temHidromassagem Indica se o quarto possui hidromassagem.
     */
    public QuartoLuxo(int numero, int capacidade, double precoPorNoite, boolean disponivel, boolean temVistaMar, boolean temHidromassagem) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.temVistaMar = temVistaMar;
        this.temHidromassagem = temHidromassagem;
    }
    /***
     * Calcula o preço total para o número de noites especificado.
     *
     * @param numeroNoites O número de noites.
     * @return O preço total.
     */
    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        double precoTotal = getPrecoPorNoite() * numeroNoites;
        if (temVistaMar) precoTotal += 50;
        if (temHidromassagem) precoTotal += 100;
        return precoTotal;
    }
}
