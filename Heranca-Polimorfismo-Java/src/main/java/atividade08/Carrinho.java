package main.java.atividade08;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um carrinho de compras.
 */
public class Carrinho {

    private List<Produto> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    /**
     * Adiciona um produto ao carrinho.
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

    /**
     * Remove um produto do carrinho.
     * @param produto O produto a ser removido.
     */
    public void removerProduto(Produto produto) {
        itens.remove(produto);
    }

    /**
     * Calcula o total da compra com o frete de cada produto.
     * @return O valor total da compra.
     */
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : itens) {
            total += produto.getPreco() + produto.calcularFrete();
        }
        return total;
    }

    /**
     * Lista todos os itens no carrinho.
     */
    public void listarItens() {
        itens.forEach(System.out::println);
    }

}
