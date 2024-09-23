package main.java.atividade03;

public class Moto extends Veiculo {
    private Integer cilindrada ;

    public Moto(String placa, String modelo, Integer ano, Double quilometragem, Integer cilindrada) {
        super(placa, modelo, ano, quilometragem);
        this.cilindrada = cilindrada;
    }


    @Override
    public Double calculaCustoDeViagem(Double distancia) {
        return getQuilometragem() * 0.15;
    }
}
