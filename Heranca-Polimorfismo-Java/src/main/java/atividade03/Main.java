package main.java.atividade03;

public class Main {
    public static void main(String[] args) {
        /**
         * criar uma instância de Frota
         */
        Frota frota = new Frota();

        /**
         * adicionar veículos à frota
         */
        frota.adicionarVeiculo(new Carro
                ("ABC-1234", "Jeep", 1970, 100000.2));
        frota.adicionarVeiculo(new Carro
                ("DEF-5678", "Civic", 2020, 15000.4));
        frota.adicionarVeiculo(new Caminhao
                ("HIJ-1011", "Volvo", 2015, 200000.10));
        frota.adicionarVeiculo(new Caminhao
                ("KLM-1213", "Mercedes", 2018, 80000.5));
        frota.adicionarVeiculo(new Moto
                ("NOP-1415", "Honda", 2022, 5000.150));
        frota.adicionarVeiculo(new Moto
                ("QRS-1617", "Yamaha", 2023, 1000.250));

        /**
         *Listar veículos na frota
         */
        System.out.println("Veículos na frota:");
        frota.listarVeiculos();
        System.out.println();

        /**
         * calcular o custo total de uma viagem para toda a frota em KM.
         */
        double distancia = 100;
        double custoTotal = frota.calcularCustoTotalViagem(distancia); // Chamar o método correto
        System.out.println("Custo total da viagem para " + distancia + " km: R$ " + custoTotal);
        System.out.println();

        /**
         * remove um veículo da frota.
         */
        String placaParaRemover = "ABC-1234";
        boolean removido = frota.removerVeiculo(placaParaRemover);
        if (removido) {
            System.out.println("Veículo com placa " + placaParaRemover + " removido da frota.");
        } else {
            System.out.println("Veículo com placa " + placaParaRemover + " não encontrado.");
        }
        System.out.println();

        /**
         * listar veículos após remoção
         */
        System.out.println("Veiculos na frota apos remoção:");
        frota.listarVeiculos();
    }
}