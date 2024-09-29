package main.java.atividade10;

import java.util.ArrayList;

/***
 * Classe que representa um departamento na empresa.
 */
public class Departamento {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    /***
     * Construtor que inicializa o departamento.
     *
     * @param nome Nome do departamento
     */
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    /***
     * Adiciona um funcionário ao departamento.
     *
     * @param funcionario O funcionário a ser adicionado
     */
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    /***
     * Remove um funcionário do departamento.
     *
     * @param funcionario O funcionário a ser removido
     */
    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    /***
     * Lista todos os funcionários do departamento.
     *
     * @return Lista de funcionários
     */
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    /***
     * Calcula a folha de pagamento total do departamento.
     *
     * @return Total da folha de pagamento
     */
    public double calcularFolhaPagamento() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
