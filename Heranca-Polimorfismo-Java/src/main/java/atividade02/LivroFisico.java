package main.java.atividade02;

/**
 * Representa um livro físico na biblioteca digital.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para livros físicos.
 */
public class LivroFisico extends ItemBiblioteca {
    private int numeroPaginas;

    /**
     * Constrói um novo LivroFisico.
     *
     * @param titulo O título do livro.
     * @param autor O autor do livro.
     * @param anoPublicacao O ano de publicação do livro.
     * @param numeroPaginas O número de páginas do livro.
     */
    public LivroFisico(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Calcula a multa para o livro físico, caso esteja atrasado.
     * A multa é de R$ 0,50 por dia de atraso.
     *
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa calculada.
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.50;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}