package main.java.atividade03;

/**
 * Representa um carro na frota
 * Estende a classe Veiculo e adiciona funcionalidades especificas
 */
public class Carro extends Veiculo{
    private Integer numeroPortas;

    /**
     * Constroi um carro
     * @param placa         placa do carro
     * @param modelo        modelo do carro
     * @param ano           ano do carro
     * @param quilometragem quilometragem do carro em km
     * @param numeroPortas  numero de portas do carro
     */
    public Carro(String placa, String modelo, Integer ano, Double quilometragem, Integer numeroPortas) {
        super(placa, modelo, ano, quilometragem);
        this.numeroPortas = numeroPortas;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    /**
     * Calcula o custo da viagem de um carro sendo 0.20 por km
     * @param distancia distancia da viagem
     * @return custo total
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.20 * distancia;
    }

}
