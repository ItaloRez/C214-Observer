package br.inatel.cdg.palavras;

import br.inatel.cdg.palavras.impl.ContarPalavrasInicialMaiuscula;
import br.inatel.cdg.palavras.impl.Observador;
import br.inatel.cdg.palavras.impl.Observavel;

public class ContadorMaiusculas extends Observador {

    public ContadorMaiusculas(int id_obs) {
        id = id_obs;
        contador = new ContarPalavrasInicialMaiuscula();
    }

    @Override
    public void update(Observavel frase) {
        contador.update(frase);
    }

}
