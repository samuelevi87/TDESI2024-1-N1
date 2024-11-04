public class Ebook extends ItemBiblioteca {
    private double tamanhoArquivo; // em MB

    public Ebook(String titulo, String autor, int anoPublicacao, double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.25;
    }
}

