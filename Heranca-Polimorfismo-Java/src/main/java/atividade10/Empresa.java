package main.java.atividade10;

import java.util.ArrayList;

/***
 * Classe que representa uma empresa contendo vários departamentos.
 */
public class Empresa {
    private ArrayList<Departamento> departamentos;

    /***
     * Construtor que inicializa a lista de departamentos da empresa.
     */
    public Empresa() {
        this.departamentos = new ArrayList<>();
    }

    /***
     * Adiciona um departamento à empresa.
     *
     * @param departamento O departamento a ser adicionado
     */
    public void adicionarDepartamento(Departamento departamento) {
        if (departamento != null) {
            departamentos.add(departamento);
            System.out.println("Departamento " + departamento.getNome() + " adicionado à empresa.");
        } else {
            System.out.println("Departamento não pode ser nulo.");
        }
    }

    /***
     * Busca funcionários por nome em toda a empresa.
     *
     * @param nome Nome do funcionário a ser buscado
     * @return Lista de funcionários encontrados
     */
    public ArrayList<Funcionario> buscarFuncionarioPorNome(String nome) {
        ArrayList<Funcionario> encontrados = new ArrayList<>();
        for (Departamento departamento : departamentos) {
            for (Funcionario funcionario : departamento.getFuncionarios()) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    encontrados.add(funcionario);
                }
            }
        }
        return encontrados;
    }

    /***
     * Calcula a folha de pagamento total da empresa.
     *
     * @return A folha de pagamento total
     */
    public double calcularFolhaPagamentoTotal() {
        double total = 0;
        for (Departamento departamento : departamentos) {
            total += departamento.calcularFolhaPagamento();
        }
        return total;
    }

    /***
     * Gera um relatório de funcionários por tempo de serviço.
     */
    public void gerarRelatorioTempoServico() {
        System.out.println("Relatório de Funcionários por Tempo de Serviço:");
        for (Departamento departamento : departamentos) {
            System.out.println("Departamento: " + departamento.getNome());
            for (Funcionario funcionario : departamento.getFuncionarios()) {
                System.out.println("- " + funcionario.getNome() + " - " + funcionario.calcularTempoServico() + " anos de serviço");
            }
        }
    }
}
