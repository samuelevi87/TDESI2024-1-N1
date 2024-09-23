package main.java;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();


        biblioteca.adicionarItem(new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1216));
        biblioteca.adicionarItem(new LivroFisico("1984", "George Orwell", 1949, 328));
        biblioteca.adicionarItem(new Ebook("A Revolução dos Bichos", "George Orwell", 1945, 1.5));
        biblioteca.adicionarItem(new Ebook("Dom Casmurro", "Machado de Assis", 1899, 2.0));
        biblioteca.adicionarItem(new AudioLivro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, 120));
        biblioteca.adicionarItem(new AudioLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, 180));


        System.out.println("Itens disponíveis:");
        biblioteca.listarItensDisponiveis();


        biblioteca.emprestarItem("1984");
        System.out.println("\nApós emprestar '1984':");
        biblioteca.listarItensDisponiveis();


        double multa = biblioteca.calcularMulta("1984", 3);
        System.out.println("\nMulta por 3 dias de atraso em '1984': R$ " + multa);

        biblioteca.devolverItem("1984");
        System.out.println("\nApós devolver '1984':");
        biblioteca.listarItensDisponiveis();
    }
}