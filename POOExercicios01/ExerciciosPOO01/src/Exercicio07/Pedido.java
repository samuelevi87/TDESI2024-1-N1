package Exercicio07;

public class Pedido {
    private int numeroPedido;
    private double valorTotal;
    private String status;

    public Pedido(int numeroPedido, double valorTotal, String status) {
        this.numeroPedido = numeroPedido;
        this.valorTotal = valorTotal;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Número do pedido: " + numeroPedido +
                "\nValor total: " + valorTotal +
                "\nStatus: '" + status + "\'\n";
    }
}
