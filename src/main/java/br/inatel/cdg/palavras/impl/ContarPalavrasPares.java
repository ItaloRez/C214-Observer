package br.inatel.cdg.palavras.impl;

import br.inatel.cdg.palavras.interfaces.iObservador;

public class ContarPalavrasPares implements iObservador {

    @Override
    public void update(Observavel frase) {
        String[] palavras = frase.getFrase().split(" ");
        int cont = 0;
        for (String palavra : palavras) {
            if (palavra.length() % 2 == 0) {
                cont++;
            }
        }
        System.out.println("Numero de palavras pares: " + cont);

    }

}
