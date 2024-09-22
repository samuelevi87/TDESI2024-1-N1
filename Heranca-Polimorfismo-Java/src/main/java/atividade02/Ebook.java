package main.java.atividade02;

/**
 * Representa um Ebook na biblioteca.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para ebooks,
 * como o tamanho do arquivo.
 */
public class Ebook extends ItemBiblioteca {
    private Double tamanhoArquivo;

    /**
     * Constrói um novo Ebook.
     * @param titulo O título do ebook.
     * @param autor O autor do ebook.
     * @param anoPublicacao O ano de publicação do ebook.
     * @param disponivel Indica se o ebook está disponível para empréstimo.
     * @param tamanhoArquivo O tamanho do arquivo do ebook em megabytes (MB).
     */
    public Ebook(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    /**
     * Calcula a multa por atraso para um ebook.
     * A multa é de 0,25 reais por dia de atraso.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa.
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.25;
    }
}