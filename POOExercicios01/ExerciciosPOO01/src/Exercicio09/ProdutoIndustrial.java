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

    public double calcularMargemLucro(){
        return precoVenda - precoCusto;
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

    @Override
    public String toString() {
        return "ProdutoIndustrial{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", precoCusto=" + precoCusto +
                ", precoVenda=" + precoVenda +
                '}';
    }
}