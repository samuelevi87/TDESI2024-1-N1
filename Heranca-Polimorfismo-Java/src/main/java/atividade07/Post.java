import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

// Classe abstrata Post
abstract class Post {
    private static int currentId = 0; // Gerador automático de IDs
    protected int id;
    protected String autor;
    protected String conteudo;
    protected LocalDateTime dataPublicacao;
    protected int likes;

    public Post(String autor, String conteudo) {
        this.id = ++currentId;
        this.autor = autor;
        this.conteudo = conteudo;
        this.dataPublicacao = LocalDateTime.now();
        this.likes = 0;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public int getLikes() {
        return likes;
    }

    // Método para adicionar likes
    public void adicionarLike() {
        likes++;
    }

    // Método abstrato que será implementado nas subclasses
    public abstract String exibir();
}

// Subclasse TextPost
class TextPost extends Post {
    private ArrayList<String> hashtags;

    public TextPost(String autor, String conteudo, ArrayList<String> hashtags) {
        super(autor, conteudo);
        this.hashtags = hashtags;
    }

    @Override
    public String exibir() {
        return "Post de Texto:\n" + conteudo + "\nHashtags: " + hashtags.toString();
    }
}

// Subclasse ImagePost
class ImagePost extends Post {
    private String urlImagem;
    private String filtro;

    public ImagePost(String autor, String conteudo, String urlImagem, String filtro) {
        super(autor, conteudo);
        this.urlImagem = urlImagem;
        this.filtro = filtro;
    }

    @Override
    public String exibir() {
        return "Post de Imagem:\n" + conteudo + "\nImagem: " + urlImagem + "\nFiltro: " + filtro;
    }
}

// Subclasse VideoPost
class VideoPost extends Post {
    private String urlVideo;
    private int duracao; // Em segundos

    public VideoPost(String autor, String conteudo, String urlVideo, int duracao) {
        super(autor, conteudo);
        this.urlVideo = urlVideo;
        this.duracao = duracao;
    }

    @Override
    public String exibir() {
        return "Post de Vídeo:\n" + conteudo + "\nVídeo: " + urlVideo + "\nDuração: " + duracao + " segundos";
    }
}

// Classe RedeSocial
class RedeSocial {
    private ArrayList<Post> posts;

    public RedeSocial() {
        this.posts = new ArrayList<>();
    }

    // Método para adicionar post
    public void adicionarPost(Post post) {
        posts.add(post);
    }

    // Método para listar todos os posts
    public void listarPosts() {
        for (Post post : posts) {
            System.out.println(post.exibir());
            System.out.println("Likes: " + post.getLikes() + "\n");
        }
    }

    // Método para buscar posts por autor
    public void buscarPostsPorAutor(String autor) {
        for (Post post : posts) {
            if (post.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(post.exibir());
                System.out.println("Likes: " + post.getLikes() + "\n");
            }
        }
    }

    // Método para adicionar like em um post por id
    public void adicionarLike(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                post.adicionarLike();
                System.out.println("Like adicionado ao post " + id);
                return;
            }
        }
        System.out.println("Post com id " + id + " não encontrado.");
    }

    // Método para exibir o post mais popular
    public void exibirPostMaisPopular() {
        Optional<Post> maisPopular = posts.stream().max(Comparator.comparingInt(Post::getLikes));
        if (maisPopular.isPresent()) {
            System.out.println("Post mais popular:");
            System.out.println(maisPopular.get().exibir());
            System.out.println("Likes: " + maisPopular.get().getLikes() + "\n");
        } else {
            System.out.println("Não há posts disponíveis.");
        }
    }
}

// Classe Main para demonstração
public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        // Criando alguns posts
        ArrayList<String> hashtags = new ArrayList<>();
        hashtags.add("#java");
        hashtags.add("#programação");

        TextPost textPost1 = new TextPost("Alice", "Aprendendo Java!", hashtags);
        TextPost textPost2 = new TextPost("Bob", "Amo programação!", new ArrayList<>());

        ImagePost imagePost1 = new ImagePost("Carol", "Olha minha foto!", "www.imagem.com/foto1", "Preto e Branco");
        ImagePost imagePost2 = new ImagePost("Dave", "Foto no parque", "www.imagem.com/foto2", "Sépia");

        VideoPost videoPost1 = new VideoPost("Eve", "Meu novo vídeo!", "www.video.com/video1", 120);
        VideoPost videoPost2 = new VideoPost("Frank", "Duração longa!", "www.video.com/video2", 300);

        // Adicionando posts à rede social
        redeSocial.adicionarPost(textPost1);
        redeSocial.adicionarPost(textPost2);
        redeSocial.adicionarPost(imagePost1);
        redeSocial.adicionarPost(imagePost2);
        redeSocial.adicionarPost(videoPost1);
        redeSocial.adicionarPost(videoPost2);

        // Listar todos os posts
        System.out.println("Listando todos os posts:\n");
        redeSocial.listarPosts();

        // Buscar posts por autor
        System.out.println("Buscando posts de 'Alice':\n");
        redeSocial.buscarPostsPorAutor("Alice");

        // Adicionar likes a alguns posts
        redeSocial.adicionarLike(1); // Like no post 1
        redeSocial.adicionarLike(1); // Like no post 1
        redeSocial.adicionarLike(3); // Like no post 3

        // Exibir o post mais popular
        System.out.println("Post mais popular:\n");
        redeSocial.exibirPostMaisPopular();
    }
}
