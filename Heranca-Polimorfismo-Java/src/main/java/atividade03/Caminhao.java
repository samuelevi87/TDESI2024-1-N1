package main.java.atividade03;
import java.util.ArrayList;

public class Caminhao extends Veiculo{
    private Double capacidadeDeCarga;

    public Caminhao(String placa, String modelo, int ano, double quilometragem, Double capacidadeDeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    @Override
    public double calcularCustoViagem(double distancia) {
        return (0.50 * distancia) + (10 * capacidadeDeCarga);
    }
}
