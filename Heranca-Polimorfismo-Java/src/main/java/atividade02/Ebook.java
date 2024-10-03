package main.java.atividade02;

public class Ebook extends ItemBiblioteca{

    private double tamanhoArtquivo;

    public Ebook(String titulo, String autor, int anoPublicacao, boolean disponivel, double tamanhoArtquivo) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.tamanhoArtquivo = tamanhoArtquivo;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.25;
    }
}
