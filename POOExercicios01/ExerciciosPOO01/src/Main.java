import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;

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
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
        // 2. Exibir o título, autor e ano de publicação.
        // 3. Alterar o ano de publicação e exibir novamente.

        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
    }
}
