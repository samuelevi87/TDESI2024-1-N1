package main.java.atividade02;
/**
 * Representa a biblioteca que armazena os diferentes tipos de livros.
 */
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {


    private List<ItemBiblioteca> listaDeItensDeBiblioteca;

    /**
     * Constrói uma nova biblioteca.
     * Inicializa a lista de itens da biblioteca;
     */
    public Biblioteca() {
        this.listaDeItensDeBiblioteca = new ArrayList<>();
    }

    /**
     * Adiciona um item na lista de itens da biblioteca.
     * @param itensParaAdicionar.
     */

    public void adicionarItensBiblioteca(ItemBiblioteca itensParaAdicionar){
        this.listaDeItensDeBiblioteca.add(itensParaAdicionar);
    }
    /**
     * Determina o empréstimo do livro.
     * @param titulo O titulo dom item a ser emprestado.
     * @return Retorna se o empréstimo do livro foi bem sucedido.
     */

    public void emprestarItem(String titulo){
        for(ItemBiblioteca itensParaAdicionar : listaDeItensDeBiblioteca){
            if(itensParaAdicionar.getTitulo().equalsIgnoreCase(titulo)){
                itensParaAdicionar.emprestar();
            }
        }
    }

    /**
     * Determina a devolução do livro.
     * @return Retorna se o livro pode ser devolvido.
     */
    public void devolverItem(String titulo){
        for(ItemBiblioteca itensParaAdicionar : listaDeItensDeBiblioteca){
            if(itensParaAdicionar.getTitulo().equalsIgnoreCase(titulo)){
                itensParaAdicionar.devolver();
            }
        }

    }
    /**
     * Determina a multa pelo atraso.
     * @return O valor da multa.
     */
    public double multaAtraso(String titulo, Integer diasAtraso) {
        for (ItemBiblioteca itemParaAdicionar : listaDeItensDeBiblioteca) {
            if (itemParaAdicionar.getTitulo().equalsIgnoreCase(titulo)) {
               return itemParaAdicionar.calcularMulta(diasAtraso);
            }
        }
        return 0.0;
    }
    /**
     * Lista todos os itens da Biblioteca com seus respectivos títulos.
     */
    public void listarItensDisponiveis(){
        for(ItemBiblioteca itensParaAdicionar : listaDeItensDeBiblioteca){
            System.out.println("Titulo: " + itensParaAdicionar.getTitulo());
        }
    }
}

