package main.java.atividade03;

/**
 * Representa um veículo de uma frota.
 * Esta classe serve como base para todos os tipos de itens, como carro, caminhão
 * e moto, e contém informações comuns como  placa, modelo, ano e quilometragem.
 */
public abstract class Veiculo {
    private String placa;
    private String modelo;
    private Integer ano;
    private Double quilometragem;

    /**
     * Constrói um veículo
     * @param placa placa do veículo
     * @param modelo modelo do veículo
     * @param ano ano do veículo
     * @param quilometragem quilometragem do veículo em Km
     */
    public Veiculo(String placa, String modelo, Integer ano, Double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
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
     * Calcula o custo da viagem
     * Este método deve ser implementado por todas as subclasses
     * @param distancia distancia da viagem
     * @return retorna o custo total da viagem
     */
    public abstract double calcularCustoViagem(double distancia);

    @Override
    public String toString() {
        return  "Placa: '" + placa + '\'' +
                ", Modelo: '" + modelo + '\'' +
                ", Ano: " + ano +
                ", Quilometragem: " + quilometragem;
    }
}