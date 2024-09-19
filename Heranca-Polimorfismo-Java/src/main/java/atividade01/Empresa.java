package main.java.atividade01;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a empresa que gerencia os funcionários.
 */
public class Empresa {
    private List<Funcionario> listaDeFuncionarios;

    /**
     * Constrói uma nova empresa.
     * Inicializa a lista de funcionários.
     */
    public Empresa() {
        this.listaDeFuncionarios = new ArrayList<>();
    }

    /**
     * Adiciona um funcionário na empresa.
     * @param funcionarioParaAdicionar
     */
    public void adicionarFuncionario(Funcionario funcionarioParaAdicionar){
        this.listaDeFuncionarios.add(funcionarioParaAdicionar);
    }

    /**
     * Calcula a folha de pagamento total da empresa.
     * @return O valor total da folha de pagamento da empresa.
     */
    public double calcularFolhaDePagamentoTotal(){
        double salarioTotalDaEmpresa = 0;
        for (Funcionario funcionario : listaDeFuncionarios) {
            salarioTotalDaEmpresa += funcionario.calcularSalarioTotal();
        }
        return salarioTotalDaEmpresa;
    }


    /**
     * Calcula a folha de pagamento total da empresa usando stream.
     * @return O valor total da folha de pagamento da empresa.
     */
    public double calcularFolhaDePagamentoTotalComStream(){
        return listaDeFuncionarios.stream().mapToDouble(Funcionario::calcularSalarioTotal).sum();
    }


    /**
     * Lista todos os funcionários da empresa e seus respectivos salários.
     */
    public void listarFuncionarios(){
        listaDeFuncionarios.forEach(funcionario -> System.out.println(funcionario + " - Salário Total: R$ " + String.format("%.2f", funcionario.calcularSalarioTotal())));
    }

    public void listaSimples(){
        for (Funcionario funcionario : listaDeFuncionarios) {
            System.out.println(
                    "Funcionário: " + funcionario.getNome() + ", Salário: R$ " + funcionario.calcularSalarioTotal());
        }
    }

    public void listaSimples02(){
        listaDeFuncionarios.forEach(System.out::println);
    }
}
