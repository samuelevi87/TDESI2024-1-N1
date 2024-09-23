public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(new Desenvolvedor("Alice", 1, 5000, "Java"));
        empresa.adicionarFuncionario(new Desenvolvedor("Bob", 2, 6000, "Python"));
        empresa.adicionarFuncionario(new Gerente("Carlos", 3, 8000, 2000));
        empresa.adicionarFuncionario(new Gerente("Diana", 4, 9000, 3000));
        empresa.adicionarFuncionario(new AnalistaQA("Eva", 5, 4000, 5));
        empresa.adicionarFuncionario(new AnalistaQA("Frank", 6, 4500, 3));

        System.out.println("Funcionários e seus salários:");
        empresa.listarFuncionarios();

        double totalFolha = empresa.calcularFolhaPagamento();
        System.out.println("Folha de pagamento total: " + totalFolha);
    }
}

