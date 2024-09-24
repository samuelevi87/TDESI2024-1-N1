package main.java.atividade02;

import java.time.LocalDate;

public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;
    private LocalDate dataEmprestimo;

    public ItemBiblioteca(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if (disponivel){
            disponivel = false;
            dataEmprestimo = LocalDate.now();
        }
    }

    public void devolver(){
        disponivel = true;
        dataEmprestimo = null;
    }

    public abstract double calcularMulta(int diasAtraso);

    @Override
    public String toString() {
        return "ItemBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}

