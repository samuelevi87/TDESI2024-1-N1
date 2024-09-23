package main.java.atividade02;

public abstract class ItemBiblioteca {

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

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar() {
        if(this.disponivel){
            this.disponivel = false;
            System.out.println("O livro foi emprestado com sucesso!");
        }else{
            System.out.println("O livro não está disponível para emprestimo.");
        }
    }


    public void devolver() {
        if(!this.disponivel) {
            this.disponivel = true;
            System.out.println("O livro foi devolvido com sucesso!");
        }else{
            System.out.println("O livro não possui empréstimo para ser devolvido.");
        }
    }

    public boolean isDisponivel(){
        return disponivel;
    }
    public abstract double calcularMulta(int diasAtraso);

}
