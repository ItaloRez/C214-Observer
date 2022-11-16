package br.inatel.cdg;

import br.inatel.cdg.palavras.ContadorMaiusculas;
import br.inatel.cdg.palavras.ContadorPares;
import br.inatel.cdg.palavras.ContadorTodas;
import br.inatel.cdg.palavras.impl.Observador;
import br.inatel.cdg.palavras.impl.Observavel;

public class Palavras {

    public static void main(String[] args) {

        Observavel frase = new Observavel();

        Observador contadorTodas = new ContadorTodas(1);
        Observador contadorPares = new ContadorPares(2);
        Observador contadorMaiusculas = new ContadorMaiusculas(3);

        frase.registraObservador(contadorTodas);
        frase.registraObservador(contadorPares);
        frase.registraObservador(contadorMaiusculas);

        frase.setNovaFrase("Aula de Padrões de Projeto");

    }

}
