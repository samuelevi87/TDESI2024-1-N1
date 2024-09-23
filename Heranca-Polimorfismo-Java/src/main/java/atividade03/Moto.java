package main.java.atividade03;

/**
 * Representa uma moto na frota
 * Estende a classe Veiculo e adiciona funcionalidades especificas
 */
public class Moto extends Veiculo{
    private Integer cilindrada;
    /**
     * Constroi uma moto
     * @param placa         placa da moto
     * @param modelo        modelo da moto
     * @param ano           ano da moto
     * @param quilometragem quilometragem da moto
     */
    public Moto(String placa, String modelo, Integer ano, Double quilometragem, Integer cilindrada) {
        super(placa, modelo, ano, quilometragem);
        this.cilindrada = cilindrada;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * Calcula o custo da viagem de uma moto sendo 0.15 por km
     * @param distancia distancia da viagem
     * @return custo total
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.15 * distancia;
    }

}
