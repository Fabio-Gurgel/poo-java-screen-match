package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.enums.Genero;

public class Filme extends Titulo {

    private String diretor;

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}
