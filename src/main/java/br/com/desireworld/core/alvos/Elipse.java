package br.com.desireworld.core.alvos;

import br.com.desireworld.core.Ser;

public class Elipse extends Alvo {
    private String regras;
    private Ser[] alvos;

    public Elipse(String regras, Ser[] alvos) {
        this.id = 8;
        this.nome = "Elipse";
        this.regras = regras;
        this.alvos = alvos;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public Ser[] getAlvos() {
        return alvos;
    }

    public void setAlvos(Ser[] alvos) {
        this.alvos = alvos;
    }
}
