package main.java.atividade03;
/**
 * Representa um caminhão da frota.
 * Estende a classe Veículo e adiciona funcionalidades específicas para Caminhao.
 */
public class Caminhao extends Veiculo {

    private Double capacidadeCarga;

    /**
     * Constrói um novo Caminhao;
     *
     * @param placa A placa do caminhao.
     * @param modelo O modelo do caminhao.
     * @param ano  O ano do caminhao.
     * @param quilometragem A quilometragem do caminhao.
     * @param capacidadeCarga A capacidade de carga do caminhao.
     */
    public Caminhao(String placa, String modelo, Integer ano, Double quilometragem, Double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Calcula o custo da viagem da do caminhao adicionando R$ 10,00 reais a capacidade de carga.
     * @return o valor da viagem do caminhao.
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 0.50 ) + (capacidadeCarga * 0.10);
    }
}
