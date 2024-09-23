package main.java.atividade02;

public class LivroFisico extends ItemBiblioteca{
    private int numeroPaginas;


    public LivroFisico(String titulo, boolean disponivel, int anoPublicacao, String autor) {
        super(titulo, disponivel, anoPublicacao, autor);
    }

}
