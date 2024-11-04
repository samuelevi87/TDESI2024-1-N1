public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String placa, String modelo, int ano, double quilometragem, int cilindrada) {
        super(placa, modelo, ano, quilometragem);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.15;
    }
}

