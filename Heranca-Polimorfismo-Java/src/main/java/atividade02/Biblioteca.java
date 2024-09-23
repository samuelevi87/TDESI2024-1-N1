package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Representa uma biblioteca digital que gerencia diversos tipos de itens.
 */
public class Biblioteca {
    private List<ItemBiblioteca> acervo;

    /**
     * Constrói uma nova Biblioteca.
     * Inicializa o acervo de itens.
     */
    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    /**
     * Adiciona um item ao acervo da biblioteca.
     *
     * @param item O item a ser adicionado.
     */
    public void adicionarItem(ItemBiblioteca item) {
        acervo.add(item);
    }

    /**
     * Empresta um item do acervo, se disponível.
     *
     * @param titulo O título do item a ser emprestado.
     * @return true se o empréstimo foi bem-sucedido, false caso contrário.
     */
    public boolean emprestarItem(String titulo) {
        Optional<ItemBiblioteca> item = buscarItemPorTitulo(titulo);
        return item.map(ItemBiblioteca::emprestar).orElse(false);
    }

    /**
     * Empresta um item do acervo, se disponível (versão simples).
     *
     * @param titulo O título do item a ser emprestado.
     * @return true se o empréstimo foi bem-sucedido, false caso contrário.
     */
    public boolean emprestarItemSimples(String titulo) {
        for (ItemBiblioteca item : acervo) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item.emprestar();
            }
        }
        return false;
    }

    /**
     * Devolve um item ao acervo.
     *
     * @param titulo O título do item a ser devolvido.
     */
    public void devolverItem(String titulo) {
        buscarItemPorTitulo(titulo).ifPresent(ItemBiblioteca::devolver);
    }

    /**
     * Devolve um item ao acervo (versão simples).
     *
     * @param titulo O título do item a ser devolvido.
     */
    public void devolverItemSimples(String titulo) {
        for (ItemBiblioteca itemDaBiblioteca : acervo) {
            if (itemDaBiblioteca.getTitulo().equalsIgnoreCase(titulo)) {
                itemDaBiblioteca.devolver();
                break;
            }
        }
    }

    /**
     * Calcula a multa para um item atrasado.
     *
     * @param titulo O título do item.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa calculada.
     */
    public double calcularMulta(String titulo, int diasAtraso) {
        return buscarItemPorTitulo(titulo)
                .map(item -> item.calcularMulta(diasAtraso))
                .orElse(0.0);
    }

    /**
     * Calcula a multa para um item atrasado (versão simples).
     *
     * @param titulo O título do item.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa calculada.
     */
    public double calcularMultaSimples(String titulo, int diasAtraso) {
        for (ItemBiblioteca item : acervo) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item.calcularMulta(diasAtraso);
            }
        }
        return 0.0;
    }

    /**
     * Lista todos os itens disponíveis no acervo.
     */
    public void listarItensDisponiveis() {
        acervo.stream()
                .filter(ItemBiblioteca::isDisponivel)
                .forEach(System.out::println);
    }

    /**
     * Lista todos os itens disponíveis no acervo (versão simples).
     */
    public void listarItensDisponiveisSimples() {
        for (ItemBiblioteca item : acervo) {
            if (item.isDisponivel()) {
                System.out.println(item);
            }
        }
    }

    private Optional<ItemBiblioteca> buscarItemPorTitulo(String titulo) {
        return acervo.stream()
                .filter(item -> item.getTitulo().equalsIgnoreCase(titulo))
                .findFirst();
    }

    /**
     * Busca um item pelo título (versão simples).
     *
     * @param titulo O título do item a ser buscado.
     * @return O item encontrado, ou null se não for encontrado.
     */
    private ItemBiblioteca buscarItemPorTituloSimples(String titulo) {
        for (ItemBiblioteca itemDaBiblioteca : acervo) {
            if (itemDaBiblioteca.getTitulo().equalsIgnoreCase(titulo)) {
                return itemDaBiblioteca;
            }
        }
        return null;
    }
}