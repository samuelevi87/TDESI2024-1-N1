package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma Biblioteca que armazena e gerencia itens emprestáveis.
 */
public class Biblioteca {
    private List<ItemBiblioteca> itemBiblioteca;

    /**
     * Constrói uma nova Biblioteca.
     * Inicializa a lista de livros.
     */
    public Biblioteca() {
        this.itemBiblioteca = new ArrayList<>();
    }

    public List<ItemBiblioteca> getItemBiblioteca() {
        return itemBiblioteca;
    }

    /**
     * Adiciona um novo item (livro) à biblioteca.
     * @param itemParaAdicionar O item a ser adicionado.
     */
    public void adicionarItem(ItemBiblioteca itemParaAdicionar) {
        this.itemBiblioteca.add(itemParaAdicionar);
    }

    /**
     * Empresta um livro e altera sua disponibilidade para falso.
     * @param itemParaEmprestar O item a ser emprestado.
     */
    public void emprestar(ItemBiblioteca itemParaEmprestar) {
        itemParaEmprestar.emprestar();
    }

    /**
     * Devolve um livro e altera sua disponibilidade para verdadeiro.
     * @param itemParaDevolver O item a ser devolvido.
     */
    public void devolver(ItemBiblioteca itemParaDevolver) {
        itemParaDevolver.devolver();
    }

    /**
     * Calcula a multa de devolução com base no tanto de dias atrasados.
     * @param itemAtrasado O item que está atrasado para devolução.
     * @param diasAtrasado O tanto de dias que está atrasado.
     * @return
     */
    public Double calcularMultaDevolucao(ItemBiblioteca itemAtrasado, Integer diasAtrasado) {
        return itemAtrasado.calcularMulta(diasAtrasado);
    }

    /**
     * Lista todos os itens que estão disponíveis.
     */
    public void listarItens() {
        itemBiblioteca.forEach(System.out::println);
    }
}