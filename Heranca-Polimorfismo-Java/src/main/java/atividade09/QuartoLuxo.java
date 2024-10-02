package main.java.atividade09;

public class QuartoLuxo extends Acomodacao {
    private Boolean temVistaMar;
    private Boolean temHidromassagem;

    public QuartoLuxo(Integer numero, Integer capacidade, Double precoPorNoite, Boolean disponivel, Boolean temVistaMar, Boolean temHidromassagem) {
        super(numero, capacidade, precoPorNoite, disponivel);
        this.temVistaMar = temVistaMar;
        this.temHidromassagem = temHidromassagem;
    }

    @Override
    public double calcularPrecoTotal(int numeroNoites) {
        return precoPorNoite * numeroNoites + (temVistaMar ? 50 : 0) + (temHidromassagem ? 100 : 0);
    }
}
