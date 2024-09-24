package main.java.atividade02;

public class LivroFisico extends ItemBiblioteca {

    private Integer numeroPaginas;

    public LivroFisico(String titulo, String autor, Integer anoPublicacao, boolean disponivel,Integer numeroPaginas) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.numeroPaginas = numeroPaginas;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public double calcularMulta(int diasAtraso) {

        return diasAtraso * 0.50;
    }
}
