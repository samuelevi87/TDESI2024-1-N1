import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(18);
        pessoa.setNome("Matheus");
        System.out.println(pessoa);

        pessoa.setIdade(21);
        pessoa.setNome("Paulo");
        System.out.println(pessoa);

        // Exercício 2:
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(2000);
        conta.sacar(1987);
        conta.getSaldo();

        // Exercício 3:
        Produto produto = new Produto();
        produto.setNome("Tablet");
        produto.setPreco(800);
        produto.setQuantidadeEmEstoque(500);
        System.out.println(produto);

        produto.adicionarEstoque(300);
        System.out.println(produto.toString());

        produto.removerEstoque(250);
        System.out.println(produto.toString());

        // Exercício 4:
        Livro livro = new Livro();
        livro.setAnoPublicacao(2020);
        livro.setAutor("Matheus");
        livro.setTitulo("Harry Pottyr");

        System.out.println(livro.toString());

        livro.setAnoPublicacao(1999);
        livro.setAutor("Lari");
        livro.setTitulo("Motivação?");
        System.out.println(livro.toString());

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
    }
}
