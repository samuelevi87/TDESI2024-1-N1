package main.java.atividade02;

public class AudioLivro extends ItemBiblioteca{

    private int duracaoMinutos;

    public AudioLivro(String titulo, String autor, int anoPublicacao, boolean disponivel, int duracaoMinutos) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.35;
    }
}
