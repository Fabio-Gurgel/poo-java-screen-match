package br.com.alura.screenmatch.filtros;

import br.com.alura.screenmatch.interfaces.Classificavel;

public class FiltroClassificacoes {

    public void filtrarClassificavel(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos no momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
