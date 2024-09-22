package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a biblioteca que gerencia os itens
 */
public class Biblioteca {
    private List<ItemBiblioteca> itensBiblioteca;

    /**
     * Constroi uma nova biblioteca
     * Inicializa a lista de itens
     */
    public Biblioteca() {
        this.itensBiblioteca = new ArrayList<>();
    }

    /**
     * Adiciona um item na lista de itens
     * @param item
     */
    public void adicionarItensABiblioteca(ItemBiblioteca item){
        this.itensBiblioteca.add(item);
    }

    /**
     * Encontra livro por título
     * Método privado utilizado para buscar o item pelo título em outros métodos da mesma classe
     * @param titulo
     * @return retorna o item caso ele seja encontrado e nulo caso não tenha item com o título passado no parâmetro
     */
    private ItemBiblioteca encontrarPorTitulo(String titulo){
        for(ItemBiblioteca item : itensBiblioteca){
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }

    /**
     * Empresta um item da biblioteca, se encontrado, com base no título fornecido.
     * Se o item não for encontrado, exibe uma mensagem de erro.
     * @param titulo o título do item a ser emprestado.
     */
    public void emprestarItem(String titulo){
        ItemBiblioteca itemEncontrado = encontrarPorTitulo(titulo);
        if(itemEncontrado == null){
            System.out.println("Item com título '" + titulo + "' não encontrado.");
        }else{
            itemEncontrado.emprestar();
        }
    }
    /**
     * Devolve um item à biblioteca, se encontrado, com base no título fornecido.
     * Se o item não for encontrado, exibe uma mensagem de erro.
     * @param titulo o título do item a ser devolvido.
     */
    public void devolverItem(String titulo){
        ItemBiblioteca itemEncontrado = encontrarPorTitulo(titulo);
        if(itemEncontrado == null){
            System.out.println("Item com título '" + titulo + "' não encontrado.");
        }else{
            itemEncontrado.emprestar();
        }
    }
    /**
     * Calcula a multa de um item baseado nos dias de atraso.
     * @param titulo o título do item para o qual a multa será calculada.
     * @param diasAtrasados o número de dias de atraso na devolução.
     * @return o valor da multa, ou 0.0 se o item não for encontrado.
     */
    public Double calcularMulta(String titulo, int diasAtrasados){
        ItemBiblioteca itemEncontrado = encontrarPorTitulo(titulo);
        if (itemEncontrado == null) {
            System.out.println("Item com título '" + titulo + "' não encontrado.");
            return 0.0;
        }
        return itemEncontrado.calcularMulta(diasAtrasados);
    }
    /**
     * Lista todos os itens da biblioteca
     */
    public void listarItens(){
        itensBiblioteca.forEach(System.out::println);
    }
}
