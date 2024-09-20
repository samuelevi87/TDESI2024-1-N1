package main.java.atividade02;

/**
 * Representa um livro físico na biblioteca.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para livros físicos.
 */
public class LivroFisico extends ItemBiblioteca{
    private Integer numeroPaginas;

    /**
     * Constrói um novo livro físico.
     * @param titulo O título do livro físico.
     * @param autor O autor do livro físico.
     * @param anoPublicacao O ano de publicação do livro físico.
     * @param disponivel A disponibilidade do livro físico.
     * @param numeroPaginas O número de páginas do livro físico.
     */
    public LivroFisico(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer numeroPaginas) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Calcula a multa por atraso com base no tanto de dias que está atrasado.
     * A multa é de 50 centavos por dia.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor total da multa.
     */
    @Override
    public Double calcularMulta(Integer diasAtraso) {
        return diasAtraso * 0.5;
    }
}
