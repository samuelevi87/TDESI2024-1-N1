package Exercicio07;

public class Pedido {
    int numeroPedido;
    double valorTotal;
    String status;

    public Pedido(int numeroPedido, double valorTotal, String status) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
