package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeMaratonas {

    private int tempoTotal;
    private int quantidadeDeTitulos;

    public void incluirTituloAMaratona(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
        quantidadeDeTitulos++;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public int getQuantidadeDeTitulos() {
        return quantidadeDeTitulos;
    }
}
