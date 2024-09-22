package main.java.atividade03;

public class Carro extends Veiculo{
    /**
     * @param numeroDePortas variavel que ve a quantidade de portas co carro/veiculo.
     */
    private int numeroDePortas;
    /**
     * Variaveis que le a informação do veiculo que sera mencionado pelo usuario.
     * @param Placa variavel que le a numeração do emplacamento do veiculo
     * @param Modelo variavel que le qual o modelo do veiculo.
     * @param Ano variavel que le o ano de fabricação do veiculo.
     * @param Quilometragem variavel que le quantos KM o veiculo foi rodado
     */
    public Carro(String Placa, String Modelo, int Ano, Double Quilometragem) {
        super(Placa, Modelo, Ano, Quilometragem);
    }

    /**
     * metodo getter e setter na variavel numeroDePortas
     * @return
     */
    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    /**
     * @param distancia que calculara o custo da viagem.
     * @return
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.20 * distancia;
    }
}
