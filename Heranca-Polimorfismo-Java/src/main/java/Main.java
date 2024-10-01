package main.java;

import main.java.atividade10.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Departamento departamento1 = new Departamento();
        Departamento departamento2 = new Departamento();
        Departamento departamento3 = new Departamento();

        departamento1.adicionarFuncionario(new Analista("Jose", "1283671", LocalDate.now().minusYears(3), 2000.0, "teste", Analista.NivelSenioridade.JUNIOR));
        departamento1.adicionarFuncionario(new Gerente("Alberto", "345623467", LocalDate.now().minusYears(7), 5000.0, "teste", 500.0));
        departamento1.adicionarFuncionario(new Vendedor("Ronaldo", "34673247234", LocalDate.now().minusYears(4), 2500.0, 50.0, 5000.0));

        departamento2.adicionarFuncionario(new Analista("Josevaldo", "38274215", LocalDate.now().minusYears(1), 3000.0, "teste", Analista.NivelSenioridade.PLENO));
        departamento2.adicionarFuncionario(new Gerente("Derivaldo", "27582124", LocalDate.now().minusYears(15), 10000.0, "teste", 1000.0));
        departamento2.adicionarFuncionario(new Vendedor("Jubiscreudo", "587283472", LocalDate.now().minusYears(6), 3000.0, 100.0, 8000.0));

        departamento3.adicionarFuncionario(new Analista("Claudio", "12985467125", LocalDate.now().minusYears(5), 5000.0, "teste", Analista.NivelSenioridade.SENIOR));
        departamento3.adicionarFuncionario(new Gerente("Roberto", "237685263", LocalDate.now().minusYears(10), 7000.0, "teste", 750.0));
        departamento3.adicionarFuncionario(new Vendedor("Gustavo", "1687561256", LocalDate.now().minusYears(1), 2000.0, 30.0, 4000.0));

        empresa.adicionarDepartamentos(departamento1);
        empresa.adicionarDepartamentos(departamento2);
        empresa.adicionarDepartamentos(departamento3);

        empresa.buscarFuncionarioPorNome("Claudio").forEach(System.out::println);
        empresa.buscarFuncionarioPorNome("valdo").forEach(System.out::println);

        System.out.println("Folha de pagamento total: R$" + empresa.calcularFolhaDePagamentoTotal());

        System.out.println();
        empresa.listarFuncionariosPorTempoServico().forEach(System.out::println);
    }
}
