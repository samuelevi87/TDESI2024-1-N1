package main.java.atividade10;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Empresa {
    private List<Departamento> listaDeDepartamentos;

    public void adicionarDepartamentos(Departamento departamento) {
        this.listaDeDepartamentos.add(departamento);
    }

    public Optional<Funcionario> buscarFuncionarioPorNome(String nome) {
        return listaDeDepartamentos.stream().map(Departamento::getListaDeFuncionarios).flatMap(Collection::stream).filter(funcionario -> funcionario.getNome().equals(nome)).findFirst();
    }

    public Double calcularFolhaDePagamentoTotal() {
        return listaDeDepartamentos.stream().mapToDouble(Departamento::calcularFolhaDePagamento).sum();
    }

    public void listarFuncionariosPorTempoServico() {
        listaDeDepartamentos.stream().map(Departamento::getListaDeFuncionarios).flatMap(Collection::stream).max(Comparator.comparingInt(Funcionario::calcularTempoServico)).ifPresent(System.out::println);
    }
}
