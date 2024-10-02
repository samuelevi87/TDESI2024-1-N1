package main.java.atividade08;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um carrinho de compras.
 */
public class CorrecaoCarrinho {
    private List<CorrecaoProduto> itens;

    public CorrecaoCarrinho() {
        this.itens = new ArrayList<>();
    }

    /**
     * Adiciona um produto ao carrinho.
     *
     * @param produto O produto a ser adicionado.
     */
    public void adicionarProduto(CorrecaoProduto produto) {
        itens.add(produto);
    }

    /**
     * Remove um produto do carrinho.
     *
     * @param produto O produto a ser removido.
     */
    public void removerProduto(CorrecaoProduto produto) {
        itens.remove(produto);
    }

    /**
     * Calcula o total da compra, incluindo o frete de cada produto.
     *
     * @return O valor total da compra.
     */
    public double calcularTotal() {
        return itens.stream().mapToDouble(p -> p.getPreco() + p.calcularFrete()).sum();
    }

    /**
     * Versão simples do método calcularTotal.
     *
     * @return O valor total da compra.
     */
    public double calcularTotalSimples() {
        double total = 0;
        for (CorrecaoProduto p : itens) {
            total += p.getPreco() + p.calcularFrete();
        }
        return total;
    }

    /**
     * Lista todos os itens no carrinho.
     */
    public void listarItens() {
        itens.forEach(System.out::println);
    }

    /**
     * Versão simples do método listarItens.
     */
    public void listarItensSimples() {
        for (CorrecaoProduto p : itens) {
            System.out.println(p);
        }
    }
}