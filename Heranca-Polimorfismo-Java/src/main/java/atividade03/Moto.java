package main.java.atividade03;
/**
 * Representa uma moto da frota,
 * Estende a classe Veículo e adiciona funcionalidades específicas para Moto
 */
public class Moto extends Veiculo{

    private Integer cilindradas;

    /**
     * Constrói um novo Veiculo;
     *
     * @param placa A placa da moto.
     * @param modelo O modelo da moto.
     * @param ano  O ano da moto.
     * @param quilometragem A quilometragem da moto.
     * @param cilindradas As cilindradas da moto.
     */
    public Moto(String placa, String modelo, Integer ano, Double quilometragem, Integer cilindradas) {
        super(placa, modelo, ano, quilometragem);
        this.cilindradas = cilindradas;
    }

    /**
     * Calcula o custo da viagem da moto.
     * @return o valor da viagem da moto.
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 0.15);
    }
}
