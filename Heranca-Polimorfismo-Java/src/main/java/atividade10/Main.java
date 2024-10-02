import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Departamento departamentoTI = new Departamento("TI");
        Departamento departamentoVendas = new Departamento("Vendas");

        Gerente gerenteTI = new Gerente("Carlos Silva", "123.456.789-00", LocalDate.of(2010, 5, 20), 12000.0, "TI", 3000.0);
        Analista analistaTI = new Analista("Maria Souza", "987.654.321-00", LocalDate.of(2015, 6, 10), 6000.0, "Desenvolvimento", Analista.NivelSenioridade.SENIOR);
        Vendedor vendedor = new Vendedor("João Mendes", "112.233.445-00", LocalDate.of(2020, 3, 15), 4000.0, 0.05, 50000.0);

        departamentoTI.adicionarFuncionario(gerenteTI);
        departamentoTI.adicionarFuncionario(analistaTI);
        departamentoVendas.adicionarFuncionario(vendedor);

        empresa.adicionarDepartamento(departamentoTI);
        empresa.adicionarDepartamento(departamentoVendas);

        System.out.println("Folha de pagamento total: " + empresa.calcularFolhaPagamentoTotal());

        empresa.gerarRelatorioFuncionariosPorTempoServico();

        System.out.println("Funcionários encontrados com o nome 'João':");
        for (Funcionario f : empresa.buscarFuncionarioPorNome("João")) {
            System.out.println(f.getNome());
        }
    }
}
