
package main.java.atividade02;

/**
 * Representa um Audiolivro na biblioteca.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para audiolivros,
 * como a duração em minutos.
 */
public class AudioLivro extends ItemBiblioteca {
    private Integer duracaoMinutos;

    /**
     * Constrói um novo Audiolivro.
     * @param titulo O título do audiolivro.
     * @param autor O autor do audiolivro.
     * @param anoPublicacao O ano de publicação do audiolivro.
     * @param disponivel Indica se o audiolivro está disponível para empréstimo.
     * @param duracaoMinutos A duração do audiolivro em minutos.
     */
    public AudioLivro(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer duracaoMinutos) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.duracaoMinutos = duracaoMinutos;
    }

    /**
     * Calcula a multa por atraso para um audiobook.
     * A multa é de 0,35 reais por dia de atraso.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa.
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.35;
    }
}
