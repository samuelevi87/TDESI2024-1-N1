package main.java.atividade03;

public class Carro extends Veiculo{
    private Integer numeroPortas;


    public Carro(String placa, String modelo, Integer ano, Double quilometragem, Integer numeroPortas) {
        super(placa, modelo, ano, quilometragem);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public Double calculaCustoDeViagem(Double distancia) {
        return getQuilometragem() * 0.20;
    }
}
