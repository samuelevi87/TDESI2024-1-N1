package main.java.atividade02;

public class Ebook extends ItemBiblioteca{

    private Double tamanhoArquivo;

    public Ebook(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.tamanhoArquivo = tamanhoArquivo;
    }


    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.25;
    }
}
