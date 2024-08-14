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
            quantidadeEmEstoque += quantidade;
            System.out.println("Adicionado " + quantidade + " itens ao estoque. Total em estoque: " + quantidadeEmEstoque);
        } else {
            System.out.println("Quantidade a adicionar deve ser positiva.");
        }
    }
    public void removerEstoque(int quantidade) {
        if (quantidade > 0) {
            if (quantidade <= quantidadeEmEstoque) {
                quantidadeEmEstoque -= quantidade;
                System.out.println("Removido " + quantidade + " itens do estoque. Total em estoque: " + quantidadeEmEstoque);
            } else {
                System.out.println("Quantidade a remover é maior do que a quantidade em estoque.");
            }
        } else {
            System.out.println("Quantidade a remover deve ser positiva.");
        }
    }
    public static void main(String[] args) {

        Produto produto = new Produto("Camiseta", 29.90, 100);

        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEmEstoque());

        produto.adicionarEstoque(50);
        produto.removerEstoque(30);
        produto.removerEstoque(150);
        produto.adicionarEstoque(-10);
    }
}
