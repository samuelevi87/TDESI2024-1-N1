public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public Gerente(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String departamento, double bonus) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.departamento = departamento;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    // Getters e setters adicionais
}
