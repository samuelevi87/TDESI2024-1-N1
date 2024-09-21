package Exercicio15;

/**
 * Classe que representa um Seguro contratado por uma empresa ou indivíduo.
 */
public class CorrecaoSeguro {
    private String numeroApolice;
    private String tipo;
    private double valorCobertura;
    private double valorPremio;

    /**
     * Construtor que inicializa os atributos do Seguro.
     *
     * @param numeroApolice  Número da apólice do seguro.
     * @param tipo           Tipo do seguro (ex.: "Vida", "Veículo").
     * @param valorCobertura Valor da cobertura do seguro.
     * @param valorPremio    Valor do prêmio do seguro.
     */
    public CorrecaoSeguro(String numeroApolice, String tipo, double valorCobertura, double valorPremio) {
        this.numeroApolice = numeroApolice;
        this.tipo = tipo;
        this.valorCobertura = valorCobertura;
        this.valorPremio = valorPremio;
    }

    /**
     * Retorna o número da apólice do seguro.
     *
     * @return Número da apólice.
     */
    public String getNumeroApolice() {
        return numeroApolice;
    }

    /**
     * Retorna o tipo de seguro.
     *
     * @return Tipo de seguro.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Retorna o valor da cobertura do seguro.
     *
     * @return Valor da cobertura.
     */
    public double getValorCobertura() {
        return valorCobertura;
    }

    /**
     * Retorna o valor do prêmio do seguro.
     *
     * @return Valor do prêmio.
     */
    public double getValorPremio() {
        return valorPremio;
    }

    /**
     * Define um novo valor para o prêmio do seguro.
     *
     * @param valorPremio Novo valor do prêmio.
     */
    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
}
