package Exercicio07;

public class CorrecaoPedido {
    private int numeroPedido;
    private double valorTotal;
    private String status;

    public CorrecaoPedido(int numeroPedido, double valorTotal, String status) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}