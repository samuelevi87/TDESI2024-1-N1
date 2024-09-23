package main.java.atividade02;

public class AudioLivro extends ItemBiblioteca {
    private int duracaoMinutos;

    public AudioLivro(String titulo, String autor, int anoPublicacao, int duracaoMinutos) {
        super(titulo, autor, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.35;
    }
}

