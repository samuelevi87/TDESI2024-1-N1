package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<ItemBiblioteca>listaDeItens;

    public Biblioteca() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItens(ItemBiblioteca novoItem){
    this.listaDeItens.add(novoItem);
        System.out.println(novoItem.getTitulo()+ " foi adicionado");
    }

    public Boolean emprestar(String titulo){
        for (ItemBiblioteca livro : listaDeItens){
           if (livro.getTitulo().equalsIgnoreCase(titulo)){
               livro.emprestar();
               System.out.println("Livro com titulo "+ titulo +" foi emprestado" );
               return true;
           }

        }
        System.out.println("Livro com titulo "+titulo+" nao foi encontrado");
        return false;
    }

    public Boolean devolver (String titulo){
        for(ItemBiblioteca livro : listaDeItens){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                livro.devolver();
                System.out.println("Livro com titulo : "+ titulo + " foi devolvido");
                return true ;
            }
        }
        System.out.println("livro com Titulo " + titulo + " nao foi devolvido");
        return false;
    }

    public Double calcularMulta (String titulo , int diasAtrasados){
        for(ItemBiblioteca livro : listaDeItens) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro.calcularMulta(diasAtrasados);
            }
        }
        return null;
    }

    public void listaOsItems(){
        for (ItemBiblioteca livro : listaDeItens){
            if (livro.getDisponivel()){
                System.out.println("Livro "+livro.getTitulo());
            }
        }
    }
}
