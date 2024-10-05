package main.java.atividade03;

public class Caminhao extends Veiculo{

    private double capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano, double quilometragem, double capacidadeCarga) {
        super(placa, modelo, ano, quilometragem);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String toString() {
        return "Caminhao" +
                "capacidadeCarga: " + capacidadeCarga +
                "Placa: "+getPlaca()+
                "Modelo: "+getModelo()+
                "Ano : "+getAno()+
                "Quilometragem: "+getQuilometragem();
    }

    @Override
    public double calcularViagem(double distancia) {
        return distancia * 0.50 + capacidadeCarga;
    }
}
