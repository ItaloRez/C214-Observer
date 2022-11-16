package br.inatel.cdg.palavras.impl;

import br.inatel.cdg.palavras.interfaces.iObservador;

public abstract class Observador {

    protected iObservador contador;
    protected int id;

    public void update(Observavel frase) {
        contador.update(frase);
    }

}
