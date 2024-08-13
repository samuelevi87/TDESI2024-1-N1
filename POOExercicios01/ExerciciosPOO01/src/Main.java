import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

        //Pessoa pessoa01 = new Pessoa("Stephanie", 22);
        //System.out.println(pessoa01.getNome() + " tem " + pessoa01.getIdade() + " anos.");
        //pessoa01.setIdade(25);
        //System.out.println(pessoa01.getNome() + " tem " + pessoa01.getIdade() + " anos.");

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.

        ContaBancaria contateste = new ContaBancaria(30091650, 1000);
        System.out.println("Conta: " + contateste.getNumeroConta());
        System.out.println("Saldo atual: " + contateste.getSaldo());

        contateste.Depositar(100);
        System.out.println("Saldo atual: " + contateste.getSaldo());

        contateste.Sacar(500);
        System.out.println("Saldo atual: " + contateste.getSaldo());

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
