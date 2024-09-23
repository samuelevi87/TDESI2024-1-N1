package main.java.atividade02;

public class AudioLivro extends ItemBiblioteca {

    private Integer duracaoMinutos;

    public AudioLivro(String titulo, String autor, Integer anoPub, boolean disponivel, Integer duracaoMinutos) {
        super(titulo, autor, anoPub, disponivel);
        this.duracaoMinutos = duracaoMinutos;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(Integer duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public double calcularMulta(Integer diasAtraso) {
        return diasAtraso * 0.35;
    }
}
