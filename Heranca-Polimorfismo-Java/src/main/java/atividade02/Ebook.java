package main.java.atividade02;
/**
 * Representa um livro ebook
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas.
 */
public class Ebook extends ItemBiblioteca{

    private Double tamanhoArquivo;

    /**
     * Constrói um desenvolvedor.
     *
     * @param titulo                 O nome do livro.
     * @param autor                  O autor do livro.
     * @param anoPublicacao          O ano de publicação do livro.
     * @param disponivel A disponibilidade do livro.
     * @param disponivel o tamanho do arquivo.
     */
    public Ebook(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    /**
     * Calcula a multa por atraso.
     * O Ebook possui um valor de R$ 0,25 de multa por dia de atraso.
     * @return O valor da multa.
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.25;
    }
}
