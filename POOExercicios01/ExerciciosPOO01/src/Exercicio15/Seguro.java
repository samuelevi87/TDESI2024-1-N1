package Exercicio15;

public class Seguro {
    private  String NumeroApolice;
    private String Tipo;
    private double valorCobertura;
    private double valorPremio;

    public Seguro(String numeroApolice, String tipo, double valorCobertura, double valorPremio) {
        NumeroApolice = numeroApolice;
        Tipo = tipo;
        this.valorCobertura = valorCobertura;
        this.valorPremio = valorPremio;
    }

    public String getNumeroApolice() {
        return NumeroApolice;
    }

    public String getTipo() {
        return Tipo;
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
    public String toString() {
        return "Premio Atualizado : "+valorPremio;
    }
}
