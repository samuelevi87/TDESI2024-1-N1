package main.java.atividade03;

public class Caminhao extends Veiculo {
    private Double capacidadeCarga ;

    public Caminhao(String placa, String modelo, Integer ano, Double quilometragem, Double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public Double calculaCustoDeViagem(Double distancia) {
        return getQuilometragem() * 0.50 + (10 * capacidadeCarga );
    }
}
