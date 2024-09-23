package main.java.atividade03;

public class Moto extends Veiculo{

    private Integer cilindradas;

    public Moto(String placa, String modelo, Integer ano, Double quilometragem, Integer cilindradas) {
        super(placa, modelo, ano, quilometragem);
        this.cilindradas = cilindradas;
    }


    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 0.15);
    }
}
