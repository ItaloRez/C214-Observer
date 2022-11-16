package br.inatel.cdg.palavras.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.cdg.palavras.interfaces.iObservavel;

public class Observavel implements iObservavel {

    private String frase;
    private List<Observador> observadores;

    public Observavel() {
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if (observadores.contains(obs))
            observadores.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : observadores) {
            observador.update(this);
        }
    }

    private void novasMedidas() {
        notificaObservadores();
    }

    public void setNovaFrase(String frase) {
        this.frase = frase;
        novasMedidas();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
