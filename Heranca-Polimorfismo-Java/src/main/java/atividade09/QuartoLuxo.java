package main.java.atividade09;

public class QuartoLuxo extends Acomodacao {

    private boolean temVistaMar;
    private boolean TemHidromassagem;

    public QuartoLuxo(int numero, int capacidade, double precoPorNoite, boolean disponivel, boolean temVistaMar, boolean temHidromassagem) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.temVistaMar = temVistaMar;
        TemHidromassagem = temHidromassagem;
    }

    public boolean isTemVistaMar() {
        return temVistaMar;
    }

    public void setTemVistaMar(boolean temVistaMar) {
        this.temVistaMar = temVistaMar;
    }

    public boolean isTemHidromassagem() {
        return TemHidromassagem;
    }

    public void setTemHidromassagem(boolean temHidromassagem) {
        TemHidromassagem = temHidromassagem;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        double precoTotal = getPrecoPorNoite() * numeroNoites;
        if (isTemVistaMar()) {
            precoTotal += 50;
        }
        if (isTemHidromassagem()) {
            precoTotal += 100;
        }
        return precoTotal;
    }
}
