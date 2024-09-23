package main.java.atividade03;

/**
 * Representa um veiculo generico de uma frota
 * Esta classe serve para todos os tipos de itens
 */
public abstract class Veiculo {
    private String placa;
    private String modelo;
    private Integer ano;
    private Double quilometragem;

    /**
     * Constroi um veiculo
     * @param placa placa do veiculo
     * @param modelo modelo do veiculo
     * @param ano ano do veiculo
     * @param quilometragem quilometragem do veiculo em km
     */
    public Veiculo(String placa, String modelo, Integer ano, Double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    /**
     * Calcula o custo da viagem
     * Este método deve ser implementado por todas as subclasses
     * @param distancia distancia da viagem
     * @return retorna o custo total da viagem
     */
    public abstract double calcularCustoViagem(double distancia);

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

    @Override
    public String toString() {
        return  "placa: '" + placa + '\'' +
                ", modelo: '" + modelo + '\'' +
                ", ano: " + ano +
                ", quilometragem: " + quilometragem;
    }
}
