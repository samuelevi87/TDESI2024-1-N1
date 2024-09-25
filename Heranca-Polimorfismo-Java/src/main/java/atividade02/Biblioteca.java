package main.java.atividade02;

import java.util.ArrayList;

public class Biblioteca {

    ArrayList<ItemBiblioteca> itensBiblioteca;

    public Biblioteca() {
        itensBiblioteca = new ArrayList<>();
    }

    public void addItemBiblioteca(ItemBiblioteca item) {
        itensBiblioteca.add(item);
    }

    public void emprestar(String titulo) {
        for (ItemBiblioteca item : itensBiblioteca) {
            if (item.getTitulo().equalsIgnoreCase(titulo) && item.isDisponivel()) {
                item.emprestar();
            } else {
                System.out.println("Livro não encontrado ou indisponivél!");
            }
        }
    }

    public void devolver(String titulo) {
        for (ItemBiblioteca item : itensBiblioteca) {
            if (item.getTitulo().equalsIgnoreCase(titulo) && !item.isDisponivel()) {
                item.devolver();
            } else {
                System.out.println("Livro não encontrado ou já disponivél");
            }
        }
    }

    public double calcularAtraso(String titulo, Integer diasAtraso) {
        for (ItemBiblioteca item : itensBiblioteca) {
            if (item.getTitulo().equalsIgnoreCase(titulo) && !item.isDisponivel()) {
                return item.calcularMulta(diasAtraso);
            }
        }
        System.out.println("Algo de errado aconteceu!");
        return 0;
    }

    public void listarItensDisponiveis() {
        for (ItemBiblioteca item : itensBiblioteca) {
            if (item.isDisponivel()) {
                System.out.println(item);
            }
        }
    }
}
