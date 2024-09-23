package main.java.atividade02;

/**
 * Represente o livro Fisico da Biblioteca Digital
 */
public class LivroFisico extends ItemBiblioteca{
    private Integer numeroPaginas;

    /**
     * controi o livro fisico com :
     * @param titulo
     * @param autor
     * @param anoPublicacao
     * @param disponivel
     * @param numeroPaginas
     */
    public LivroFisico(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer numeroPaginas) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * retorna o valor dos atrasos
     * @param diasAtrasados
     * @return
     */
    @Override
    public double calcularMulta(int diasAtrasados) {
        return diasAtrasados * 0.5;
    }
}
