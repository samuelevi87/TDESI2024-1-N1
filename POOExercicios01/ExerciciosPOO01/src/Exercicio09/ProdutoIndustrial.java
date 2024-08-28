package Exercicio09;

public class ProdutoIndustrial {
    private String codigo;
    private String nome;
    private double precoCusto;
    private double precoVenda;

    public ProdutoIndustrial(String codigoDoProduto, String nomeEscolhido, double precoCustoInformado, double precoVendaCadastrado) {
        this.codigo = codigoDoProduto;
        this.nome = nomeEscolhido;
        this.precoCusto = precoCustoInformado;
        this.precoVenda = precoVendaCadastrado;
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

    public double calcularMargemLucro(){
        return this.precoVenda - this.precoCusto;
    }
}