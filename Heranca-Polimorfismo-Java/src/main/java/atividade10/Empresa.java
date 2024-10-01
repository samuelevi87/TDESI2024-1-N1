package main.java.atividade10;

import java.util.*;

public class Empresa {
    private List<Departamento> listaDeDepartamentos;

    public Empresa() {
        this.listaDeDepartamentos = new ArrayList<>();
    }

    public void adicionarDepartamentos(Departamento departamento) {
        this.listaDeDepartamentos.add(departamento);
    }

    public List<Funcionario> buscarFuncionarioPorNome(String nome) {
        return listaDeDepartamentos.stream().map(Departamento::getListaDeFuncionarios).flatMap(Collection::stream).filter(funcionario -> funcionario.getNome().contains(nome)).toList();
    }

    public Double calcularFolhaDePagamentoTotal() {
        return listaDeDepartamentos.stream().mapToDouble(Departamento::calcularFolhaDePagamento).sum();
    }

    public List<String> listarFuncionariosPorTempoServico() {
        return listaDeDepartamentos.stream().map(Departamento::getListaDeFuncionarios).flatMap(Collection::stream).sorted((f1, f2) -> Integer.compare(f2.calcularTempoServico(), f1.calcularTempoServico())).map(Funcionario::toString).toList();
    }
}
