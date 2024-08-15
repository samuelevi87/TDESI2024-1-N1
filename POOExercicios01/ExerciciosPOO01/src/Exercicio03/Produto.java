package Exercicio03;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeDoEstoque;

    public Produto(String nome, double preco, int quantidadeDoEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeDoEstoque = quantidadeDoEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeDoEstoque() {
        return quantidadeDoEstoque;
    }

    public int setAdicionarEstoque(int quantidade){
        quantidadeDoEstoque += quantidade;
        return quantidadeDoEstoque;
    }

    public int setRemoverEstoque(int quantidade){
        quantidadeDoEstoque -= quantidade;
        return quantidadeDoEstoque;
    }

}
