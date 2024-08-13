public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

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
class Pessoa {
    // Atributos
    private final String nome;
    private int idade;

    // Construtor que inicializa os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para alterar a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("Victor", 19);

        // Exibindo informações
        pessoa.exibirInformacoes();

        // Alterando a idade
        pessoa.setIdade(20);

        // Exibindo informações novamente para ver a mudança
        pessoa.exibirInformacoes();
    }
}

class ContaBancaria {
    // Atributo para o saldo da conta
    private double saldo;

    // Construtor que inicializa o saldo da conta
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar um valor na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar um valor da conta
    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("O valor do saque deve ser positivo.");
        }
    }

    // Método para obter o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // 1. Criar uma instância da classe ContaBancaria com um saldo inicial de R$ 1000
        ContaBancaria conta = new ContaBancaria(1000.00);

        // 2. Depositar um valor de R$ 500
        conta.depositar(500.00);

        // 3. Sacar um valor de R$ 200
        conta.sacar(200.00);

        // 4. Exibir o saldo final
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}
