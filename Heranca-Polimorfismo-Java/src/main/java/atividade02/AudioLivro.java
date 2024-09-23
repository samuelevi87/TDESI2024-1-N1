package main.java.atividade02;

import org.w3c.dom.ls.LSOutput;

public class AudioLivro extends ItemBiblioteca {

    private Integer duracao;

    public AudioLivro(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer duracao) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.duracao = duracao;
    }


    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.35;
    }
}
