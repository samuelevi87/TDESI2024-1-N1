package main.java.atividade03;
import java.util.ArrayList;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String placa, String modelo, int ano, double quilometragem, int numeroPortas) {
        super(placa, modelo, ano, quilometragem);
        this.numeroPortas = numeroPortas;
    }
}
    @Override
    public double calcularCustoViagem(double distancia) {
        return 0.20 * distancia;
    }
}
