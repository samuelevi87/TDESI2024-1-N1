package main.java.atividade03;
/**
 * Representa um veículo da frota.
 * Esta classe serve como base para todos os ve[iculos da frota.
 */
public abstract class Veiculo {

    private String placa;

    private String modelo;

    private Integer ano;

    private Double quilometragem;

    /**
     * Constrói uma nova Moto
     *
     * @param placa A placa do veículo.
     * @param modelo O modelo do carro.
     * @param ano  O ano do carro.
     * @param quilometragem A quilometragem do veículo
     */
    public Veiculo(String placa, String modelo, Integer ano, Double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getPlaca(String placa) {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Double quilometragem) {
        this.quilometragem = quilometragem;
    }

    /**
     * Calcula o custo da viagem do veículo.
     *
     * @return o valor da viagem.
     */
    public abstract double calcularCustoViagem(double distancia);

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", quilometragem=" + quilometragem +
                '}';
    }
}


