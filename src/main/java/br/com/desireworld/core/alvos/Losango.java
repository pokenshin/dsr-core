package br.com.desireworld.core.alvos;

import br.com.desireworld.core.Ser;
import br.com.desireworld.core.ValorMag;

public class Losango extends Alvo {
    private ValorMag raioMaximo;
    private Ser[] alvos;

    public Losango(ValorMag raioMaximo, Ser[] alvos) {
        this.id = 6;
        this.nome = "Losango";
        this.raioMaximo = raioMaximo;
        this.alvos = alvos;
    }

    public ValorMag getRaioMaximo() {
        return raioMaximo;
    }

    public void setRaioMaximo(ValorMag raioMaximo) {
        this.raioMaximo = raioMaximo;
    }

    public Ser[] getAlvos() {
        return alvos;
    }

    public void setAlvos(Ser[] alvos) {
        this.alvos = alvos;
    }
}
