import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

        /*Pessoa pessoa = new Pessoa ("Nathália", 18);
        System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
        pessoa.setIdade(19);
        System.out.println("Idade: " + pessoa.getIdade());*/

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.

        /*ContaBancaria contaBancaria = new ContaBancaria(3000, 2500);
        contaBancaria.depositar(500);
        contaBancaria.sacar(500);
        System.out.println("Saldo: " + contaBancaria.getSaldo());*/

        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
        // 2. Exibir o nome, preço e quantidade em estoque.
        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
        // 4. Remover itens do estoque e exibir a nova quantidade.

        Produto produto = new Produto("cadeira", 50, 100);
        System.out.println(produto.getNome() +" " +  produto.getPreco()+ " " + produto.getQuantidadeEmEstoque());
        produto.adicionarEstoque(20);
        System.out.println(produto.getQuantidadeEmEstoque());
        produto.removerEstoque(130);
        System.out.println(produto.getQuantidadeEmEstoque());


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
