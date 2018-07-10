package br.com.desireworld.core.alvos;

import br.com.desireworld.core.Ser;

public class Triangulo extends Alvo {
    private Ser alvo;

    public Triangulo(Ser alvo) {
        this.id = 7;
        this.nome = "Triãngulo";
        this.alvo = alvo;
    }

    public Ser getAlvo() {
        return alvo;
    }

    public void setAlvo(Ser alvo) {
        this.alvo = alvo;
    }
}
