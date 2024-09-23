package main.java.atividade02;

/**
 * Representa um audio livro da biblioteca
 */

public class AudioLivro extends ItemBiblioteca{
    private int duracaoMinutos;

    /**
     * Constrói um audio livro
     * @param titulo titulo do audio livro
     * @param disponivel disponibilidade do audio livro
     * @param anoPublicacao ano de publicação do audiolivro
     * @param autor autor do audio livro
     * @param duracaoMinutos duração em minutos do audio livro
     */

    public AudioLivro(String titulo, boolean disponivel, int anoPublicacao, String autor, int duracaoMinutos) {
        super(titulo, disponivel, anoPublicacao, autor);
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    /**
     * Calcula o valor para dias de atraso do audio livro
     * @param diasAtraso serve para calcular o atraso
     * @return o valor do atraso
     */

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.35;
    }
}
