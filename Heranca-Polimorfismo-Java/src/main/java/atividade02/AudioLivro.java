package main.java.atividade02;

public class AudioLivro extends ItemBiblioteca {

    private Integer duracaoMinutos;

    public AudioLivro(String titulo, String autor, Integer anoPublicacao, boolean disponivel, Integer duracaoMinutos) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.35;
    }
}
