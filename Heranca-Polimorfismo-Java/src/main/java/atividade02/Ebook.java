package main.java.atividade02;

/**
 * Representa um ebook na biblioteca.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para ebooks.
 */
public class Ebook extends ItemBiblioteca{
    private Double tamanhoArquivo;

    /**
     * Constrói um ebook
     * @param titulo O título do ebook.
     * @param autor O autor do ebook.
     * @param anoPublicacao O ano de publicação do ebook.
     * @param disponivel A disponibilidade do ebook.
     * @param tamanhoArquivo O tamanho do arquivo em MB do arquivo.
     */
    public Ebook(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    /**
     * Calcula a multa por atraso com base no tanto de dias que está atrasado.
     * A multa é de 25 centavos por dia.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor total da multa.
     */
    @Override
    public Double calcularMulta(Integer diasAtraso) {
        return diasAtraso * 0.25;
    }
}
