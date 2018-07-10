package br.com.desireworld.core.itens;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ValorMag;


public abstract class Equipamento extends Item {
    private Material materialBase;
    private int slot;

    public Equipamento(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, Material materialBase, int slot) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso);
        this.materialBase = materialBase;
        this.slot = slot;
    }

    public Material getMaterialBase() {
        return materialBase;
    }

    public void setMaterialBase(Material materialBase) {
        this.materialBase = materialBase;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }
}
