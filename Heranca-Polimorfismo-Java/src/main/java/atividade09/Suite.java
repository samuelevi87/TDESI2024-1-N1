package main.java.atividade09;

public class Suite extends Acomodacao {
    private int numeroQuartos;
    private boolean temSalaEstar;
    /***
     * Construtor que inicializa os atributos da suíte.
     *
     * @param numero          O número da suíte.
     * @param capacidade      A capacidade máxima de pessoas.
     * @param precoPorNoite   O preço por noite da suíte.
     * @param disponivel      Indica se a suíte está disponível.
     * @param numeroQuartos   O número de quartos na suíte.
     * @param temSalaEstar    Indica se a suíte possui sala de estar.
     */
    public Suite(int numero, int capacidade, double precoPorNoite, boolean disponivel, int numeroQuartos, boolean temSalaEstar) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.numeroQuartos = numeroQuartos;
        this.temSalaEstar = temSalaEstar;
    }
    /***
     * Calcula o preço total para o número de noites especificado.
     *
     * @param numeroNoites O número de noites.
     * @return O preço total.
     */
    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites * 1.5;
    }
}
