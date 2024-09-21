package main.java.atividade02;

public class LivroFisico extends ItemBiblioteca {

    private int numeroDePaginas;
    private static final double MULTA_DIARIA = 0.50;
    /***
     * @param Titulo ira ler o nome do livro.
     * @param Autor ira informar o autor que escreveu.
     * @param AnoPublicado informara o ano que foi postado.
     * @param Disponivel se ainda esta a venda ou algo do tipo.
     */
    public LivroFisico(String Titulo, String Autor, int AnoPublicado, boolean Disponivel, int numeroPaginas) {
        super(Titulo, Autor, AnoPublicado, Disponivel);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public double calcularMulta(int diasAtrasados) {
        return diasAtrasados > 0 ? diasAtrasados * MULTA_DIARIA : 0.0;
    }

    /**
     * metodo getter usado para o numero de pagina dos itens.
     * @return
     */
    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    /**
     * metodo Setter para as paginas do item.
     * @param numeroDePaginas
     */
    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
