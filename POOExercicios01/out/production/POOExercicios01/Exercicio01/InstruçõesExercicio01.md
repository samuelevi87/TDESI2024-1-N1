Aqui estão três exercícios de criação de classes em Java, seguindo as orientações para focar em conceitos básicos como encapsulamento e manipulação de atributos. A classe `Main` contém apenas os comentários indicando os passos que os alunos devem seguir.

### Exercício 1: Classe `Pessoa`

- **Objetivo:** Criar uma classe `Pessoa` com atributos de nome e idade, além de métodos para manipular esses atributos.

**Especificações:**

- **Atributos:**
  - `nome` (String)
  - `idade` (int)
- **Métodos:**
  - Construtor que inicializa os atributos `nome` e `idade`.
  - Métodos `getNome` e `getIdade` para retornar os valores dos atributos.
  - Método `setIdade` para alterar a idade da pessoa.

public class Pessoa {
// Atributos
private String nome;
private int idade;
lass Pessoa {
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