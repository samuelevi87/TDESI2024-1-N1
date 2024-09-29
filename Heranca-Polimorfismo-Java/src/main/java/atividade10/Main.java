package main.java.atividade10;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        /***
         * Cria departamentos
         */
        Departamento departamentoVendas = new Departamento("Vendas");
        Departamento departamentoTI = new Departamento("TI");

        /***
         * Adiciona departamentos à empresa
         */
        empresa.adicionarDepartamento(departamentoVendas);
        empresa.adicionarDepartamento(departamentoTI);

        /***
         * Cria funcionários
         */
        Funcionario gerente = new Gerente
                ("Alice", "123.456.789-00", LocalDate.of(2020, 1, 15), 5000, "Vendas", 1500);
        Funcionario analista = new Analista
                ("Bob", "987.654.321-00", LocalDate.of(2021, 6, 1), 4000, "Desenvolvedor", Analista.NivelSenioridade.PLENO);
        Funcionario vendedor = new Vendedor
                ("Charlie", "159.753.486-00", LocalDate.of(2022, 3, 10), 3000, 0.1, 20000);

        /***
         * Adiciona funcionários aos departamentos
         */
        departamentoVendas.adicionarFuncionario(gerente);
        departamentoVendas.adicionarFuncionario(vendedor);
        departamentoTI.adicionarFuncionario(analista);

        /***
         * Exibe informações
         */
        System.out.println("Folha de pagamento total da empresa: R$ " + empresa.calcularFolhaPagamentoTotal());
        empresa.gerarRelatorioTempoServico();

        /***
         * Busca funcionário
         */
        String nomeParaBuscar = "Alice";
        System.out.println("Funcionário encontrado: " + empresa.buscarFuncionarioPorNome(nomeParaBuscar));
    }
}
