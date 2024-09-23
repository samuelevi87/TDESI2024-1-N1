package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a biblioteca que gerencia os itens da biblioteca.
 */

public class Biblioteca {

    private List<ItemBiblioteca> intensDaBiblioteca;

    /**
     * Constrói uma biblioteca
     * Inicializando uma lista de intens
     */

    public Biblioteca() {
        this.intensDaBiblioteca = new ArrayList<>();
    }

    /**
     * Adicionar um item a biblioteca
     * @param itemParaAdicionar
     */

    public void adicionarItensBiblioteca(ItemBiblioteca itemParaAdicionar){
        this.intensDaBiblioteca.add(itemParaAdicionar);
    }

    /**
     * Serve para empresta um item
     * @param itemParaEmprestar
     */

    public void emprestarItem(ItemBiblioteca itemParaEmprestar){
        itemParaEmprestar.emprestar();
    }

    /**
     * Serve para devolver um item
     * @param itemParaDevolver
     */

    public void devolverItem(ItemBiblioteca itemParaDevolver){
        itemParaDevolver.devolver();
    }

    /**
     * Calcula a multa por atraso por titulo
     * @param tituloItemAtrasado
     * @param diasDeAtraso
     * @return retorna o calculo da multa
     */

    public double caucularAtraso(ItemBiblioteca tituloItemAtrasado, Integer diasDeAtraso){
        return tituloItemAtrasado.calcularMulta(diasDeAtraso);
    }

    /**
     * Lista dos itens da bibloteca por titulo e verifica a
     * disponibilidade do item
     */

    public void listaDeItens(){
        for(ItemBiblioteca itemBiblioteca : intensDaBiblioteca){
            System.out.println("Titulo: " + itemBiblioteca.getTitulo() + "Disponibilidade: " + itemBiblioteca.isDisponivel());
        }
    }
}
