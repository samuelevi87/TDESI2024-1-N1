package main.java.atividade02;

/**
 * Representa o Ebook
 */
public class Ebook extends ItemBiblioteca{
    private Double tamanhoArquivo;

    /**
     * constroi Ebook com :
     * @param titulo
     * @param autor
     * @param anoPublicacao
     * @param disponivel
     * @param tamanhoArquivo
     */
    public Ebook(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    /**
     * retorna o valor dos atrasos
     * @param diasAtrasados
     * @return
     */
    @Override
    public double calcularMulta(int diasAtrasados) {
        return diasAtrasados * 0.25;
    }
}
