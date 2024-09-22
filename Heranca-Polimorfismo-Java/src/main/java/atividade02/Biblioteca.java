package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ItemBiblioteca> itensBiblioteca;

    public Biblioteca() {
        this.itensBiblioteca = new ArrayList<>();
    }
    public void adicionarItensABiblioteca(ItemBiblioteca item){
        this.itensBiblioteca.add(item);
    }
    public ItemBiblioteca encontrarPorTitulo(String titulo){
        for(ItemBiblioteca item : itensBiblioteca){
            if (item.getTitulo().equalsIgnoreCase(titulo)) {
                return item;
            }
        }
        return null;
    }
    public void emprestarItem(String titulo){
       encontrarPorTitulo(titulo).emprestar();
    }
    public void devolverItem(String titulo){
        encontrarPorTitulo(titulo).devolver();
    }
    public void calcularMulta(String titulo, int diasAtrasados){
        encontrarPorTitulo(titulo).calcularMulta(diasAtrasados);
    }
    public void listarItens(){
        itensBiblioteca.forEach(System.out::println);
    }
}
