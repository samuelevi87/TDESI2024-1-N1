package main.java.atividade03;
/**
 * Representa um carro da frota.
 * Estende a classe Veículo e adiciona funcionalidades específicas para Carro.
 */
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
