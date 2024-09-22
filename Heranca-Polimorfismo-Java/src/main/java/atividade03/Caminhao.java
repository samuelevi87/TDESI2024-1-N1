package main.java.atividade03;

public class Caminhao extends Veiculo{
    private Double capacidadeCarga;

    /**
     * Variaveis que le a informação do veiculo que sera mencionado pelo usuario.
     * @param Placa variavel que le a numeração do emplacamento do veiculo
     * @param Modelo variavel que le qual o modelo do veiculo.
     * @param Ano variavel que le o ano de fabricação do veiculo.
     * @param Quilometragem variavel que le quantos KM o veiculo foi rodado
     */
    public Caminhao(String Placa, String Modelo, int Ano, Double Quilometragem) {
        super(Placa, Modelo, Ano, Quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }
    /**
     * metodo getter e setter na variavel numeroDePortas
     * @return
     */
    public Double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    /**
     *
     * @param distancia que calculara o custo da viagem e a capacidade e custo da carga.
     * @return
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return (0.50 * distancia) + (10 * capacidadeCarga);
    }
}
