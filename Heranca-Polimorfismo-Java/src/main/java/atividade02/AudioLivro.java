package main.java.atividade02;

/**
 * Representa um audio livro na biblioteca
 * Estende a classe ItemBiblioteca e adiciona funcionalidades especificas
 */
public class AudioLivro extends ItemBiblioteca{

    private Integer duracaoMinutos;

    /**
     * Constrói um AudioLivro
     * @param titulo titulo do livro
     * @param autor autor do livro
     * @param anoPublicacao ano de publicação do livro
     * @param duracaoMinutos duração em minutos do livro
     */
    public AudioLivro(String titulo, String autor, Integer anoPublicacao, Integer duracaoMinutos) {
        super(titulo, autor, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    /**
     * Calcula a multa do AudioLivro
     * A multa é calculada sendo 0.35 por cada dia de atraso
     * @param diasAtraso dias de atraso do item
     * @return multa total do AudioLivro
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return 0.35 * diasAtraso;
    }
}
