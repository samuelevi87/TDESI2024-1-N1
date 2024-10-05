package main.java.atividade03.CorreçãoProfessor;

/**
 * Representa um veículo genérico.
 * Esta classe serve como base para todos os tipos de veículos.
 */
public abstract class CorrecaoVeiculo {
    private String placa;
    private String modelo;
    private int ano;
    private double quilometragem;

    /**
     * Constrói um novo Veiculo.
     *
     * @param placa A placa do veículo.
     * @param modelo O modelo do veículo.
     * @param ano O ano de fabricação do veículo.
     * @param quilometragem A quilometragem atual do veículo.
     */
    public CorrecaoVeiculo(String placa, String modelo, int ano, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    /**
     * Calcula o custo de uma viagem para este veículo.
     *
     * @param distancia A distância da viagem em quilômetros.
     * @return O custo calculado da viagem.
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

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
