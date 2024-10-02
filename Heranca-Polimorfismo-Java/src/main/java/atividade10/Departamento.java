package main.java.atividade10;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public  Departamento(String nome){
        this.funcionarios = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }
    public List<String> listarFuncionarios(){
        return funcionarios.stream().map(Funcionario::toString).toList();
    }
    public double calcularFolhaPagamento(){
        return funcionarios.stream().mapToDouble(Funcionario::calcularSalario).sum();
    }

    public String getNome() {
        return nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}
