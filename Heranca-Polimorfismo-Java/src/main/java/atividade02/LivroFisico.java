package main.java.atividade02;

/**
 * Representa um Livro Físico na biblioteca.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para livros físicos,
 * como o número de páginas.
 */
public class LivroFisico extends ItemBiblioteca {
    private Integer numeroPaginas;

    /**
     * Constrói um novo Livro Físico.
     * @param titulo O título do livro.
     * @param autor O autor do livro.
     * @param anoPublicacao O ano de publicação do livro.
     * @param disponivel Indica se o livro está disponível para empréstimo.
     * @param numeroPaginas O número total de páginas do livro.
     */
    public LivroFisico(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer numeroPaginas) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Calcula a multa por atraso para um livro físico.
     * A multa é de 0,50 reais por dia de atraso.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa.
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.50;
    }
}
