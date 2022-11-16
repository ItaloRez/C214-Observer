package br.inatel.cdg.palavras.impl;

import br.inatel.cdg.palavras.interfaces.iObservador;

public class ContarTodasPalavras implements iObservador {

    @Override
    public void update(Observavel frase) {
        String[] palavras = frase.getFrase().split(" ");
        System.out.println("Numero de palavras: " + palavras.length);
    }

}
