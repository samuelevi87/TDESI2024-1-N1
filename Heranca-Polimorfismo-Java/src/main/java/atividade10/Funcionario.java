import java.time.LocalDate;
import java.time.Period;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Funcionario {
    private static final AtomicInteger idGenerator = new AtomicInteger(1);
    private int id;
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private double salarioBase;

    public Funcionario(String nome, String cpf, LocalDate dataAdmissao, double salarioBase) {
        this.id = idGenerator.getAndIncrement();
        this.nome = nome;
        this.cpf = cpf;
        this.dataAdmissao = dataAdmissao;
        this.salarioBase = salarioBase;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int calcularTempoServico() {
        return Period.between(this.dataAdmissao, LocalDate.now()).getYears();
    }

    public abstract double calcularSalario();
}
