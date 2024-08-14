package Exercicio09;

public class ProdutoIndustrial {
    private String codigo;
    private String nome;
    private double precoCusto;
    private double precoVenda;

    public ProdutoIndustrial(String codigo, String nome, double precoCusto, double precoVenda) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public double calcularMargemLucro() {
        return this.precoVenda - this.precoCusto;
    }

    @Override
    public String toString() {
        return "Codigo: '" + codigo + '\'' +
                "\nNome: '" + nome + '\'' +
                "\nPreço de custo: R$" + precoCusto +
                "\nPreço de venda: R$" + precoVenda + "\n";
    }
}
