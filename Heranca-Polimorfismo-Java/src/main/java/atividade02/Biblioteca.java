package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<ItemBiblioteca> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item){
        acervo.add(item);
    }

    public Boolean emprestarLivro(String nome){
        for (ItemBiblioteca item : acervo){
            item.getTitulo().equalsIgnoreCase(nome);
            return item.emprestar();
        }
        return false;

    }

    public Boolean devolverLivro(String nome){
        for (ItemBiblioteca item : acervo){
            item.getTitulo().equalsIgnoreCase(nome);
            return item.devolver();
        }
        return false;
    }

    public Double multaLivro(String nome, int dias){
        for (ItemBiblioteca item : acervo){
            item.getTitulo().equalsIgnoreCase(nome);
            return item.calcularMulta(dias);
        }
        return 0.0;
    }

    public void listarLivros(){
        String lista = "";
        for (ItemBiblioteca item : acervo){
            if (item.isDisponivel()){
                lista += "Autor: "+item.getAutor()+"\nTitulo: "+item.getTitulo();
            };
        }
        System.out.println(lista);
    }
}
