package main.java.atividade08;

import java.util.ArrayList;
import java.util.List;

/***
 * Classe que representa uma loja com um estoque de produtos.
 */
public class Loja {
    private List<Produto> estoque;

    /***
     * Construtor que inicializa a lista de produtos do estoque.
     */
    public Loja() {
        this.estoque = new ArrayList<>();
    }

    /***
     * Adiciona um produto ao estoque.
     *
     * @param produto O produto a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado ao estoque.");
    }

    /***
     * Remove um produto do estoque.
     *
     * @param id O ID do produto a ser removido
     */
    public void removerProduto(int id) {
        estoque.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto com ID " + id + " removido do estoque.");
    }

    /***
     * Busca um produto pelo nome.
     *
     * @param nome O nome do produto a ser buscado
     * @return O produto encontrado ou null se não encontrado
     */
    public Produto buscarProdutoPorNome(String nome) {
        for (Produto produto : estoque) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto; // Retorna o produto encontrado
            }
        }
        System.out.println("Produto " + nome + " não encontrado.");
        return null;
    }

    /***
     * Lista todos os produtos disponíveis no estoque.
     */
    public void listarProdutos() {
        System.out.println("Produtos no estoque:");
        for (Produto produto : estoque) {
            System.out.println("- " + produto.getNome() + " (ID: " + produto.getId() + ")");
        }
    }
}
