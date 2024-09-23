package main.java.atividade02;

/**
 * Representa um e-book na biblioteca digital.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para e-books.
 */
public class Ebook extends ItemBiblioteca {
    private double tamanhoArquivoMB;

    /**
     * Constrói um novo Ebook.
     *
     * @param titulo O título do e-book.
     * @param autor O autor do e-book.
     * @param anoPublicacao O ano de publicação do e-book.
     * @param tamanhoArquivoMB O tamanho do arquivo do e-book em megabytes.
     */
    public Ebook(String titulo, String autor, int anoPublicacao, Double tamanhoArquivoMB) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    /**
     * Calcula a multa para o e-book, caso esteja atrasado.
     * A multa é de R$ 0,25 por dia de atraso.
     *
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa calculada.
     */
    @Override
    public double calcularMulta(int diasAtraso) {

        return diasAtraso * 0.25;
    }


    public double getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

    public void setTamanhoArquivoMB(double tamanhoArquivoMB) {

        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }
}
