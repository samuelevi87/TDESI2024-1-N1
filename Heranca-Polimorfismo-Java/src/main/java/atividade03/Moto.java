package main.java.atividade03;

public class Moto extends  Veiculo {

    private Integer cilindrada;

    public Moto(String placa, String modelo, Integer ano, Double quilometragem) {
        super(placa, modelo, ano, quilometragem);
    }


    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.15;
    }
}
