package main.java.atividade03;

public abstract class Veiculo {
    /**
     * Variaveis que le a informação do veiculo que sera mencionado pelo usuario.
     * @param Placa variavel que le a numeração do emplacamento do veiculo
     * @param Modelo variavel que le qual o modelo do veiculo.
     * @param Ano variavel que le o ano de fabricação do veiculo.
     * @param Quilometragem variavel que le quantos KM o veiculo foi rodado
     */
    private String Placa;
    private String Modelo;
    private int Ano;
    private Double Quilometragem;

    /**
     * construtor do veiculo.
     * @param placa
     * @param modelo
     * @param ano
     * @param quilometragem
     */
    public Veiculo(String placa, String modelo, int ano, Double quilometragem) {
        this.Placa = placa;
        this.Modelo = modelo;
        this.Ano = ano;
        this.Quilometragem = quilometragem;
    }
    /**
     * metodo getter e setter na variavel numeroDePortas
     * @return
     */
    public String getPlaca() {
        return Placa;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getAno() {
        return Ano;
    }

    public Double getQuilometragem() {
        return Quilometragem;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public void setQuilometragem(Double quilometragem) {
        Quilometragem = quilometragem;
    }

    /**
     *metodo abstrato
     * @param distancia que calculara o custo da viagem.
     * @return
     */
    public abstract double calcularCustoViagem(double distancia);
}
