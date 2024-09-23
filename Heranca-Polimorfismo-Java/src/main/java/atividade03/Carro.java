package main.java.atividade03;

/**
 * Representa um carro na frota.
 * Estende a classe Veiculo e adiciona funcionalidades específicas para carros.
 */
public class Carro extends Veiculo {
    private Integer numeroPortas;

    /**
     * Constrói um carro.
     * @param placa A placa do carro.
     * @param modelo O modelo do carro.
     * @param ano O ano do carro.
     * @param quilometragem A quilometragem do carro.
     * @param numeroPortas O número de portas do carro.
     */
    public Carro(String placa, String modelo, Integer ano, Double quilometragem, Integer numeroPortas) {
        super(placa, modelo, ano, quilometragem);
        this.numeroPortas = numeroPortas;
    }

    /**
     * Calcula o custo de viagem com base na distância percorrida.
     * O cálculo para o carro é de R$0,2 para cada quilômetro percorrido.
     * @param distancia A distância que será percorrida.
     * @return O valor total de custo de viagem.
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.2;
    }
}