package Exercicio04;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0) {
            this.anoPublicacao = anoPublicacao;
        }
    }
    public static void main(String[] args) {
        // Criando uma nova instância da classe Livro
        Livro livro = new Livro("As longas tranças de um careca", "R.C.P. Fortes", 2024);


        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());


        livro.setAnoPublicacao(2024);
        System.out.println("Ano de Publicação após alteração: " + livro.getAnoPublicacao());

        livro.setAnoPublicacao(-1500);
    }
}
