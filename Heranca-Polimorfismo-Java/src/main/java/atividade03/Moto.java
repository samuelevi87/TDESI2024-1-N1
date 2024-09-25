package main.java.atividade03;

public class Moto extends Veiculo{

    private Integer cilindrada;

    public Moto(String placa, String modelo, Integer ano, double quilometragem, Integer cilindrada) {
        super(placa, modelo, ano, quilometragem);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.15;
    }
}
