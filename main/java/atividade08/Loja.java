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
     *
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(Produto produto) {
        estoque.add(produto);
    }

    /**
     * Remove um produto do estoque da loja.
     *
     * @param produto O produto a ser removido.
     */
    public void removerProduto(Produto produto) {
        estoque.remove(produto);
    }

    /**
     * Busca produtos por nome.
     *
     * @param nome O nome do produto a ser buscado.
     * @return Uma lista de produtos que correspondem ao nome buscado.
     */
    public List<Produto> buscarPorNome(String nome) {
        return estoque.stream()
                .filter(p -> p.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    /**
     * Versão simples do método buscarPorNome.
     *
     * @param nome O nome do produto a ser buscado.
     * @return Uma lista de produtos que correspondem ao nome buscado.
     */
    public List<Produto> buscarPorNomeSimples(String nome) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : estoque) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    /**
     * Lista produtos por categoria (tipo de subclasse).
     *
     * @param categoria A classe da categoria desejada.
     * @return Uma lista de produtos da categoria especificada.
     */
    public List<Produto> listarPorCategoria(Class<? extends Produto> categoria) {
        return estoque.stream()
                .filter(categoria::isInstance)
                .collect(Collectors.toList());
    }

    /**
     * Versão simples do método listarPorCategoria.
     *
     * @param categoria A classe da categoria desejada.
     * @return Uma lista de produtos da categoria especificada.
     */
    public List<Produto> listarPorCategoriaSimples(Class<? extends Produto> categoria) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : estoque) {
            if (categoria.isInstance(p)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}