package main.java.atividade03;

/**
 * Representa um veículo genérico na frota.
 * Esta classe serve como base para todos os tipos de veículos.
 */
public abstract class Veiculo {
    private String placa;
    private String modelo;
    private Integer ano;
    private Double quilometragem;

    /**
     * Constrói um novo veículo.
     * @param placa A placa do veículo.
     * @param modelo O modelo do veículo.
     * @param ano O ano do veículo.
     * @param quilometragem A quilometragem do veículo.
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
     * Calcula o custo de viagem com base na distância percorrida.
     * @param distancia A distância que será percorrida.
     * @return O valor total de custo de viagem.
     */
    public abstract Double calcularCustoViagem(Double distancia);

    /**
     * Retorna a representação em string do veículo.
     * @return Uma string contendo a placa, o modelo, o ano e a quilometragem do veículo.
     */
    @Override
    public String toString() {
        return "\nPlaca: \"" + placa + '\"' +
                "\nModelo: \"" + modelo + '\"' +
                "\nAno: " + ano +
                "\nQuilometragem: " + quilometragem + " km";
    }
}
