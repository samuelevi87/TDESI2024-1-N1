package main.java.atividade02;

/**
 * Representa um livro físico na biblioteca
 * Estende a classe ItemBiblioteca e adiciona funcionalidades especificas
 */
public class LivroFisico extends ItemBiblioteca{

    private Integer numeroPaginas;

    /**
     * Constrói um Livro fisico
     * @param titulo titulo do livro
     * @param autor autor do livro
     * @param anoPublicacao ano de publicação do livro
     * @param numeroPaginas numero de páginas do livro
     */
    public LivroFisico(String titulo, String autor, Integer anoPublicacao, Integer numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Calcula a multa do livro físico
     * A multa é calculada sendo 0.50 por cada dia de atraso
     * @param diasAtraso dias de atraso do item
     * @return multa total do livro físico
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return 0.50 * diasAtraso;
    }
}
