## 4. Sistema de Notificações

Desenvolva um sistema de notificações para uma aplicação móvel.

1. Crie uma interface `Notificavel` com o seguinte método:
    - `enviarNotificacao()`

2. Crie uma classe base abstrata `Notificacao` que implemente `Notificavel`, com os seguintes atributos:
    - `mensagem` (String)
    - `destinatario` (String)
    - `dataEnvio` (LocalDateTime)

3. Implemente os seguintes métodos na classe `Notificacao`:
    - Um construtor que aceite mensagem e destinatario (dataEnvio deve ser inicializada com a data/hora atual)
    - Getters para todos os atributos
    - Um método abstrato `formatarMensagem()` que retorne uma String

4. Crie as seguintes subclasses de `Notificacao`:
    - `EmailNotificacao`
    - `SMSNotificacao`
    - `PushNotificacao`

5. Para cada subclasse, adicione atributos específicos:
    - `EmailNotificacao`: `assunto` (String)
    - `SMSNotificacao`: `numeroTelefone` (String)
    - `PushNotificacao`: `dispositivo` (String)

6. Implemente o método `formatarMensagem()` em cada subclasse, adicionando prefixos específicos:
    - `EmailNotificacao`: "E-mail: [assunto] - "
    - `SMSNotificacao`: "SMS para [numeroTelefone]: "
    - `PushNotificacao`: "Push para [dispositivo]: "

7. Sobrescreva o método `enviarNotificacao()` em cada subclasse para imprimir a mensagem formatada junto com informações específicas de cada tipo de notificação.

8. Crie uma classe `GerenciadorNotificacoes` com um ArrayList de `Notificacao` e métodos para:
    - Adicionar notificações
    - Enviar todas as notificações pendentes
    - Listar todas as notificações enviadas

9. Na classe `Main`, crie uma instância de `GerenciadorNotificacoes` e adicione pelo menos 2 notificações de cada tipo. Demonstre o funcionamento dos métodos de adição e envio de notificações.

