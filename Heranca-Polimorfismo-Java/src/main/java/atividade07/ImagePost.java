package main.java.atividade07;

public class ImagePost extends Post {
        private String urlImagem; // URL da imagem do post
        private String filtro; // Filtro aplicado à imagem

        /***
         * Construtor que inicializa os atributos do post.
         *
         * @param autor      O autor do post
         * @param conteudo   O conteúdo do post
         * @param urlImagem  A URL da imagem
         * @param filtro     O filtro aplicado
         */
        public ImagePost(String autor, String conteudo, String urlImagem, String filtro) {
            super(autor, conteudo);
            this.urlImagem = urlImagem;
            this.filtro = filtro;
        }

        /***
         * Exibe o conteúdo do post formatado com a URL da imagem e o filtro.
         *
         * @return A representação em String do post
         */
        @Override
        public String exibir() {
            return getConteudo() + "\nImagem: " + urlImagem + "\nFiltro: " + filtro;
        }
}
