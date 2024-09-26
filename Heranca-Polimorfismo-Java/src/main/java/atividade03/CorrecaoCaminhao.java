package main.java.atividade03;

/**
 * Representa um caminhão na frota.
 * Estende a classe Veiculo e adiciona funcionalidades específicas para caminhões.
 */
public class CorrecaoCaminhao extends CorrecaoVeiculo {
    private double capacidadeCarga;

    /**
     * Constrói um novo Caminhao.
     *
     * @param placa A placa do caminhão.
     * @param modelo O modelo do caminhão.
     * @param ano O ano de fabricação do caminhão.
     * @param quilometragem A quilometragem atual do caminhão.
     * @param capacidadeCarga A capacidade de carga do caminhão em toneladas.
     */
    public CorrecaoCaminhao(String placa, String modelo, int ano, double quilometragem, double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     * Calcula o custo de uma viagem para este caminhão.
     * O custo é de R$ 0,50 por km + R$ 10,00 por tonelada de capacidade.
     *
     * @param distancia A distância da viagem em quilômetros.
     * @return O custo calculado da viagem.
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return (distancia * 0.50) + (capacidadeCarga * 10);
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}