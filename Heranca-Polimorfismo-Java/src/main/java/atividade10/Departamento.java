package main.java.atividade10;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private List<Funcionario> funcionarios;

    public  Departamento(){
        this.funcionarios = new ArrayList<>();
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

}
