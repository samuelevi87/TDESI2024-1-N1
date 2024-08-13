import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

        Pessoa pessoa1 = new Pessoa("Roberto", 21);
        System.out.println("---- Exercício 1 ----");
        System.out.println(pessoa1);
        pessoa1.setIdade(24);
        System.out.println(pessoa1);
        System.out.println();

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.

        ContaBancaria conta1 = new ContaBancaria(1, 1500);
        conta1.Depositar(1000);
        conta1.Sacar(700);
        System.out.println("---- Exercício 2 ----");
        System.out.println(conta1);
        System.out.println();

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

        Produto produto1 = new Produto("Bala", 0.75, 50);
        System.out.println("---- Exercício 3 ----");
        System.out.println(produto1);
        produto1.adicionarEstoque(37);
        System.out.println(produto1);
        produto1.removerEstoque(46);
        System.out.println(produto1);
        System.out.println();

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
