package main.java.atividade08;

import java.util.ArrayList;

/***
 * Classe que representa um carrinho de compras.
 */
public class Carrinho {
    private ArrayList<Produto> produtos;

    /***
     * Construtor que inicializa a lista de produtos.
     */
    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    /***
     * Adiciona um produto ao carrinho.
     *
     * @param produto O produto a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho.");
    }

    /***
     * Remove um produto do carrinho.
     *
     * @param id O ID do produto a ser removido
     */
    public void removerProduto(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto com ID " + id + " removido do carrinho.");
    }

    /***
     * Calcula o total da compra.
     *
     * @return O total da compra
     */
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() + produto.calcularFrete();
        }
        return total;
    }

    /***
     * Lista todos os itens no carrinho.
     */
    public void listarProdutos() {
        System.out.println("Produtos no carrinho:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + " (ID: " + produto.getId() + ")");
        }
    }
}
