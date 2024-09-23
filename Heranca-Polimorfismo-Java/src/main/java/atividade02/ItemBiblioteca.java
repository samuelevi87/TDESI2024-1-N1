package main.java.atividade02;

public class ItemBiblioteca {import java.util.ArrayList;

    abstract class ItemBiblioteca {
        private String titulo;
        private String autor;
        private int anoPublicacao;
        private boolean disponivel;

        public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
            this.disponivel = true;
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

        public void emprestar() {
            if (disponivel) {
                disponivel = false;
            } else {
                System.out.println("Item não disponível para empréstimo.");
            }
        }

        public void devolver() {
            disponivel = true;
        }

        public abstract double calcularMulta(int diasAtraso);
    }
}
