public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarItem(new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1216));
        biblioteca.adicionarItem(new LivroFisico("1984", "George Orwell", 1949, 328));
        biblioteca.adicionarItem(new Ebook("Dom Casmurro", "Machado de Assis", 1899, 1.5));
        biblioteca.adicionarItem(new Ebook("A Moreninha", "Joaquim Manuel de Macedo", 1844, 0.8));
        biblioteca.adicionarItem(new AudioLivro("O Alquimista", "Paulo Coelho", 1988, 300));
        biblioteca.adicionarItem(new AudioLivro("A Revolução dos Bichos", "George Orwell", 1945, 120));

        biblioteca.listarItensDisponiveis();

        biblioteca.emprestarItem("1984");

        double multa = biblioteca.calcularMulta("1984", 3);
        System.out.println("Multa por atraso: R$ " + multa);

        biblioteca.devolverItem("1984");

        biblioteca.listarItensDisponiveis();
    }
}

