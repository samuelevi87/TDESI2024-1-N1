class Suite extends Acomodacao {
    private int numeroQuartos;
    private boolean temSalaEstar;

    public Suite(int numero, int capacidade, double precoPorNoite, int numeroQuartos, boolean temSalaEstar) {
        super(numero, capacidade, precoPorNoite);
        this.numeroQuartos = numeroQuartos;
        this.temSalaEstar = temSalaEstar;
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

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites * 1.5;
    }
}
