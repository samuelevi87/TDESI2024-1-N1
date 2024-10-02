package main.java.atividade10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe que representa uma Empresa.
 */
public class CorrecaoEmpresa {
    private String nome;
    private List<CorrecaoDepartamento> listaDeDepartamentos;

    /**
     * Construtor para a classe Empresa.
     *
     * @param nome O nome da empresa.
     */
    public CorrecaoEmpresa(String nome) {
        this.nome = nome;
        this.listaDeDepartamentos = new ArrayList<>();
    }

    /**
     * Adiciona um departamento à empresa.
     *
     * @param departamento O departamento a ser adicionado.
     */
    public void adicionarDepartamento(CorrecaoDepartamento departamento) {
        listaDeDepartamentos.add(departamento);
    }

    /**
     * Busca funcionários por nome em toda a empresa.
     *
     * @param nome O nome a ser buscado.
     * @return Uma lista de funcionários que correspondem ao nome buscado.
     */
    public List<CorrecaoFuncionario> buscarFuncionariosPorNome(String nome) {
        return listaDeDepartamentos.stream()
                .flatMap(departamento -> departamento.getFuncionarios().stream())
                .filter(funcionario -> funcionario.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    /**
     * Versão simples do método buscarFuncionariosPorNome.
     *
     * @param nome O nome a ser buscado.
     * @return Uma lista de funcionários que correspondem ao nome buscado.
     */
    public List<CorrecaoFuncionario> buscarFuncionariosPorNomeSimples(String nome) {
        List<CorrecaoFuncionario> resultado = new ArrayList<>();
        for (CorrecaoDepartamento departamento : listaDeDepartamentos) {
            for (CorrecaoFuncionario funcionario : departamento.getFuncionarios()) {
                if (funcionario.getNome().toLowerCase().contains(nome.toLowerCase())) {
                    resultado.add(funcionario);
                }
            }
        }
        return resultado;
    }

    /**
     * Calcula a folha de pagamento total da empresa.
     *
     * @return O total da folha de pagamento.
     */
    public double calcularFolhaPagamentoTotal() {
        return listaDeDepartamentos.stream()
                .mapToDouble(CorrecaoDepartamento::calcularFolhaPagamento)
                .sum();
    }

    /**
     * Calcula a folha de pagamento total da empresa (versão simples).
     *
     * @return O total da folha de pagamento.
     */
    public double calcularFolhaPagamentoTotalSimples() {
        double totalFolha = 0.0;
        for (CorrecaoDepartamento departamento : listaDeDepartamentos) {
            totalFolha += departamento.calcularFolhaPagamento();
        }
        return totalFolha;
    }

    /**
     * Gera um relatório de funcionários por tempo de serviço.
     *
     * @return Uma string contendo o relatório.
     */
    public String gerarRelatorioTempoServico() {
        StringBuilder relatorio = new StringBuilder("Relatório de Tempo de Serviço:\n");

        listaDeDepartamentos.stream()
                .flatMap(departamento -> departamento.getFuncionarios().stream())
                .sorted((funcionario1, funcionario2) -> Integer.compare(funcionario2.calcularTempoServico(), funcionario1.calcularTempoServico()))
                .forEach(funcionario -> relatorio.append(String.format("%s - %d anos\n", funcionario.getNome(), funcionario.calcularTempoServico())));

        return relatorio.toString();
    }

    /**
     * Versão simples do método gerarRelatorioTempoServico.
     *
     * @return Uma string contendo o relatório.
     */
    public String gerarRelatorioTempoServicoSimples() {
        StringBuilder relatorio = new StringBuilder("Relatório de Tempo de Serviço:\n");
        List<CorrecaoFuncionario> todosFuncionarios = new ArrayList<>();

        for (CorrecaoDepartamento departamento : listaDeDepartamentos) {
            todosFuncionarios.addAll(departamento.getFuncionarios());
        }

        todosFuncionarios.sort((funcionario1, funcionario2) -> Integer.compare(funcionario2.calcularTempoServico(), funcionario1.calcularTempoServico()));

        for (CorrecaoFuncionario funcionario : todosFuncionarios) {
            relatorio.append(String.format("%s - %d anos\n", funcionario.getNome(), funcionario.calcularTempoServico()));
        }

        return relatorio.toString();
    }

    public String getNome() {
        return nome;
    }
}