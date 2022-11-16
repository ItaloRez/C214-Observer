package br.inatel.cdg.palavras.interfaces;

import br.inatel.cdg.palavras.impl.Observador;

public interface iObservavel {
    public void registraObservador(Observador obs);

    public void removeObservador(Observador obs);

    public void notificaObservadores();
}
