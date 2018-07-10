package br.com.desireworld.core.ser.acoes;

import br.com.desireworld.core.Efeito;
import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ciencias.AreaCientifica;
import br.com.desireworld.core.ser.Pericia;

public class Arcanidade extends Acao {

    private String escola;
    private int nucleo;
    private Energia energia;

    public Arcanidade(int id, String nome, int magnitude, String caracteristicas, TipoAcao tipo, Pericia pericia, AreaCientifica areaCientifica, Efeito[] efeitos, String escola, int nucleo, Energia energia) {
        super(id, nome, magnitude, caracteristicas, tipo, pericia, areaCientifica, efeitos);
        this.escola = escola;
        this.nucleo = nucleo;
        this.energia = energia;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getNucleo() {
        return nucleo;
    }

    public void setNucleo(int nucleo) {
        this.nucleo = nucleo;
    }

    public Energia getEnergia() {
        return energia;
    }

    public void setEnergia(Energia energia) {
        this.energia = energia;
    }
}
