## 5. Sistema de Pagamento

Crie um sistema de processamento de pagamentos para um e-commerce.

1. Crie uma interface `Pagavel` com os seguintes métodos:
    - `processarPagamento(double valor)`
    - `estornarPagamento(double valor)`

2. Crie uma classe base abstrata `FormaPagamento` que implemente `Pagavel`, com os seguintes atributos:
    - `nome` (String)
    - `taxaTransacao` (double)

3. Implemente os seguintes métodos na classe `FormaPagamento`:
    - Um construtor que aceite nome e taxaTransacao
    - Getters para todos os atributos
    - Um método abstrato `calcularTaxa(double valor)` que retorne um double

4. Crie as seguintes subclasses de `FormaPagamento`:
    - `CartaoCredito`
    - `Boleto`
    - `TransferenciaBancaria`

5. Para cada subclasse, adicione atributos específicos:
    - `CartaoCredito`: `numeroCartao` (String), `bandeira` (String)
    - `Boleto`: `codigoBarras` (String)
    - `TransferenciaBancaria`: `banco` (String), `agencia` (String), `conta` (String)

6. Implemente o método `calcularTaxa(double valor)` em cada subclasse:
    - `CartaoCredito`: taxaTransacao + 2% do valor
    - `Boleto`: taxaTransacao (fixa)
    - `TransferenciaBancaria`: taxaTransacao + 1% do valor

7. Sobrescreva os métodos `processarPagamento(double valor)` e `estornarPagamento(double valor)` em cada subclasse, imprimindo mensagens específicas e calculando o valor final após as taxas.

8. Crie uma classe `ProcessadorPagamento` com um ArrayList de `FormaPagamento` e métodos para:
    - Adicionar formas de pagamento
    - Processar um pagamento (recebendo valor e tipo de pagamento)
    - Estornar um pagamento (recebendo valor e tipo de pagamento)
    - Listar todas as formas de pagamento disponíveis

9. Na classe `Main`, crie uma instância de `ProcessadorPagamento` e adicione pelo menos uma instância de cada forma de pagamento. Demonstre o funcionamento dos métodos de processamento e estorno de pagamentos para cada tipo.
