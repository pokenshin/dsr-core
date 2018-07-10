package br.com.desireworld.core.alvos;

import br.com.desireworld.core.Ser;

public class Ponto extends Alvo {
    private Ser alvo;

    public Ponto(Ser alvo) {
        this.id = 2;
        this.nome = "Ponto";
        this.alvo = alvo;
    }

    public Ser getAlvo() {
        return alvo;
    }

    public void setAlvo(Ser alvo) {
        this.alvo = alvo;
    }
}
