package main.java.atividade02;

public class Ebook extends ItemBiblioteca {

    private double tamanhoDoArquivo;
    public static final double MULTA_DIARIA = 0.25;

    /***
     * @param Titulo ira ler o nome do arquivo.
     * @param Autor ira informar o autor que escreveu.
     * @param AnoPublicado informara o ano que foi postado.
     * @param Disponivel se ainda esta a venda ou algo do tipo.
     */
    public Ebook(String Titulo, String Autor, int AnoPublicado, boolean Disponivel){
        super(Titulo,Autor,AnoPublicado,Disponivel);
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }
    @Override
    public double calcularMulta(int diasAtrasados) {
        return diasAtrasados > 0 ? diasAtrasados * MULTA_DIARIA:0.0;
    }

    /**
     * medodo getter suadodo para o tamanho do arquivo
     * @return
     */
    public double getTamanhoDoArquivo() {
        return tamanhoDoArquivo;
    }

    /**
     * metodo setter usado para o tamnanho do arquivo.
     * @param tamanhoDoArquivo
     */
    public void setTamanhoDoArquivo(double tamanhoDoArquivo) {
        this.tamanhoDoArquivo = tamanhoDoArquivo;
    }
}
