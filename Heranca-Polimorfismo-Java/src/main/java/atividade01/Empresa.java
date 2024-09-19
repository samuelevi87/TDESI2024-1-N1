package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 * representa a empresa que gerencia os funcionarios.
 */

public class Empresa {
    private List<Funcionario> listaFuncionarios;
    /**
     * constroi empresa
     * inicializa a lista de funcionarios.
     */
    public Empresa(){
        this.listaFuncionarios=new ArrayList<>();
    }

    /**
     * adiciona funcionario a empresa.
     * @param funcionarioParaADD
     */
    public void adicionarFuncionario(Funcionario funcionarioParaADD){
        this.listaFuncionarios.add(funcionarioParaADD);
    }
    public double calculaFolhaDePagamentoTotal(){
        double salariTotalDaEmpresa =0;
        for (Funcionario funcionario : listaFuncionarios){
            salariTotalDaEmpresa += funcionario.calcularSalarioTotal();
        }
        return salariTotalDaEmpresa;
    }
    public DoubleStream calcularFolhaDePagamentoTotalComStream(){
        return listaFuncionarios.stream().mapToDouble(Funcionario::getIdentificador);
    }
    public void folhaPagament01(){
          listaFuncionarios.forEach(funcionario -> System.out.println(funcionario+" - Salario total: R$" +String.format("%2",
                funcionario.calcularSalarioTotal())));
    }
    public void listaSimples(){
        for (Funcionario funcionario: listaFuncionarios){
            System.out.println(funcionario.getNome() + "Salario "+ funcionario.calcularSalarioTotal());
        }
    }
    public void listaSimples02(){
        listaFuncionarios.forEach(System.out::println);
    }
}

