package main.java.atividade03;

public class Caminhao  extends  Veiculo{

    private Integer capacidadeCarga;

    public Caminhao(String placa, String modelo, Integer ano, Double quilometragem, Integer capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.50 + (10 * capacidadeCarga);
    }
}
