package main.java.atividade03.CorreçãoProfessor;

/**
 * Representa um carro na frota.
 * Estende a classe Veiculo e adiciona funcionalidades específicas para carros.
 */
public class CorrecaoCarro extends CorrecaoVeiculo {
    private int numeroPortas;

    /**
     * Constrói um novo Carro.
     *
     * @param placa A placa do carro.
     * @param modelo O modelo do carro.
     * @param ano O ano de fabricação do carro.
     * @param quilometragem A quilometragem atual do carro.
     * @param numeroPortas O número de portas do carro.
     */
    public CorrecaoCarro(String placa, String modelo, int ano, double quilometragem, int numeroPortas) {
        super(placa, modelo, ano, quilometragem);
        this.numeroPortas = numeroPortas;
    }

    /**
     * Calcula o custo de uma viagem para este carro.
     * O custo é de R$ 0,20 por km.
     *
     * @param distancia A distância da viagem em quilômetros.
     * @return O custo calculado da viagem.
     */
    @Override
    public double calcularCustoViagem(double distancia) {
        return distancia * 0.20;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}