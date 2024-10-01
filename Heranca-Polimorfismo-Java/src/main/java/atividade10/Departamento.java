package main.java.atividade10;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    List<Funcionario> listaDeFuncionarios;

    public Departamento() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.listaDeFuncionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        this.listaDeFuncionarios.remove(funcionario);
    }

    public void listarFuncionarios() {
        listaDeFuncionarios.forEach(System.out::println);
    }

    public Double calcularFolhaDePagamento() {
        return listaDeFuncionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();
    }
}
