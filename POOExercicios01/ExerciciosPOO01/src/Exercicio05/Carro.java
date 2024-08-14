package Exercicio05;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double quilometragem;

    public Carro(String marca, String modelo, int ano, double quilometragem) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getQuilometragem() {
        return quilometragem;
    }
    public void adicionarQuilometragem(double km) {
        if (km > 0) {
            quilometragem += km;
            System.out.println("Adicionados " + km + " km à quilometragem. Quilometragem total agora é: " + quilometragem + " km.");
        }
    }

    public static void main(String[] args) {

        Carro carro = new Carro("Chevrolet", "Corsa classic", 2003, 15000.0);

        // Exibindo detalhes do carro
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Quilometragem: " + carro.getQuilometragem() + " km");

        carro.adicionarQuilometragem(250.0);
    }
}

