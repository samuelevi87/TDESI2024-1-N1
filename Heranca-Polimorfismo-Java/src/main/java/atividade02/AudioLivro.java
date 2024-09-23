package main.java.atividade02;

/**
 * Representa Audio Livro
 */
public class AudioLivro extends ItemBiblioteca{
    private Integer duracaoMinutos;

    /**
     * constroi Audio Livro com :
     * @param titulo
     * @param autor
     * @param anoPublicacao
     * @param disponivel
     * @param duracaoMinutos
     */
    public AudioLivro(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer duracaoMinutos) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.duracaoMinutos = duracaoMinutos;
    }

    /**
     * Retorna o valor caso que tiver atrasos
     * @param diasAtrasados
     * @return
     */
    @Override
    public double calcularMulta(int diasAtrasados) {
        return diasAtrasados * 0.35;
    }
}
