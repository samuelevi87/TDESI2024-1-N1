package main.java.atividade02;

import org.w3c.dom.ls.LSOutput;
/**
 * Representa um Audio Book
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas.
 */
public class AudioLivro extends ItemBiblioteca {

    private Integer duracao;
    /**
     * Constrói um desenvolvedor.
     *
     * @param titulo                 O nome do livro.
     * @param autor                  O autor do livro.
     * @param anoPublicacao          O ano de publicação do livro.
     * @param disponivel A disponibilidade do livro.
     * @param duracao A duração do livro.
     */
    public AudioLivro(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer duracao) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.duracao = duracao;
    }

    /**
     * Calcula a multa por atraso.
     * O Audio Livro possui um valor de R$ 0,35 de multa por dia de atraso.
     * @return O valor da multa.
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.35;
    }
}
