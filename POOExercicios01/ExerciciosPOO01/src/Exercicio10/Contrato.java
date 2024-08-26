package Exercicio10;

public class Contrato {

    String numeroContrato;
    String descricao;
    double valor;
    int vigencia;

    public Contrato(String numeroContrato, String descricao, double valor, int vigencia) {
        this.numeroContrato = numeroContrato;
        this.descricao = descricao;
        this.valor = valor;
        this.vigencia = vigencia;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }
}
