package br.alura.screenmatch.calculo.principal;

import br.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme; //O import é a forma que uma classe se referencia a outra quando estão em pacotes diferentes.
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970); //GG1 - COMENT FILME.JAVA
        //meuFilme.setNome("O poderoso Chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme : " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações" + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10; Agora não queremos que assim funcione.
        //meuFilme.totalDeAvaliacoes = 1; Agora não queremos que assim funcione.
        //System.out.println(meuFilme.pegaMedia()); Agora não queremos que assim funcione.


        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost :  " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023) ; //GG1 - COMENT FILME.JAVA
        //outroFilme.setNome("Avatar");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui((outroFilme));
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        var terceiroFilme = new Filme("DogVille" , 2003); //GG1 - COMENT FILME.JAVA
       // terceiroFilme.setNome("DogVille");
        terceiroFilme.setDuracaoEmMinutos(200);
        //terceiroFilme.setAnoDeLancamento(2003);
        terceiroFilme.avalia(10);

        ArrayList<Filme>listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(terceiroFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista : " + listaDeFilmes.size());
        System.out.println("Primeiro filme : " + listaDeFilmes.get(0).getNome()); //0 = primeiro top do array
        System.out.println("Segundo filme : " + listaDeFilmes.get(1).getNome());
        System.out.println("Terceiro filme : " + listaDeFilmes.get(2).getNome());
        System.out.println("toString do filme 1 : " + listaDeFilmes.get(0).toString());
    }
}
