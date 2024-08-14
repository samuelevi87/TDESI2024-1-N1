package Exercicio15;

public class Seguro {
    private String numeroApolice;
    private String tipo;
    private double valorCobertura;
    private double valorPremio;

    public Seguro(String numeroApolice, String tipo, double valorCobertura, double valorPremio) {
        this.numeroApolice = numeroApolice;
        this.tipo = tipo;
        this.valorCobertura = valorCobertura;
        this.valorPremio = valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }

    @Override
    public String toString() {
        return "Número da apólice: '" + numeroApolice + '\'' +
                "\nTipo: '" + tipo + '\'' +
                "\nValor da cobertura: R$" + valorCobertura +
                "\nValor do prêmio: R$" + valorPremio + "\n";
    }
}
