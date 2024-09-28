package main.java.atividade03;

/**
 * Representa uma moto na frota.
 * Estende a classe Veiculo e adiciona funcionalidades específicas para motos.
 */
public class CorrecaoMoto extends CorrecaoVeiculo {
    private int cilindrada;

    /**
     * Constrói uma nova Moto.
     *
     * @param placa A placa da moto.
     * @param modelo O modelo da moto.
     * @param ano O ano de fabricação da moto.
     * @param quilometragem A quilometragem atual da moto.
     * @param cilindrada A cilindrada da moto.
     */
    public CorrecaoMoto(String placa, String modelo, int ano, double quilometragem, int cilindrada) {
        super(placa, modelo, ano, quilometragem);
        this.cilindrada = cilindrada;
    }

    /**
     * Calcula o custo de uma viagem para esta moto.
     * O custo é de R$ 0,15 por km.
     *
     * @param distancia A distância da viagem em quilômetros.
     * @return O custo calculado da viagem.
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.15;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}