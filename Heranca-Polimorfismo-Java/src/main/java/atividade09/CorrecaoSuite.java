package main.java.atividade09;

/**
 * Classe que representa uma suíte.
 */
public class CorrecaoSuite extends CorrecaoAcomodacao {
    private int numeroQuartos;
    private boolean temSalaEstar;

    /**
     * Construtor para a classe Suite.
     *
     * @param numero        O número da suíte.
     * @param capacidade    A capacidade da suíte.
     * @param precoPorNoite O preço por noite da suíte.
     * @param disponivel    A disponibilidade inicial da suíte.
     * @param numeroQuartos O número de quartos na suíte.
     * @param temSalaEstar  Se a suíte tem sala de estar.
     */
    public CorrecaoSuite(int numero, int capacidade, double precoPorNoite, boolean disponivel, int numeroQuartos, boolean temSalaEstar) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.numeroQuartos = numeroQuartos;
        this.temSalaEstar = temSalaEstar;
    }

    // Getters e setters específicos
    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public boolean temSalaEstar() {
        return temSalaEstar;
    }

    public void setTemSalaEstar(boolean temSalaEstar) {
        this.temSalaEstar = temSalaEstar;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites * 1.5;
    }
}