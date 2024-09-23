package main.java.atividade02;

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
                if (item.getTitulo().equalsIgnoreCase(titulo)) {
                    item.emprestar();
                    return;
                }
            }
            System.out.println("Item não encontrado ou não disponível.");
        }

        public void devolverItem(String titulo) {
            for (ItemBiblioteca item : itens) {
                if (item.getTitulo().equalsIgnoreCase(titulo)) {
                    item.devolver();
                    return;
                }
            }
            System.out.println("Item não encontrado.");
        }

        public double calcularMulta(String titulo, int diasAtraso) {
            for (ItemBiblioteca item : itens) {
                if (item.getTitulo().equalsIgnoreCase(titulo) && !item.isDisponivel()) {
                    return item.calcularMulta(diasAtraso);
                }
            }
            return 0.0;
        }

        public void listarItensDisponiveis() {
            for (ItemBiblioteca item : itens) {
                if (item.isDisponivel()) {
                    System.out.println(item.getTitulo() + " - " + item.getAutor());
                }
            }
        }
}

