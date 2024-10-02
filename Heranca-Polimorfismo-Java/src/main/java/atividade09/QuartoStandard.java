class QuartoStandard extends Acomodacao {
    public enum TipoCama { SOLTEIRO, CASAL }
    private TipoCama tipoCama;

    public QuartoStandard(int numero, int capacidade, double precoPorNoite, TipoCama tipoCama) {
        super(numero, capacidade, precoPorNoite);
        this.tipoCama = tipoCama;
    }

    public TipoCama getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(TipoCama tipoCama) {
        this.tipoCama = tipoCama;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return getPrecoPorNoite() * numeroNoites;
    }
}
