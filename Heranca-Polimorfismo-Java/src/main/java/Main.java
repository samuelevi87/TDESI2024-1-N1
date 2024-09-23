package main.java;

<<<<<<< HEAD
import main.java.atividade02.AudioLivro;
import main.java.atividade02.Biblioteca;
import main.java.atividade02.Ebook;
import main.java.atividade02.LivroFisico;

public class Main {
    public static void main(String[] args) {
        Biblioteca bibliote = new Biblioteca();

        LivroFisico livroFisico1 = new LivroFisico("Piratas", "Caribe", 2000, true, 365);
        LivroFisico livroFisico2 = new LivroFisico("Eletricidade", "Tomas", 1783, true, 2000);
        Ebook ebook1 = new Ebook("Sapiens", "WOW", 2010, true, 60);
        Ebook ebook2 = new Ebook("Ondas", "Pedro", 555, true, 60);
        AudioLivro audioLivro1 = new AudioLivro("aaa", "autorFoda", 2001, true, 180);
        AudioLivro audioLivro2 = new AudioLivro("bbb", "autorFodinha", 1999, true, 530);

        livroFisico1.emprestar();
        livroFisico1.devolver();
        livroFisico1.devolver();
        ebook2.emprestar();

        livroFisico1.calcularMulta(8);
=======
import main.java.atividade01.CorrecaoAnalistaQA;
import main.java.atividade01.CorrecaoDesenvolvedor;
import main.java.atividade01.CorrecaoEmpresa;
import main.java.atividade01.CorrecaoGerente;

public class Main {
    public static void main(String[] args) {
        CorrecaoAtividade01();
    }

    private static void CorrecaoAtividade01() {
        // Código para testar a atividade 01
        CorrecaoEmpresa empresa = new CorrecaoEmpresa();

        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Ana Silva", 1, 5000, "Java"));
        empresa.adicionarFuncionario(new CorrecaoDesenvolvedor("Carlos Santos", 2, 5500, "Python"));
        empresa.adicionarFuncionario(new CorrecaoGerente("Maria Oliveira", 3, 8000, 10000));
        empresa.adicionarFuncionario(new CorrecaoGerente("João Pereira", 4, 8500, 12000));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Pedro Costa", 5, 4500, 50));
        empresa.adicionarFuncionario(new CorrecaoAnalistaQA("Lúcia Ferreira", 6, 4800, 60));

        System.out.println("Lista de Funcionários:");
        empresa.listarFuncionarios();

        System.out.println("\nFolha de Pagamento Total: R$" +
                String.format("%.2f", empresa.calcularFolhaPagamentoTotal()));
>>>>>>> 2952e16851cc6c999b216163e24c62942517e74a
    }
}
