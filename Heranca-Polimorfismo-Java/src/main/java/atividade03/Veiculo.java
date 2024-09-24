package main.java.atividade03;

public  abstract class Veiculo {

    private String placa;
    private String modelo;
    private Integer ano;
    private Double quilometragem;

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

    public abstract  double calcularCustoViagem(double distancia);

    @Override
    public String toString() {
        return "\n DADOS VEICULO \n" +
                "PLACA: " + getPlaca() +
                "MODELO: " + getModelo() +
                "ANO: " + getAno();

    }

}
