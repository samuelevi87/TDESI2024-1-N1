package main.java.atividade02;

public class LivroFisico extends ItemBiblioteca {
    private int numeroPaginas;

    public LivroFisico(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.50;
    }
}

