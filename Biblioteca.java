import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<ItemBiblioteca> itens;

    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemBiblioteca item) {
        itens.add(item);
    }

    public void emprestarItem(String titulo) {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equals(titulo) && item.isDisponivel()) {
                item.emprestar();
                System.out.println("Item '" + titulo + "' emprestado com sucesso.");
                return;
            }
        }
        System.out.println("Item não disponível ou não encontrado.");
    }

    public void devolverItem(String titulo) {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equals(titulo) && !item.isDisponivel()) {
                item.devolver();
                System.out.println("Item '" + titulo + "' devolvido com sucesso.");
                return;
            }
        }
        System.out.println("Item não encontrado ou já está disponível.");
    }

    public double calcularMulta(String titulo, int diasAtraso) {
        for (ItemBiblioteca item : itens) {
            if (item.getTitulo().equals(titulo)) {
                return item.calcularMulta(diasAtraso);
            }
        }
        System.out.println("Item não encontrado.");
        return 0;
    }

    public void listarItensDisponiveis() {
        System.out.println("Itens disponíveis:");
        for (ItemBiblioteca item : itens) {
            if (item.isDisponivel()) {
                System.out.println("- " + item.getTitulo() + " (Autor: " + item.getAutor() + ")");
            }
        }
    }
}

