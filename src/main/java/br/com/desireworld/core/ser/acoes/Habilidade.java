package br.com.desireworld.core.ser.acoes;

import br.com.desireworld.core.Efeito;
import br.com.desireworld.core.ciencias.AreaCientifica;
import br.com.desireworld.core.ser.Pericia;

public class Habilidade extends Acao {
    public Habilidade(int id, String nome, int magnitude, String caracteristicas, TipoAcao tipo, Pericia pericia, AreaCientifica areaCientifica, Efeito[] efeitos) {
        super(id, nome, magnitude, caracteristicas, tipo, pericia, areaCientifica, efeitos);
    }
}
