package br.com.desireworld.core.itens;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ValorMag;

public class Material extends Item {
    private ValorMag dureza;
    private ValorMag resistencia;
    private ValorMag densidade;

    public Material(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, ValorMag dureza, ValorMag resistencia, ValorMag densidade) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso);
        this.dureza = dureza;
        this.resistencia = resistencia;
        this.densidade = densidade;
    }

    public ValorMag getDureza() {
        return dureza;
    }

    public void setDureza(ValorMag dureza) {
        this.dureza = dureza;
    }

    public ValorMag getResistencia() {
        return resistencia;
    }

    public void setResistencia(ValorMag resistencia) {
        this.resistencia = resistencia;
    }

    public ValorMag getDensidade() {
        return densidade;
    }

    public void setDensidade(ValorMag densidade) {
        this.densidade = densidade;
    }
}
