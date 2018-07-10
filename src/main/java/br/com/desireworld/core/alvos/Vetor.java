package br.com.desireworld.core.alvos;

import br.com.desireworld.core.Ser;
import br.com.desireworld.core.ValorMag;

public class Vetor extends Alvo {
    private ValorMag pulos;
    private Ser[] alvos;

    public Vetor(ValorMag pulos, Ser[] alvos) {
        this.id = 5;
        this.nome = "Vetor";
        this.pulos = pulos;
        this.alvos = alvos;
    }

    public ValorMag getPulos() {
        return pulos;
    }

    public void setPulos(ValorMag pulos) {
        this.pulos = pulos;
    }

    public Ser[] getAlvos() {
        return alvos;
    }

    public void setAlvos(Ser[] alvos) {
        this.alvos = alvos;
    }
}
