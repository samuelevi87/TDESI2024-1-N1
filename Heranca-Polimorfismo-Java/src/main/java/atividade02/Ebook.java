package main.java.atividade02;

/**
 * Representa um ebook da biblioteca
 */

public class Ebook extends ItemBiblioteca{
    private double tamanhoArquivo;

    /**
     * Constrói um ebook
     * @param titulo titulo do ebook
     * @param disponivel disponibilidade do ebook
     * @param anoPublicacao ano de publicação do ebook
     * @param autor autor do ebook
     * @param tamanhoArquivo tamanho do ebook em MB
     */

    public Ebook(String titulo, boolean disponivel, int anoPublicacao, String autor, double tamanhoArquivo) {
        super(titulo, disponivel, anoPublicacao, autor);
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    /**
     * Calcula o valor para dias de atraso do ebook
     * @param diasAtraso serve para calcular o atraso
     * @return o valor do atraso
     */

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.25;
    }
}
