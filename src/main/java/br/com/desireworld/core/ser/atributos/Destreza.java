package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Destreza extends Atributo {
    private ValorMag reflexo;
    private ValorMag esquiva;
    private ValorMag ataque;
    private ValorMag coordenacao;
    private ValorMag iniciativa;
    private int bonusCP;

    public Destreza(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao, ValorMag reflexo, ValorMag esquiva, ValorMag ataque, ValorMag coordenacao, ValorMag iniciativa, int bonusCP) {
        super(classe, nivel, pontos, porcentagem, evolucao);
        this.reflexo = reflexo;
        this.esquiva = esquiva;
        this.ataque = ataque;
        this.coordenacao = coordenacao;
        this.iniciativa = iniciativa;
        this.bonusCP = bonusCP;
    }

    public ValorMag getReflexo() {
        return reflexo;
    }

    public void setReflexo(ValorMag reflexo) {
        this.reflexo = reflexo;
    }

    public ValorMag getEsquiva() {
        return esquiva;
    }

    public void setEsquiva(ValorMag esquiva) {
        this.esquiva = esquiva;
    }

    public ValorMag getAtaque() {
        return ataque;
    }

    public void setAtaque(ValorMag ataque) {
        this.ataque = ataque;
    }

    public ValorMag getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(ValorMag coordenacao) {
        this.coordenacao = coordenacao;
    }

    public ValorMag getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(ValorMag iniciativa) {
        this.iniciativa = iniciativa;
    }

    public int getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(int bonusCP) {
        this.bonusCP = bonusCP;
    }
}
