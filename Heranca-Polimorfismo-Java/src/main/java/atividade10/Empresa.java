import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;

    public Empresa() {
        this.departamentos = new ArrayList<>();
    }

    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public List<Funcionario> buscarFuncionarioPorNome(String nome) {
        List<Funcionario> encontrados = new ArrayList<>();
        for (Departamento departamento : departamentos) {
            for (Funcionario funcionario : departamento.listarFuncionarios()) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    encontrados.add(funcionario);
                }
            }
        }
        return encontrados;
    }

    public double calcularFolhaPagamentoTotal() {
        double total = 0;
        for (Departamento departamento : departamentos) {
            total += departamento.calcularFolhaPagamento();
        }
        return total;
    }

    public void gerarRelatorioFuncionariosPorTempoServico() {
        for (Departamento departamento : departamentos) {
            for (Funcionario funcionario : departamento.listarFuncionarios()) {
                System.out.println("Nome: " + funcionario.getNome() + ", Tempo de Serviço: " + funcionario.calcularTempoServico() + " anos");
            }
        }
    }
}
