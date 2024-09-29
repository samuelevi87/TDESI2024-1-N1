package main.java.atividade09;

public class QuartoStandard extends Acomodacao {
    /***
     * Enum que representa os tipos de cama disponíveis.
     */
    public enum TipoCama {
        SOLTEIRO, CASAL
    }

    private TipoCama tipoCama;
    /***
     * Construtor que inicializa os atributos do quarto padrão.
     *
     * @param numero        O número do quarto.
     * @param capacidade    A capacidade máxima de pessoas.
     * @param precoPorNoite O preço por noite do quarto.
     * @param disponivel    Indica se o quarto está disponível.
     * @param tipoCama     O tipo de cama no quarto.
     */
    public QuartoStandard(int numero, int capacidade, double precoPorNoite, boolean disponivel, TipoCama tipoCama) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.tipoCama = tipoCama;
    }
    /***
     * Calcula o preço total para o número de noites especificado.
     *
     * @param numeroNoites O número de noites.
     * @return O preço total.
     */
    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites;
    }
}
