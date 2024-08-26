package Exercicio03;

public class Produto {
    private String nome;
    private double preco;
    private int quntidadeEmEstoque;

    public Produto(String nome, double preco, int quntidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quntidadeEmEstoque = quntidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuntidadeEmEstoque() {
        return quntidadeEmEstoque;
    }

    public void addEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quntidadeEmEstoque += quantidade;
        } else {
            System.out.println("quantidade adicionada deve ser positiva! ");
        }
    }

    public void renoverEstoque(int quantidade) {
        if (quantidade > 0) {
if (this.quntidadeEmEstoque >= quantidade){
    this.quntidadeEmEstoque-= quantidade;
}
else {
    System.out.println("Quantidade insuficiente para remoção");
        }
    }
        else{
            System.out.println("Quantidade para remoção deve ser positiva");
        }
}