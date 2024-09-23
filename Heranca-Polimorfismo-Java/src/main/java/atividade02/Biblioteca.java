package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<ItemBiblioteca> listaDeItensDeBiblioteca;

    public Biblioteca() {
        this.listaDeItensDeBiblioteca = new ArrayList<>();
    }

    public void adicionarItensBiblioteca(ItemBiblioteca itensParaAdicionar){
        this.listaDeItensDeBiblioteca.add(itensParaAdicionar);
    }

    public void emprestarItem(String titulo){
        for(ItemBiblioteca itensParaAdicionar : listaDeItensDeBiblioteca){
            if(itensParaAdicionar.getTitulo().equalsIgnoreCase(titulo)){
                itensParaAdicionar.emprestar();
            }
        }
    }

    public void devolverItem(String titulo){
        for(ItemBiblioteca itensParaAdicionar : listaDeItensDeBiblioteca){
            if(itensParaAdicionar.getTitulo().equalsIgnoreCase(titulo)){
                itensParaAdicionar.devolver();
            }
        }

    }
    public double multaAtraso(String titulo, Integer diasAtraso) {
        for (ItemBiblioteca itemParaAdicionar : listaDeItensDeBiblioteca) {
            if (itemParaAdicionar.getTitulo().equalsIgnoreCase(titulo)) {
               return itemParaAdicionar.calcularMulta(diasAtraso);
            }
        }
        return 0.0;
    }

    public void listarItensDisponiveis(){
        for(ItemBiblioteca itensParaAdicionar : listaDeItensDeBiblioteca){
            System.out.println("Titulo: " + itensParaAdicionar.getTitulo());
        }
    }
}

