package Exercicio10;

public class Contrato {
    private String numeroContrato;
    private String descricao;
    private double valor;
    private int vigencia;

    public Contrato(String numeroContrato, String descricao, double valor, int vigencia) {
        this.numeroContrato = numeroContrato;
        this.descricao = descricao;
        this.valor = valor;
        this.vigencia = vigencia;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
        System.out.println("Vigência alterada com sucesso!");
    }
}

