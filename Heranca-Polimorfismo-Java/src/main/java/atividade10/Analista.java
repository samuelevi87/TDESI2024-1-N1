public class Analista extends Funcionario {
    public enum NivelSenioridade {
        JUNIOR(0.1), PLENO(0.2), SENIOR(0.3);

        private final double valor;

        NivelSenioridade(double valor) {
            this.valor = valor;
        }

        public double getValor() {
            return valor;
        }
    }

    private String especialidade;
    private NivelSenioridade nivelSenioridade;

    public Analista(String nome, String cpf, LocalDate dataAdmissao, double salarioBase, String especialidade, NivelSenioridade nivelSenioridade) {
        super(nome, cpf, dataAdmissao, salarioBase);
        this.especialidade = especialidade;
        this.nivelSenioridade = nivelSenioridade;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * (1 + nivelSenioridade.getValor());
    }

    // Getters e setters adicionais
}
