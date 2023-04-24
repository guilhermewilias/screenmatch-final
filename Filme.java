package br.com.alura.screenmatch.modelos;

//Private = Fazendo que isto não possa ser alterado pelo usuário

import br.alura.screenmatch.calculo.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor ;

    // Construtor : são os responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida
    //Setando para colocar o nome direto no "new filme ("name-film);" - NAME COMENT : GG1

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }

    @Override
    public String toString() {
        return "Filme : " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
}
