package Exercicio10;

public class Contrato {
    private String numeroContrato;
    private String Descricao;
    private double valor;
    private int vigencia;

    public Contrato(String numeroContrato, String descricao, double valor, int vigencia) {
        this.numeroContrato = numeroContrato;
        Descricao = descricao;
        this.valor = valor;
        this.vigencia = vigencia;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return "Nova Vigencia : " + vigencia ;
    }
}
