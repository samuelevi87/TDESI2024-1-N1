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

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorCobertura() {
        return valorCobertura;
    }

    public double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
}
