package main.java.atividade02;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<ItemBiblioteca> listaDeItens;

    public Biblioteca() {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca itemParaAdicionar) {
        this.listaDeItens.add(itemParaAdicionar);
    }

    public void emprestarItem(ItemBiblioteca itemParaEmprestar) {
        itemParaEmprestar.emprestar();
    }

    public void devolverItem(ItemBiblioteca itemParaDevolver) {
        itemParaDevolver.devolver();
    }

    public Double calcularMultaAtraso(ItemBiblioteca TituloLivroAtrasado, Integer DiasDeAtraso) {

        return TituloLivroAtrasado.calcularMulta(DiasDeAtraso);
    }

    public void listaItens() {
        for (ItemBiblioteca itemBiblioteca : listaDeItens) {
            System.out.println("Titulo: " + itemBiblioteca.getTitulo() + " Disponivel: " + itemBiblioteca.isDisponivel());
        }
    }
}
