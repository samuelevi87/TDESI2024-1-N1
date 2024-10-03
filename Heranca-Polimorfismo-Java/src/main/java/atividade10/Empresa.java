package main.java.atividade10;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<departamento> departamentos;

    public Empresa() {
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(departamento departamento) {
        departamentos.add(departamento);
    }

    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (departamento departamento : departamentos) {
            for (Funcionario funcionario : departamento.listarFuncionarios()) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    return funcionario;
                }
            }
        }
        return null;
    }

    public double calcularFolhaPagamentoTotal() {
        return departamentos.stream().mapToDouble(departamento::calcularFolhaPagamentoTotal).sum();
    }

    public void gerarRelatorioFuncionariosPorTempoServico() {
        for (departamento departamento : departamentos) {
            for (Funcionario funcionario : departamento.listarFuncionarios()) {
                System.out.println(funcionario.getNome() + " - Tempo de Serviço: " + funcionario.calcularTempoServico() + " anos");
            }
        }
    }
}
