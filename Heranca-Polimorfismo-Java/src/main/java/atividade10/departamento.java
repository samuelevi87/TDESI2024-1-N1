package main.java.atividade10;
import java.util.ArrayList;
import java.util.List;

public class departamento {
    private List<Funcionario> funcionarios;

    public void Departamento() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(int id) {
        funcionarios.removeIf(funcionario -> funcionario.getId() == id);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public double calcularFolhaPagamentoTotal() {
        return funcionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();
    }
}
