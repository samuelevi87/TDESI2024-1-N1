package main.java.atividade02;

/**
 * Representa um audiolivro na biblioteca digital.
 * Estende a classe ItemBiblioteca e adiciona funcionalidades específicas para audiolivros.
 */
public class CorrecaoAudioLivro extends CorrecaoItemBiblioteca {
    private int duracaoMinutos;

    /**
     * Constrói um novo AudioLivro.
     *
     * @param titulo O título do audiolivro.
     * @param autor O autor do audiolivro.
     * @param anoPublicacao O ano de publicação do audiolivro.
     * @param duracaoMinutos A duração do audiolivro em minutos.
     */
    public CorrecaoAudioLivro(String titulo, String autor, int anoPublicacao, int duracaoMinutos) {
        super(titulo, autor, anoPublicacao);
        this.duracaoMinutos = duracaoMinutos;
    }

    /**
     * Calcula a multa para o audiolivro, caso esteja atrasado.
     * A multa é de R$ 0,35 por dia de atraso.
     *
     * @param diasAtraso O número de dias de atraso.
     * @return O valor da multa calculada.
     */
    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.35;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
}