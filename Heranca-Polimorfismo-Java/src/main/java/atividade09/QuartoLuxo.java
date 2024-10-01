package main.java.atividade09;

public class QuartoLuxo extends Acomodacao{
    private Boolean temVistaMar;
    private Boolean temHidromassagem;

    public QuartoLuxo(Integer numero, Integer capacidade, Double precoPorNoite, Boolean temVistaMar, Boolean temHidromassagem) {
        super(numero, capacidade, precoPorNoite);
        this.temVistaMar = temVistaMar;
        this.temHidromassagem = temHidromassagem;
    }

    @Override
    public Double calcularPrecoTotal(Integer numeroNoites) {
        return  getPrecoPorNoite() * numeroNoites + (temVistaMar ? 50 : 0) + (temHidromassagem ? 100 : 0);
    }
}
