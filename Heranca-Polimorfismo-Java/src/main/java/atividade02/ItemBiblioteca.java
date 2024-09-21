package main.java.atividade02;

public abstract class ItemBiblioteca {
    /***
     * @param Titulo ira ler o nome do item.
     * @param Autor ira informar o autor escreveu ou fez o item.
     * @param AnoPublicado informara o ano que foi postado.
     * @param Disponivel se ainda esta a venda ou algo do tipo.
     */
    private String Titulo;
    private String Autor;
    private int AnoPublicado;
    private boolean Disponivel;

    /**
     * construtor
     */

    public ItemBiblioteca(String titulo, String autor, int anoPublicado, boolean disponivel) {
        Titulo = titulo;
        Autor = autor;
        AnoPublicado = anoPublicado;
        Disponivel = disponivel;
    }

    /**
     * metodo Getter usado na clase
     * @return
     */
    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnoPublicado() {
        return AnoPublicado;
    }

    public boolean isDisponivel() {
        return Disponivel;
    }

    /**
     * metodo setter usado na clase
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public void setAutor(String autor) {
        this.Autor = autor;
    }

    public void setAnoPublicado(int anoPublicado) {
        this.AnoPublicado = anoPublicado;
    }

    public void setDisponivel(boolean disponivel) {
        this.Disponivel = disponivel;
    }

    /**
     * metodo usado para emprestar o item.
     */
    public  void emprestar(){
        if (Disponivel){
            Disponivel = false;
        } else{
            System.out.println("o item não está disponivel emprestar.");
        }
    }

    /**
     * metodo que serra usado para fazer a devolução do item.
     */
    public void Devolver(){
        Disponivel = true;
    }

    /** metodo que serra usado para gerar e fazer o calculo da multa caso
     * o item não seja devolvido no praso marcado.
     * @param diasAtrasados
     * @return
     */
    public abstract double calcularMulta(int diasAtrasados);

}
