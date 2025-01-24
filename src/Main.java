import br.com.alura.screenmatch.modelos.Filme;

public class Main {

    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("Ratatouille");
        favorito.setAnoDeLancamento(2007);
        favorito.setDuracaoEmMinutos(111);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());
    }

}