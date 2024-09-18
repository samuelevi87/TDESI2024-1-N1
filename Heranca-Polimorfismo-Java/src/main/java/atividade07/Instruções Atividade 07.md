## 7. Sistema de Mídia Social

Projete um sistema básico para uma plataforma de mídia social.

1. Crie uma classe base abstrata `Post` com os seguintes atributos:
    - `id` (int)
    - `autor` (String)
    - `conteudo` (String)
    - `dataPublicacao` (LocalDateTime)
    - `likes` (int)

2. Implemente os seguintes métodos na classe `Post`:
    - Um construtor que aceite autor e conteudo (id deve ser gerado automaticamente, dataPublicacao inicializada com a data/hora atual, e likes iniciado em 0)
    - Getters para todos os atributos
    - Um método `adicionarLike()`
    - Um método abstrato `exibir()` que retorne uma String

3. Crie as seguintes subclasses de `Post`:
    - `TextPost`
    - `ImagePost`
    - `VideoPost`

4. Para cada subclasse, adicione atributos específicos:
    - `TextPost`: `hashtags` (ArrayList<String>)
    - `ImagePost`: `urlImagem` (String), `filtro` (String)
    - `VideoPost`: `urlVideo` (String), `duracao` (int, em segundos)

5. Implemente o método `exibir()` em cada subclasse, formatando a saída de acordo com o tipo de post:
    - `TextPost`: Incluir hashtags ao final do conteúdo
    - `ImagePost`: Incluir a URL da imagem e o filtro aplicado
    - `VideoPost`: Incluir a URL do vídeo e sua duração

6. Crie uma classe `RedeSocial` com um ArrayList de `Post` e métodos para:
    - Adicionar posts
    - Listar todos os posts
    - Buscar posts por autor
    - Adicionar like a um post específico (por id)
    - Exibir o post mais popular (com mais likes)

7. Na classe `Main`, crie uma instância de `RedeSocial` e adicione pelo menos 2 posts de cada tipo. Demonstre o funcionamento dos métodos de adição de posts, listagem, busca por autor e adição de likes.

