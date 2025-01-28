import br.com.alura.screenmatch.calculos.CalculadoraDeMaratonas;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {

    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.setNome("The Matrix");
        primeiroFilme.setAnoDeLancamento(1999);
        primeiroFilme.setDuracaoEmMinutos(135);
        primeiroFilme.setIncluidoNoPlano(true);

        Filme segundoFilme = new Filme();
        segundoFilme.setNome("John Wick");
        segundoFilme.setAnoDeLancamento(2014);
        segundoFilme.setDuracaoEmMinutos(101);
        segundoFilme.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeMaratonas calculadora = new CalculadoraDeMaratonas();
        calculadora.incluirTituloAMaratona(primeiroFilme);
        calculadora.incluirTituloAMaratona(segundoFilme);
        calculadora.incluirTituloAMaratona(serie);

        System.out.println("Títulos a maratonar: " + calculadora.getQuantidadeDeTitulos());
        System.out.println("Tempo necessários: " + calculadora.getTempoTotal() + " minutos");
    }
}
