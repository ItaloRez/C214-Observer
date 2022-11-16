package br.inatel.cdg.palavras.impl;

import br.inatel.cdg.palavras.interfaces.iObservador;

public class ContarPalavrasInicialMaiuscula implements iObservador {

    @Override
    public void update(Observavel frase) {
        String[] palavras = frase.getFrase().split(" ");
        int cont = 0;
        for (String palavra : palavras) {
            if (Character.isUpperCase(palavra.charAt(0))) {
                cont++;
            }
        }
        System.out.println("Numero de palavras iniciadas com letra maiuscula: " + cont);
    }

}
