package br.com.desireworld.core.itens;

import br.com.desireworld.core.Efeito;
import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ValorMag;

public class Consumivel extends Item {
    private Efeito[] efeitos;

    public Consumivel(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, Efeito[] efeitos) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso);
        this.efeitos = efeitos;
    }

    public Efeito[] getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(Efeito[] efeitos) {
        this.efeitos = efeitos;
    }
}
