import br.com.alura.screenmatch.calculos.CalculadoraDeMaratonas;
import br.com.alura.screenmatch.enums.Genero;
import br.com.alura.screenmatch.filtros.FiltroClassificacoes;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {

    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.setNome("The Matrix");
        primeiroFilme.setAnoDeLancamento(1999);
        primeiroFilme.setDuracaoEmMinutos(135);
        primeiroFilme.setIncluidoNoPlano(true);
        primeiroFilme.setGenero(Genero.ACAO);

        primeiroFilme.avalia(10.00);
        primeiroFilme.avalia(10.00);

        Filme segundoFilme = new Filme();
        segundoFilme.setNome("John Wick");
        segundoFilme.setAnoDeLancamento(2014);
        segundoFilme.setDuracaoEmMinutos(101);
        segundoFilme.setIncluidoNoPlano(true);
        primeiroFilme.setGenero(Genero.ACAO);

        segundoFilme.avalia(1.50);
        segundoFilme.avalia(5.00);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);
        primeiroFilme.setGenero(Genero.DRAMA);

        serie.avalia(4.00);
        serie.avalia(4.50);

        CalculadoraDeMaratonas calculadora = new CalculadoraDeMaratonas();
        calculadora.incluirTituloAMaratona(primeiroFilme);
        calculadora.incluirTituloAMaratona(segundoFilme);
        calculadora.incluirTituloAMaratona(serie);

        System.out.println("Títulos a maratonar: " + calculadora.getQuantidadeDeTitulos());
        System.out.println("Tempo necessários: " + calculadora.getTempoTotal() + " minutos");

        FiltroClassificacoes filtro = new FiltroClassificacoes();
        filtro.filtrarClassificavel(primeiroFilme);
        filtro.filtrarClassificavel(segundoFilme);
        filtro.filtrarClassificavel(serie);
    }
}
