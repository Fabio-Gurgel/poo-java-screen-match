public class Filme {

    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    Genero genero;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;


    void exibirFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Gênero do filme: " + genero);
        System.out.println("Ano de lançamento: " +anoDeLancamento);
        System.out.println("Duração em minutos: " +duracaoEmMinutos);
        System.out.println("Incluído no plano: " +incluidoNoPlano);
    }

    void avaliar(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double obterMediaDeAvalicoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}