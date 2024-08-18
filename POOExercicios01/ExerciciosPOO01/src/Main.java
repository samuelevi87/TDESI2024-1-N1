import Exercicio01.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        Pessoa pessoa1 = new Pessoa("João", 30);
        // 2. Exibir o nome e a idade da pessoa.
        System.out.println("O nome é: " + pessoa1.getNome());
        System.out.println("A idade é: " + pessoa1.getIdade());

        // 3. Alterar a idade da pessoa e exibir novamente.
        pessoa1.setIdade(33);
        System.out.println("Dados atualizados:\n" + pessoa1.getNome() + ":\nIdade: " + pessoa1.getIdade());



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
