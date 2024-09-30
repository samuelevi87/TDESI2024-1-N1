package main.java.atividade03;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String placa, String modelo, int ano, double quilometragem, int cilindrada) {
        super(placa, modelo, ano, quilometragem);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.15 * distancia;
    }
}
