package main.java.atividade02;

public class Ebook extends  ItemBiblioteca{

    private Double tamanhoArquivo;

    public Ebook(String titulo, String autor, Integer anoPublicacao, Double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public Double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(Double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return 0.25 * diasAtraso;
    }
}
