package Exercicio03;

public class Produto {
    // Exercício 3:
    // 1. Criar uma instância da classe Produto.
    // 2. Exibir o nome, preço e quantidade em estoque.
    // 3. Adicionar itens ao estoque e exibir a nova quantidade.
    // 4. Remover itens do estoque e exibir a nova quantidade.

    String nome;
    double preco;
    int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public void addEstoque(int qtd) {
        this.qtdEstoque += qtd;
    }

    public void subEstoque(int qtd) {
        this.qtdEstoque -= qtd;
    }
}
