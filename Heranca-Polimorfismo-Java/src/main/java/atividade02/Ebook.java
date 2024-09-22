package main.java.atividade02;

/**
 * Representa um ebook na biblioteca
 * Estende a classe ItemBiblioteca e adiciona funcionalidades especificas
 */
public class Ebook extends  ItemBiblioteca{

    private Double tamanhoArquivo;

    /**
     * Constrói um Ebook
     * @param titulo titulo do ebook
     * @param autor autor do ebook
     * @param anoPublicacao ano de publicação do ebook
     * @param tamanhoArquivo tamanho do arquivo do ebook
     */
    public Ebook(String titulo, String autor, Integer anoPublicacao, Double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(Double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    /**
     * Calcula a multa do Ebook
     * A multa é calculada sendo 0.25 por cada dia de atraso
     * @param diasAtraso dias de atraso do item
     * @return multa total do Ebook
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return 0.25 * diasAtraso;
    }
}
