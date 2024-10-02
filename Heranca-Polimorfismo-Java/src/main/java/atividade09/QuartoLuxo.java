class QuartoLuxo extends Acomodacao {
    private boolean temVistaMar;
    private boolean temHidromassagem;

    public QuartoLuxo(int numero, int capacidade, double precoPorNoite, boolean temVistaMar, boolean temHidromassagem) {
        super(numero, capacidade, precoPorNoite);
        this.temVistaMar = temVistaMar;
        this.temHidromassagem = temHidromassagem;
    }

    public boolean isTemVistaMar() {
        return temVistaMar;
    }

    public void setTemVistaMar(boolean temVistaMar) {
        this.temVistaMar = temVistaMar;
    }

    public boolean isTemHidromassagem() {
        return temHidromassagem;
    }

    public void setTemHidromassagem(boolean temHidromassagem) {
        this.temHidromassagem = temHidromassagem;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        double precoTotal = getPrecoPorNoite() * numeroNoites;
        if (temVistaMar) {
            precoTotal += 50;
        }
        if (temHidromassagem) {
            precoTotal += 100;
        }
        return precoTotal;
    }
}
