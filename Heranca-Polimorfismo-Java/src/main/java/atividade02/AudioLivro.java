package main.java.atividade02;

/**
 * Representa um audiolivro na biblioteca.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para audiolivros.
 */
public class AudioLivro extends ItemBiblioteca{
    private Integer duracaoMinutos;

    /**
     * Constrói um audiolivro.
     * @param titulo O título do audiolivro,
     * @param autor O autor do audiolivro.
     * @param anoPublicacao O ano de publicação do audiolivro.
     * @param disponivel A disponibilidade do audiolivro
     * @param duracaoMinutos A duração em minutos do audiolivro.
     */
    public AudioLivro(String titulo, String autor, Integer anoPublicacao, Boolean disponivel, Integer duracaoMinutos) {
        super(titulo, autor, anoPublicacao, disponivel);
        this.duracaoMinutos = duracaoMinutos;
    }

    /**
     * Calcula a multa por atraso do audiolivro, com base no tanto de dias atrasados.
     * A multa equivale a 35 centavos por dia.
     * @param diasAtraso O número de dias de atraso.
     * @return O valor total da multa.
     */
    @Override
    public Double calcularMulta(Integer diasAtraso) {
        return diasAtraso * 0.35;
    }
}
