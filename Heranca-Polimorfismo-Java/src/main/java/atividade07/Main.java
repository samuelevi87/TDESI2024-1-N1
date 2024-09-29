package main.java.atividade07;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /***
         * Criação da instância da rede social
         */
        RedeSocial redeSocial = new RedeSocial();

        /***
         * Adicionando posts de texto
         */
        TextPost textPost1 = new TextPost
                ("Alice", "Primeiro post de texto!");
        TextPost textPost2 = new TextPost
                ("Alice", "Outro dia, outra reflexão.");
        redeSocial.adicionarPost(textPost1);
        redeSocial.adicionarPost(textPost2);

        /***
         * Adicionando hashtags ao primeiro post de texto
         */
        textPost1.adicionarHashtag("#primeiro");
        textPost1.adicionarHashtag("#reflexão");

        /***
         * Adicionando posts de imagem
         */
        ImagePost imagePost1 = new ImagePost
                ("Bob", "Uma bela paisagem!", "http://imagem.com/paisagem.jpg", "brilho");
        ImagePost imagePost2 = new ImagePost
                ("Bob", "Foto do meu cachorro!", "http://imagem.com/cachorro.jpg", "preto e branco");
        redeSocial.adicionarPost(imagePost1);
        redeSocial.adicionarPost(imagePost2);

        /***
         * Adicionando posts de vídeo
         */
        VideoPost videoPost1 = new VideoPost
                ("Charlie", "Meu primeiro vídeo!", "https://youtube.com/shorts/ISYJHHShtlE?si=fXko46IdbG8_lu-I", 120);
        VideoPost videoPost2 = new VideoPost
                ("Charlie", "Um passeio no parque!", "https://youtube.com/shorts/dR4sPeKx3zU?si=F2rkj9NFiGJoPmVy", 90);
        redeSocial.adicionarPost(videoPost1);
        redeSocial.adicionarPost(videoPost2);

        /***
         * Listando todos os posts
         */
        System.out.println("Todos os posts:");
        List<String> todosPosts = redeSocial.listarPosts();
        for (String post : todosPosts) {
            System.out.println(post);
            System.out.println();
        }

        /***
         * Buscando posts por autor
         */
        System.out.println("Posts de Alice:");
        List<String> postsDeAlice = redeSocial.buscarPostsPorAutor("Alice");
        for (String post : postsDeAlice) {
            System.out.println(post);
            System.out.println();
        }

        /***
         * Adicionando likes a alguns posts
         */
        redeSocial.adicionarLikeAoPost(textPost1.getId());
        redeSocial.adicionarLikeAoPost(imagePost1.getId());
        redeSocial.adicionarLikeAoPost(videoPost1.getId());
        redeSocial.adicionarLikeAoPost(videoPost1.getId());

        /***
         * Exibindo o post mais popular
         */
        System.out.println("Post mais popular:");
        System.out.println(redeSocial.exibirPostMaisPopular());
    }
}
