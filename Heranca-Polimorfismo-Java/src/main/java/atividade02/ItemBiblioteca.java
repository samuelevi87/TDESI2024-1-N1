package main.java.atividade02;

public class ItemBiblioteca {

    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean disponivel;

    public ItemBiblioteca(String titulo, String autor, Integer anoPublicacao, Boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar () {
        disponivel = false;

    }
    public void devolver (){
        disponivel = true;
    }

    @Override
    public String toString() {
        return "ItemBiblioteca{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", disponivel=" + disponivel +
                '}';
    }
    public void calcularMulta
}
