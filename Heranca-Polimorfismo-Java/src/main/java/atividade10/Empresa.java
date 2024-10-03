package main.java.atividade10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Empresa {
    private String nome;
    private List<Departamento> departamentos;

    public Empresa(){
        this.departamentos = new ArrayList<>();
    }
    public void adicionarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }

    public List<Funcionario> buscarFuncionarioPorNome(String nome){
        List<Funcionario> funcionariosBuscados = new ArrayList<>();

        for(Departamento departamento : departamentos){
            for(Funcionario funcionario : departamento.getFuncionarios()){
                if(funcionario.getNome().toLowerCase().contains(nome.toLowerCase())){
                     funcionariosBuscados.add(funcionario);
                }
            }
        }
        return funcionariosBuscados;
    }
    public double calcularFolhaPagamentoTotal(){
        double total = 0.0;
        for(Departamento departamento : departamentos){
            total += departamento.calcularFolhaPagamento();
        }
        return total;
    }
    public String gerarRelatorioTempoDeServico(){
        StringBuilder relatorio = new StringBuilder("Relatório de Tempo de Serviço:\n");
        List<Funcionario> funcionarios = new ArrayList<>();

        for(Departamento departamento : departamentos){
            funcionarios.addAll(departamento.getFuncionarios());
        }
       return relatorio.toString();

    }

}
