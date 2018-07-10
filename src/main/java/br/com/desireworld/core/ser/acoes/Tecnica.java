package br.com.desireworld.core.ser.acoes;

import br.com.desireworld.core.Efeito;
import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ciencias.AreaCientifica;
import br.com.desireworld.core.ser.Pericia;

public class Tecnica extends Acao {
    private Energia energia;

    public Tecnica(int id, String nome, int magnitude, String caracteristicas, TipoAcao tipo, Pericia pericia, AreaCientifica areaCientifica, Efeito[] efeitos, Energia energia) {
        super(id, nome, magnitude, caracteristicas, tipo, pericia, areaCientifica, efeitos);
        this.energia = energia;
    }

    public Energia getEnergia() {
        return energia;
    }

    public void setEnergia(Energia energia) {
        this.energia = energia;
    }
}
