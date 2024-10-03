public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        // Adicionando veículos à frota
        frota.adicionarVeiculo(new Carro("ABC-1234", "Fusca", 1985, 100000, 2));
        frota.adicionarVeiculo(new Carro("DEF-5678", "Civic", 2020, 15000, 4));
        frota.adicionarVeiculo(new Caminhao("GHI-9012", "Scania", 2018, 50000, 10));
        frota.adicionarVeiculo(new Caminhao("JKL-3456", "Mercedes", 2019, 30000, 15));
        frota.adicionarVeiculo(new Moto("MNO-7890", "CB500", 2021, 5000, 500));
        frota.adicionarVeiculo(new Moto("PQR-4567", "Ninja", 2020, 7000, 650));

        // Listar veículos da frota
        frota.listarVeiculos();

        // Calcular custo total de uma viagem
        double distancia = 100; // km
        double custoTotal = frota.calcularCustoTotalViagem(distancia);
        System.out.println("Custo total da viagem para toda a frota: R$ " + custoTotal);

        // Remover um veículo
        frota.removerVeiculo("ABC-1234");
        frota.listarVeiculos();
    }
}

