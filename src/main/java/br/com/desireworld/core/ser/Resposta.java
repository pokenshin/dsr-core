package br.com.desireworld.core.ser;

import br.com.desireworld.core.ValorMag;

public class Resposta {
    private ValorMag desespero;
    private ValorMag panico;
    private ValorMag medo;
    private ValorMag indiferenca;
    private ValorMag coragem;
    private ValorMag bravura;
    private ValorMag heroismo;

    public Resposta(ValorMag desespero, ValorMag panico, ValorMag medo, ValorMag indiferenca, ValorMag coragem, ValorMag bravura, ValorMag heroismo) {
        this.desespero = desespero;
        this.panico = panico;
        this.medo = medo;
        this.indiferenca = indiferenca;
        this.coragem = coragem;
        this.bravura = bravura;
        this.heroismo = heroismo;
    }

    public ValorMag getDesespero() {
        return desespero;
    }

    public void setDesespero(ValorMag desespero) {
        this.desespero = desespero;
    }

    public ValorMag getPanico() {
        return panico;
    }

    public void setPanico(ValorMag panico) {
        this.panico = panico;
    }

    public ValorMag getMedo() {
        return medo;
    }

    public void setMedo(ValorMag medo) {
        this.medo = medo;
    }

    public ValorMag getIndiferenca() {
        return indiferenca;
    }

    public void setIndiferenca(ValorMag indiferenca) {
        this.indiferenca = indiferenca;
    }

    public ValorMag getCoragem() {
        return coragem;
    }

    public void setCoragem(ValorMag coragem) {
        this.coragem = coragem;
    }

    public ValorMag getBravura() {
        return bravura;
    }

    public void setBravura(ValorMag bravura) {
        this.bravura = bravura;
    }

    public ValorMag getHeroismo() {
        return heroismo;
    }

    public void setHeroismo(ValorMag heroismo) {
        this.heroismo = heroismo;
    }
}
