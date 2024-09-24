package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ItemBiblioteca> livros;

    public Biblioteca(){
        livros = new ArrayList<>();
    }

    public void adicionarLivro(ItemBiblioteca item){
        livros.add(item);
    }

    public boolean emprestarLivro(String titulo){
        for (ItemBiblioteca item : livros) {
            if (item.getTitulo().equalsIgnoreCase(titulo)&& item.isDisponivel()) {
                item.emprestar();
                return true;
            }
        }
        return false;
    }

    public boolean devolverItem(String titulo) {
        for (ItemBiblioteca item : livros) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                item.devolver();
                return true;
            }
        }
        return false;
    }

    public boolean devolverItem(String titulo) {
        for (ItemBiblioteca item : livros) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                item.devolver();
                return true; // Item devolvido com sucesso
            }
        }
        return false; // Item não encontrado ou já disponível
    }

    public double calcularMulta(String titulo, int diasAtraso) {
        for (ItemBiblioteca item : livros) {
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item.calcularMulta(diasAtraso);
            }
        }
        return 0.0; // Item não encontrado ou não está atrasado
    }

    public void listarItensDisponiveis() {
        System.out.println("Itens disponíveis:");
        for (ItemBiblioteca item : livros) {
            if (item.isDisponivel()) {
                System.out.println(item);
            }
        }
    }
}
