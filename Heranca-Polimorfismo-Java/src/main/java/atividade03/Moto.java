package main.java.atividade03;

public class Moto extends Veiculo{
    private int cilindrada;
    /**
     * Variaveis que le a informação do veiculo que sera mencionado pelo usuario.
     * @param Placa variavel que le a numeração do emplacamento do veiculo
     * @param Modelo variavel que le qual o modelo do veiculo.
     * @param Ano variavel que le o ano de fabricação do veiculo.
     * @param Quilometragem variavel que le quantos KM o veiculo foi rodado
     */
    public Moto(String Placa, String Modelo, int Ano, Double Quilometragem) {
        super(Placa, Modelo, Ano, Quilometragem);
    }
    /**
     * metodo getter e setter na variavel numeroDePortas
     * @return
     */
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     *
     * @param distancia que calculara o custo da viagem.
     * @return
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.15 * distancia;
    }
}
