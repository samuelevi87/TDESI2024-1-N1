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
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
        } else {
            System.out.println("quantidade a adicionar deve ser positiva.");
        }
    }
    public void removerEstoque(int quantidade) {
        if (quantidade > 0) {
            if (this.quantidadeEmEstoque >= quantidade) {
                this.quantidadeEmEstoque -= quantidade;
            } else {
                System.out.println("quantidade em estoque insuficiente para a remoção.");
            }
        } else {
            System.out.println("quantidade a remover deve ser positiva.");
        }
    }

}
