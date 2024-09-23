package main.java.atividade02;

/**
 * Representa uma Biblioteca Digital
 */
public abstract class  ItemBiblioteca {
    private String titulo ;
    private String autor;
    private Integer anoPublicacao ;
    private Boolean disponivel;

    /**
     * controi os Item da Biblioteca Digital com :
     * @param titulo
     * @param autor
     * @param anoPublicacao
     * @param disponivel
     */
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

    /**
     * metodo de verificacao para fazer emprestimo
     */
    public void emprestar(){
        if (disponivel){
            disponivel = false;
        }
        else{
         disponivel = true;
        }

    }

    /**
     * metodo de devolucao
     */
    public void devolver(){
        if (disponivel){
            disponivel = true ;
        }
        else{
            disponivel = false;
        }
    }
public abstract double calcularMulta(int diasAtrasados);


}
