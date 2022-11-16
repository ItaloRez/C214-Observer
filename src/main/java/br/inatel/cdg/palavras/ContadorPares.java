package br.inatel.cdg.palavras;

import br.inatel.cdg.palavras.impl.ContarPalavrasPares;
import br.inatel.cdg.palavras.impl.Observador;
import br.inatel.cdg.palavras.impl.Observavel;

public class ContadorPares extends Observador {

    public ContadorPares(int id_obs) {
        id = id_obs;
        contador = new ContarPalavrasPares();
    }

    @Override
    public void update(Observavel frase) {
        contador.update(frase);
    }
}
