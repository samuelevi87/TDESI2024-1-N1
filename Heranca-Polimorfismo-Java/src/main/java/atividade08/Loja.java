package main.java.atividade08;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que representa uma loja.
 */
public class Loja {
    private List<Produto> estoque;

    public Loja() {
        this.estoque = new ArrayList<>();
    }

    /**
     * Adiciona um produto ao estoque da loja.
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    /**
     * Remove um produto do estoque da loja.
     * @param produto O produto a ser removido.
     */
    public void removerProduto(Produto produto) {
        estoque.remove(produto);
    }

    /**
     * Busca produtos por nome.
     * @param nome O nome do produto a ser buscado.
     * @return Uma lista de produtos que correspondem ao nome buscado.
     */

    public List<Produto> buscarPorNome(String nome) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto produto : estoque) {
            if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(produto);
            }
        }
        return resultado;
    }

    /**
     * Lista produtos por categoria (tipo de subclasse).
     * @param categoria A classe da categoria desejada.
     * @return Uma lista de produtos da categoria especificada.
     */
    public List<Produto> listarPorCategoria(Class<? extends Produto> categoria) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto produto : estoque) {
            if (categoria.isInstance(produto)) {
                resultado.add(produto);
            }
        }
        return resultado;
    }

}
