package br.com.desireworld.core.alvos;

import br.com.desireworld.core.ValorMag;
import br.com.desireworld.core.Ser;

public class Circulo extends Alvo {
    private ValorMag raioMaximo;
    private Ser[] alvos;

    public Circulo(ValorMag raioMaximo) {
        this.id = 4;
        this.nome = "Círculo";
        this.raioMaximo = raioMaximo;
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
