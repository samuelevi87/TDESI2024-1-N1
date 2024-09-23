package main.java.atividade03;

/**
 * Representa um caminhão na frota.
 * Estende a classe Veiculo e adiciona funcionalidades específicas para caminhões.
 */
public class Caminhao extends Veiculo{
    private Double capacidadeCarga;

    /**
     * Constrói um caminhão.
     * @param placa A placa do caminhão.
     * @param modelo O modelo do caminhão.
     * @param ano O ano do caminhão.
     * @param quilometragem A quilometragem do caminhão.
     * @param capacidadeCarga A capacidade de carga do caminhão.
     */
    public Caminhao(String placa, String modelo, Integer ano, Double quilometragem, Double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Calcula o custo de viagem com base na distância percorrida.
     * O cálculo para o caminhão é de R$0,5 para cada quilômetro percorrido, mais 10 vezes a capacidade de carga.
     * @param distancia A distância que será percorrida.
     * @return O valor total de custo de viagem.
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 0.5) + (capacidadeCarga * 10);
    }
}