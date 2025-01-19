public class Main {
    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.nome = "Ratatouille";
        favorito.anoDeLancamento = 2007;
        favorito.duracaoEmMinutos = 111;
        favorito.incluidoNoPlano = true;
        favorito.genero = Genero.ANIMACAO;

        favorito.exibirFichaTecnica();
        favorito.avaliar(9);
        favorito.avaliar(8);
        favorito.avaliar(9);

        System.out.println("Média de avaliações do filme: " + favorito.obterMediaDeAvalicoes());
    }
}