package main.java.atividade02;

public class LivroFisico extends ItemBiblioteca {

    public LivroFisico(String titulo, String autor, Integer anoPublicacao, boolean disponivel) {
        super(titulo, autor, anoPublicacao, disponivel);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.50;
    }

}
