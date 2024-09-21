package main.java.atividade02;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        /**
         *  Adicionando itens à biblioteca
         */
        biblioteca.adicionarItem(new LivroFisico("O chamado de cthulhu", " H.P. Lovecraft", 1928, true,144));
        biblioteca.adicionarItem(new Ebook("O Rei de Amarelo", "  Robert W. Chambers", 1895, true));
        biblioteca.adicionarItem(new AudioLivro("Drácula", " Bram Stoker", 1945, true, 717));

        /**
         * Listando itens disponíveis
         */
        biblioteca.listarItensDisponiveis();

        /**
         * Emprestando um item
         */
        biblioteca.emprestarItem("O chamado de cthulhu");
        biblioteca.listarItensDisponiveis();

        /**
         * Calculando multa
         */
        double multa = biblioteca.calcularMulta("O chamado de cthulhu", 5);
        System.out.println("Multa: R$ " + multa);

        /**
         * Devolvendo o item
         */
        biblioteca.devolverItem("O chamado de cthulhu");
        biblioteca.listarItensDisponiveis();
    }
}