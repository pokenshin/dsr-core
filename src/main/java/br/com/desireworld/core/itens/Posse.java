package br.com.desireworld.core.itens;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ValorMag;

public class Posse extends Item  {
    private Material materialBase;

    public Posse(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, Material materialBase) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso);
        this.materialBase = materialBase;
    }

    public Material getMaterialBase() {
        return materialBase;
    }

    public void setMaterialBase(Material materialBase) {
        this.materialBase = materialBase;
    }
}
