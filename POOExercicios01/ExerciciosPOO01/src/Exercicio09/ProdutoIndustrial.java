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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double calcularMargemLucro() {
        double lucro;

        lucro = precoVenda - precoCusto;

        return lucro;
    }
}
