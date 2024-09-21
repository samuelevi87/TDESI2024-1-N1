package main.java.atividade03;

/**
 * Representa uma moto na frota.
 * Estende a classe Veiculo e adiciona funcionalidades específicas para motos.
 */
public class Moto extends Veiculo{
    private Integer cilindrada;

    /**
     * Constrói uma moto.
     * @param placa A placa da moto.
     * @param modelo O modelo da moto.
     * @param ano O ano da moto.
     * @param quilometragem A quilometragem da moto.
     * @param cilindrada O número de cilindradas da moto.
     */
    public Moto(String placa, String modelo, Integer ano, Double quilometragem, Integer cilindrada) {
        super(placa, modelo, ano, quilometragem);
        this.cilindrada = cilindrada;
    }

    /**
     * Calcula o custo de viagem com base na distância percorrida.
     * O cálculo para a moto é de R$0,15 para cada quilômetro percorrido.
     * @param distancia A distância que será percorrida.
     * @return O valor total de custo de viagem.
     */
    @Override
    public Double calcularCustoViagem(Double distancia) {
        return distancia * 0.15;
    }
}
