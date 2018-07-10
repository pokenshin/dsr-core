package br.com.desireworld.core.alvos;

import br.com.desireworld.core.ValorMag;
import br.com.desireworld.core.Ser;

public class Linha extends Alvo {
    private ValorMag distancia;
    private ValorMag velocidade;
    private Ser alvo;

    public Linha(ValorMag distancia, ValorMag velocidade, Ser alvo) {
        this.id = 3;
        this.nome = "Linha";
        this.distancia = distancia;
        this.velocidade = velocidade;
        this.alvo = alvo;
    }

    public ValorMag getDistancia() {
        return distancia;
    }

    public void setDistancia(ValorMag distancia) {
        this.distancia = distancia;
    }

    public ValorMag getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(ValorMag velocidade) {
        this.velocidade = velocidade;
    }

    public Ser getAlvo() {
        return alvo;
    }

    public void setAlvo(Ser alvo) {
        this.alvo = alvo;
    }
}
