package Exercicio03;

public class Produto {

    private String nome;
    private double preco;
    private int qntEmEstoque;

    public Produto(String nome, double preco, int qntEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qntEmEstoque = qntEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQntEmEstoque() {
        return qntEmEstoque;
    }

    public double setAdicionarEstoque(int quantidade) {

       qntEmEstoque += quantidade;

        return qntEmEstoque;
    }

    public double setRemoverEstoque(int quantidade) {

        qntEmEstoque -= quantidade;

        return qntEmEstoque;
    }
}
