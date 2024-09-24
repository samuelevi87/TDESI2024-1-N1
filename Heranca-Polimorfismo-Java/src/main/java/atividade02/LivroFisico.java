package main.java.atividade02;
/**
 * Representa um livro Físico
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas.
 */
public class LivroFisico extends ItemBiblioteca{

    private Integer numeroPaginas;
    /**
     * Constrói um desenvolvedor.
     *
     * @param titulo                 O nome do livro.
     * @param autor                  O autor do livro.
     * @param anoPublicacao          O ano de publicação do livro.
     * @param disponivel A disponibilidade do livro.
     * @param numeroPaginas A quantidade de páginas do livro.
     */
    public LivroFisico(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer numeroPaginas) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.numeroPaginas = numeroPaginas;
    }
    /**
     * Calcula a multa por atraso.
     * O Livro fisico possui um valor de R$ 0,50 de multa por dia de atraso.
     * @return O valor da multa
     */

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.50;
    }
}
