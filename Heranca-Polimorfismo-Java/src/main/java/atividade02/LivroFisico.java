package main.java.atividade02;

/**
 * Representa um livro fisico da biblioteca
 */

public class LivroFisico extends ItemBiblioteca{
    private int numeroPaginas;

    /**
     * Constrói um Livro Físico
     * @param titulo Titulo do livro
     * @param disponivel disponibilidade do livro
     * @param anoPublicacao ano de publicação do livro
     * @param autor autor do livro
     * @param numeroPaginas número de paginas do livro
     */

    public LivroFisico(String titulo, boolean disponivel, int anoPublicacao, String autor, int numeroPaginas) {
        super(titulo, disponivel, anoPublicacao, autor);
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Calcula o valor para dias de atraso do livro
     * @param diasAtraso serve para calcular o atraso
     * @return o valor do atraso
     */

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.50;
    }
}
