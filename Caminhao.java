public class Caminhao extends Veiculo {
    private double capacidadeCarga; // em toneladas

    public Caminhao(String placa, String modelo, int ano, double quilometragem, double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.50 + (capacidadeCarga * 10);
    }
}

