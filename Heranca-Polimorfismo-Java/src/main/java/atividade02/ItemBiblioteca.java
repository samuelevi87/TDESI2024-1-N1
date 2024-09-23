package main.java.atividade02;

public abstract class ItemBiblioteca {

    private String titulo;
    private String autor;
    private Integer anoPub;
    private boolean disponivel;

    public ItemBiblioteca(String titulo, String autor, Integer anoPub, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPub = anoPub;
        this.disponivel = disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPub(Integer anoPub) {
        this.anoPub = anoPub;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPub() {
        return anoPub;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public boolean emprestar() {
        if (disponivel) {
            disponivel = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    public abstract double calcularMulta(Integer diasAtraso);

}
