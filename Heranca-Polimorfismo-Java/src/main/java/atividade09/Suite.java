package main.java.atividade09;

/**
 * Representa uma suíte
 */
public class Suite extends Acomodacao{

    private int numeroQuartos;
    private boolean temSalaEstar;

    /**
     * Constrói uma Suite
     * @param numero numero da suíte
     * @param capacidade capacidade de pessoas da suíte
     * @param precoPorNoite preço por noite da suíte
     * @param numeroQuartos numero de quartos da suíte
     * @param temSalaEstar existência de sala de estar na suíte
     */
    public Suite(int numero, int capacidade, double precoPorNoite, int numeroQuartos, boolean temSalaEstar) {
        super(numero, capacidade, precoPorNoite);
        this.numeroQuartos = numeroQuartos;
        this.temSalaEstar = temSalaEstar;
    }

    /**
     * Calcula o preço total com base no preço por noite e o número de noites com um acréscimo de 5%
     * @param numeroNoites numero de noites da reserva
     * @return o preço total
     */
    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites * 1.5;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public boolean isTemSalaEstar() {
        return temSalaEstar;
    }

    public void setTemSalaEstar(boolean temSalaEstar) {
        this.temSalaEstar = temSalaEstar;
    }
}
