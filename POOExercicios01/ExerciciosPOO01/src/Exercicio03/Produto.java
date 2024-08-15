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
    public void adicionarEstoque(int quantidadeParaAdicionar){
        this.quantidadeEmEstoque +=quantidadeParaAdicionar;
    }
    public void removerEstoque(int quantidadeParaRemover){
        if (quantidadeEmEstoque-quantidadeParaRemover >0){
        this.quantidadeEmEstoque-=quantidadeParaRemover;
        }else {
            System.out.println("o estoque não pode ficar negativo");
        }
    }
}

