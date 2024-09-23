package main.java.atividade03;

public class Carro extends Veiculo{

    private Integer numeroPortas;

    public Carro(String placa, String modelo, Integer ano, Double quilometragem, Integer numeroPortas) {
        super(placa, modelo, ano, quilometragem);
        this.numeroPortas = numeroPortas;
    }


    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 0.25);
    }
}
