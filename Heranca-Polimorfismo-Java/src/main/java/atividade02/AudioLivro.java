package main.java.atividade02;

public class AudioLivro extends ItemBiblioteca{

    private Integer duracaoMinutos;

    public AudioLivro(String titulo, String autor, Integer anoPublicacao, Integer duracaoMinutos) {
        super(titulo, autor, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return 0.35 * diasAtraso;
    }
}
