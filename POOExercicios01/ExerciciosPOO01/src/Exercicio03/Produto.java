package Exercicio03;

public class Produto {
    private  String nome;
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
    public void adicionarEstoque(int quantidade){
        quantidadeEmEstoque += quantidade;
    }
    public void removerEstoque(int quantidade){
        quantidadeEmEstoque = Integer.max((quantidadeEmEstoque - quantidade), 0);
    }

    @Override
    public String toString() {
        return "Produto: " +
                "nome: " + nome + ", preco: " + preco +
                ", quantidade em estoque: " + quantidadeEmEstoque;
    }
}
