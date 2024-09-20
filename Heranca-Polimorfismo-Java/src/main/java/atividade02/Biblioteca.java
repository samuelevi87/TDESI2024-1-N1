package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a biblioteca onde se contêm os itens.
 */
public class Biblioteca {
    private List<ItemBiblioteca> itensDaBiblioteca;

    /**
     * Constrói uma biblioteca.
     * Inicializa a lista de itens.
     */
    public Biblioteca() {
        this.itensDaBiblioteca = new ArrayList<>();
    }

    public List<ItemBiblioteca> getItensDaBiblioteca() {
        return itensDaBiblioteca;
    }

    /**
     * Adiciona um item na lista de itens.
     * @param itemParaAdicionar Item a ser adicionado.
     */
    public void adicionarLivros(ItemBiblioteca itemParaAdicionar) {
        this.itensDaBiblioteca.add(itemParaAdicionar);
    }

    /**
     * Empresta um livro e altera sua disponibilidade para falso.
     * @param itemParaEmprestar O item a ser emprestado.
     */
    public void emprestarItem(ItemBiblioteca itemParaEmprestar) {
        itemParaEmprestar.emprestar();
    }

    /**
     * Devolve um livro e altera sua disponibilidade para verdadeiro.
     * @param itemParaDevolver O item a ser devolvido.
     */
    public void devolverItem(ItemBiblioteca itemParaDevolver) {
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
        itensDaBiblioteca.forEach(System.out::println);
    }
}
