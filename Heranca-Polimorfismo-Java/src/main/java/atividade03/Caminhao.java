package main.java.atividade03;

public class Caminhao extends Veiculo {

    private Double capacidadeCarga;

    public Caminhao(String placa, String modelo, Integer ano, Double quilometragem, Double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }


    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 0.50 ) + (capacidadeCarga * 0.10);
    }
}
