package Exercicio03;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEmEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (this.quantidadeEmEstoque >= quantidade) this.quantidadeEmEstoque -= quantidade;
    }

    @Override
    public String toString() {
        return "Produto: \'" + nome + '\'' +
                "\nPreco: R$" + preco +
                "\nQuantidade em estoque: " + quantidadeEmEstoque;
    }
}
