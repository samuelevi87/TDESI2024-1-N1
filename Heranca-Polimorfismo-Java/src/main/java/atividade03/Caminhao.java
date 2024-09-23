package main.java.atividade03;

/**
 * Representa um caminhão na frota
 * Estende a classe Veiculo e adiciona funcionalidades especificas
 */
public class Caminhao extends Veiculo{
    private Double capacidadeCarga;

    /**
     * Constroi um Caminhao
     * @param placa         placa do caminhão
     * @param modelo        modelo do caminhão
     * @param ano           ano do caminhão
     * @param quilometragem quilometragem do caminhão em km
     * @param capacidadeCarga capacidade de carga em toneladas
     */
    public Caminhao(String placa, String modelo, Integer ano, Double quilometragem, Double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Calcula o custo da viagem de um caminhão sendo 0.50 por km e 10 por tonelada de carga
     * @param distancia distancia da viagem
     * @return custo total
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.50 * distancia + 10 * capacidadeCarga;
    }
}
