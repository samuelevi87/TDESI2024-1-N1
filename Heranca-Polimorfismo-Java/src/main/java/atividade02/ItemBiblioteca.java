package main.java.atividade02;

public abstract class ItemBiblioteca {
    private String titulo;
    private String autor;
    private Integer anoPublicacao;
    private Boolean disponivel;

    public ItemBiblioteca(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }
    public void emprestar(){
        if(disponivel){
            this.disponivel = false;
        }else{
            System.out.println("Item não disponível");
        }
    }
    public void devolver(){
        if(!disponivel){
            disponivel = true;
        }else{
            System.out.println("Livro já disponível");
        }
    }
    public abstract double calcularMulta(int diasAtraso);

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

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + '\'' +
                ", autor: " + autor + '\'' +
                ", anoPublicacao: " + anoPublicacao +
                ", disponivel: " + disponivel;
    }
}
