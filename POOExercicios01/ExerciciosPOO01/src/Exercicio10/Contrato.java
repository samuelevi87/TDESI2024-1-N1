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

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return "Número do contrato: '" + numeroContrato + '\'' +
                "\nDescrição: '" + descricao + '\'' +
                "\nValor: R$" + valor +
                "\nVigência: " + vigencia + " meses.\n";
    }
}
