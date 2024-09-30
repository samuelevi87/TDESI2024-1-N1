package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> listaFuncionarios;

    public Empresa() {
        this.listaFuncionarios = new ArrayList<>();
    }

    public List<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }

    public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
        this.listaFuncionarios = listaFuncionarios;
    }
    public void addFuncionarios(Funcionario funcionario){
        listaFuncionarios.add(funcionario);
    }
    public void listarFuncionarios(){
        listaFuncionarios.forEach(funcionario ->
                System.out.println(funcionario + " - Salário Total R$ " +
                        funcionario.calcularSalario()));
    }

    public double calcularFolhaTotal(){
        return listaFuncionarios.stream().
                mapToDouble(Funcionario::calcularSalario).
                sum();
    }
}
