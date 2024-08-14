import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1.Pe Criar uma instância da classe Pessoa.
        Pessoa pessoa=new Pessoa();
        // 2. Exibir o nome e a idade da pessoa.
        pessoa.setIdade(12);
        pessoa.setNome("jorgin");
        System.out.println(pessoa);
        // 3. Alterar a idade da pessoa e exibir novamente.
        pessoa.setIdade(13);
        pessoa.setNome("rodrigo");
        System.out.println(pessoa);

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        ContaBancaria conta=new ContaBancaria();
        // 2. Depositar um valor na conta.
       conta.deposito(100);
        // 3. Sacar um valor da conta.
        conta.sacar(50);
        // 4. Exibir o saldo final.
        System.out.println(conta.getSaldo());

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
