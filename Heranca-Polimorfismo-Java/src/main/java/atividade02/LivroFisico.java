package main.java.atividade02;

public class LivroFisico extends ItemBiblioteca {

    private Integer numeroPaginas;

    public LivroFisico(String titulo, String autor, Integer anoPub, boolean disponivel, Integer numeroPaginas) {
        super(titulo, autor, anoPub, disponivel);
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public double calcularMulta(Integer diasAtraso) {
        return diasAtraso * 0.50;
    }
}
