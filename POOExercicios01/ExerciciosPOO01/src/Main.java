import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;

public class Main {
    public static void main(String[] args) {

       Pessoa pessoaNova = new Pessoa("Maria", 30);
       System.out.println("O nome é:" + pessoaNova.getNome());
       System.out.println("A idade é:" + pessoaNova.getIdade());
       pessoaNova.setIdade(35);
       System.out.println("Atualização:\nNome:" + pessoaNova.getNome() + "\nIdade:" + pessoaNova.getIdade());

        // Exercício 2:
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial.
        // 2. Depositar um valor na conta.
        // 3. Sacar um valor da conta.
        // 4. Exibir o saldo final.




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