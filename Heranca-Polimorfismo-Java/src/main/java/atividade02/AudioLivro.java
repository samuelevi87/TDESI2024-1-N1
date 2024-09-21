package main.java.atividade02;

public class AudioLivro extends  ItemBiblioteca{

    private int duracaoMinutos;
    private static final double MULTA_DIARIA = 0.35;

    /***
     * @param Titulo ira ler o nome do audio livro.
     * @param Autor ira informar o autor que escreveu e fez o artigo.
     * @param AnoPublicado informara o ano que foi postado.
     * @param Disponivel se ainda esta a a venda ou algo do tipo.
     */

    public AudioLivro(String Titulo, String Autor, int AnoPublicado, boolean Disponivel, int duracaoMinutos) {
        super(Titulo, Autor, AnoPublicado, Disponivel);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public double calcularMulta(int diasAtrasados) {
        return diasAtrasados > 0 ? diasAtrasados * MULTA_DIARIA : 0.0;
    }

    /**
     * metodo getter usado para a duração de minutos/tempo do audii livro
     * @return
     */
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    /**
     * metodo setter usado para a duração de minutos/tempo do audii livro
     * @param duracaoMinutos
     */
    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}
