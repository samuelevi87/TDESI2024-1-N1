import Exercicio01.Pessoa;
import Exercicio02.ContaBancaria;
import Exercicio03.Produto;
import Exercicio04.Livro;
import Exercicio05.Carro;
import Exercicio06.Cliente;
import Exercicio07.Pedido;
import Exercicio08.Funcionario;

public class Main {
    public static void main(String[] args) {
        // Exercício 1:
        // 1. Criar uma instância da classe Pessoa.
        // 2. Exibir o nome e a idade da pessoa.
        // 3. Alterar a idade da pessoa e exibir novamente.

       // Pessoa pessoa1 = new Pessoa("Jão",25);
      //   System.out.println(pessoa1);

      //  pessoa1.setIdade(30);
      //  System.out.println(pessoa1);

      //  System.out.println();

        // Exercício 2:
       //  1. Criar uma instância da classe ContaBancaria com um saldo inicial.
       // ContaBancaria conta1 = new ContaBancaria(5, 200);
     //   System.out.println("saldo inicial : "+conta1.getSaldo());

        // 2. Depositar um valor na conta.
      //   conta1.depositar(200);

      //   3. Sacar um valor da conta.
      //  conta1.sacar(20);
       //  4. Exibir o saldo final.
    //  System.out.println("saldo atualizada : "+conta1.getSaldo());


        // Exercício 3:
        // 1. Criar uma instância da classe Produto.
      //  Produto produto1 = new Produto("livro",20,6);

        // 2. Exibir o nome, preço e quantidade em estoque.
      //  System.out.println(" nome do Produto : "+produto1.getNome());

        // 3. Adicionar itens ao estoque e exibir a nova quantidade.
       // produto1.adicionarEstoque(6);

        // 4. Remover itens do estoque e exibir a nova quantidade.
       // produto1.removerEstoque(12);
      //  System.out.println(" Estoque atualizado : "+produto1.getQuantitadeDeEstoque());

        // Exercício 4:
        // 1. Criar uma instância da classe Livro.
       // Livro livro1 = new Livro("É assim que acaba","Colleen Hoover",2016 );

        // 2. Exibir o título, autor e ano de publicação.System.out.println("Titulo : "+livro1.getTitulo());
      //   System.out.println("Titulo : "+livro1.getTitulo());
       //  System.out.println("Autor : "+livro1.getAutor());
       //  System.out.println("Ano da publicacao : "+livro1.getAnoPublicacao());

        // 3. Alterar o ano de publicação e exibir novamente.
       // livro1.setAnoPublicacao(2022);
      //  System.out.println("O ano do livro foi atualizado : "+livro1);


        // Exercício 5:
        // 1. Criar uma instância da classe Carro.
       // Carro carro1 = new Carro("Mustang","Ford",2024,0.0);

        // 2. Exibir a marca, modelo, ano e quilometragem do carro.
      //  System.out.println(carro1);

        // 3. Adicionar quilometragem ao carro e exibir a nova quilometragem.
     //   carro1.AdicionarQuilometragem(100.5);
     //   System.out.println("Novo km : "+carro1.getQuilometragem());

        // Exercício 6:
        // 1. Criar uma instância da classe Cliente.
       // Cliente cliente1 = new Cliente("Claudyson","claudysonclairmeus@gmail.com","47997853831");

        // 2. Exibir o nome, email e telefone do cliente.
      //  System.out.println("nome    : "+cliente1.getNome());
      //  System.out.println("email   : "+cliente1.getEmail());
     //   System.out.println("telefone: "+cliente1.getTelefone());

        // 3. Alterar o telefone do cliente e exibir novamente.
      //  cliente1.setTelefone("47984535802");
       // System.out.println(cliente1);

        // Exercício 7:
        // 1. Criar uma instância da classe Pedido.
       // Pedido pedido1 = new Pedido(001,200,"Processado");

        // 2. Exibir o número do pedido, valor total e status.
       // System.out.println("Numero pedido : "+pedido1.getNumeroPedido());
       // System.out.println("Valor total   : "+pedido1.getValorTotal());
       // System.out.println("Status        : "+pedido1.getStatus());

        // 3. Alterar o status do pedido e exibir novamente.
        //pedido1.setStatus("Enviado");
       // System.out.println(pedido1);

        // Exercício 8:
        // 1. Criar uma instância da classe Funcionario.
        Funcionario funcionario1 = new Funcionario("Claudyson Clairmeus","Conferente",2500.00);

        // 2. Exibir o nome, cargo e salário do funcionário.
        System.out.println("Nome   : "+funcionario1.getNome());
        System.out.println("Cargo  : "+funcionario1.getCargo());
        System.out.println("salario: "+funcionario1.getSalario());

        // 3. Alterar o salário do funcionário e exibir novamente.
        funcionario1.setSalario(2800.00);
        System.out.println(funcionario1);

        // Exercício 9:
        // 1. Criar uma instância da classe ProdutoIndustrial.
        // 2. Exibir o código, nome, preço de custo e preço de venda do produto.
        // 3. Calcular e exibir a margem de lucro do produto.

        // Exercício 10:
        // 1. Criar uma instância da classe Contrato.
        // 2. Exibir o número do contrato, descrição, valor e vigência.
        // 3. Alterar a vigência do contrato e exibir novamente.

        // Exercício 11:
        // 1. Criar uma instância da classe Fornecedor.
        // 2. Exibir o nome, CNPJ e telefone do fornecedor.
        // 3. Alterar o telefone do fornecedor e exibir novamente.

        // Exercício 12:
        // 1. Criar uma instância da classe Maquina.
        // 2. Exibir o ID da máquina, tipo e status de operação.
        // 3. Alterar o status de operação da máquina e exibir novamente.

        // Exercício 13:
        // 1. Criar uma instância da classe VeiculoEmpresa.
        // 2. Exibir a placa, modelo, ano e quilometragem do veículo.
        // 3. Adicionar quilometragem ao veículo e exibir a nova quilometragem.

        // Exercício 14:
        // 1. Criar uma instância da classe Projeto.
        // 2. Exibir o nome, duração e orçamento do projeto.
        // 3. Alterar o orçamento do projeto e exibir novamente.

        // Exercício 15:
        // 1. Criar uma instância da classe Seguro.
        // 2. Exibir o número da apólice, tipo de seguro, valor de cobertura e valor do prêmio.
        // 3. Alterar o valor do prêmio e exibir novamente.
    }
}
