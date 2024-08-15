package Exercicio09;

public class ProdutoIndustrial {
    String codigo;
    String nome;
    double precoCusto;
    double precoVenda;

    public ProdutoIndustrial(String codigo, String nome, double precoCusto, double precoVenda) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double calcularMargemLucro() {
        return precoVenda - precoCusto;
    }
}
