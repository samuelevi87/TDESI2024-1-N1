package main.java.atividade02;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<ItemBiblioteca> itens;

    public Biblioteca(){
        itens = new ArrayList<>();
    }
    public void adicionarItem(ItemBiblioteca item){
        itens.add(item);
    }
    public void emprestarItem(String titulo){
        for(ItemBiblioteca item :itens){
            if (item.getTitulo().equalsIgnoreCase(titulo) && item.isDisponivel()) {
                item.emprestar();
                System.out.println("Item " + titulo + " emprestado com sucesso.");
                return;
        }
    }
        System.out.println("Item " + titulo + " não está disponível para empréstimo.");
}
    public void devolverItem(String titulo) {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo) && !item.isDisponivel()) {
                item.Devolver();
                System.out.println("Item " + titulo + " devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Item " + titulo + " não foi emprestado.");
    }

    public double calcularMulta(String titulo, int diasAtraso) {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item.calcularMulta(diasAtraso);
            }
        }
        System.out.println("Item " + titulo + " não encontrado.");
        return 0.0;
    }

    public void listarItensDisponiveis() {
        System.out.println("Itens disponíveis:");
        for (ItemBiblioteca item : itens) {
            if (item.isDisponivel()) {
                System.out.println("Título: " + item.getTitulo() + ", Autor: " + item.getAutor());
            }
        }
    }
}
