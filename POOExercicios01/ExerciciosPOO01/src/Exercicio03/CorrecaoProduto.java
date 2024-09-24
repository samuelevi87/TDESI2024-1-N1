package Exercicio03;

public class CorrecaoProduto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public CorrecaoProduto(String nome, double preco, int quantidadeEmEstoque) {
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
        if ((quantidadeEmEstoque - quantidade) >=0) {
            this.quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("A quantidade não pode ficar negativa!\nRemoção não efetuada!");
        }
    }
}
