package br.inatel.cdg.palavras;

import br.inatel.cdg.palavras.impl.ContarTodasPalavras;
import br.inatel.cdg.palavras.impl.Observador;
import br.inatel.cdg.palavras.impl.Observavel;

public class ContadorTodas extends Observador {

    public ContadorTodas(int id_obs) {
        id = id_obs;
        contador = new ContarTodasPalavras();
    }

    @Override
    public void update(Observavel frase) {
        contador.update(frase);
    }

}
