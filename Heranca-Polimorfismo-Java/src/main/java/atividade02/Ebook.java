package main.java.atividade02;

public class Ebook extends ItemBiblioteca {

    private double tamanhoArquivo;

    public Ebook(String titulo, String autor, Integer anoPub, boolean disponivel, double tamanhoArquivo) {
        super(titulo, autor, anoPub, disponivel);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double calcularMulta(Integer diasAtraso) {
        return diasAtraso * 0.25;
    }
}
