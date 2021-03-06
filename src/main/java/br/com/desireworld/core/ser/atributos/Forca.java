package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Forca extends Atributo {
    private ValorMag potencia;
    private ValorMag golpe;
    private ValorMag dureza;
    private ValorMag vigor;
    private ValorMag sustentacao;
    private ValorMag bonusCP;

    public Forca(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao, ValorMag potencia, ValorMag golpe, ValorMag dureza, ValorMag vigor, ValorMag sustentacao, ValorMag bonusCP) {
        super(classe, nivel, pontos, porcentagem, evolucao);
        this.potencia = potencia;
        this.golpe = golpe;
        this.dureza = dureza;
        this.vigor = vigor;
        this.sustentacao = sustentacao;
        this.bonusCP = bonusCP;
    }

    public Forca() {
        super();
        this.potencia = new ValorMag();
        this.golpe = new ValorMag();
        this.dureza = new ValorMag();
        this.vigor = new ValorMag();
        this.sustentacao = new ValorMag();
        this.bonusCP = new ValorMag();
    }

    public ValorMag getPotencia() {
        return potencia;
    }

    public void setPotencia(ValorMag potencia) {
        this.potencia = potencia;
    }

    public ValorMag getGolpe() {
        return golpe;
    }

    public void setGolpe(ValorMag golpe) {
        this.golpe = golpe;
    }

    public ValorMag getDureza() {
        return dureza;
    }

    public void setDureza(ValorMag dureza) {
        this.dureza = dureza;
    }

    public ValorMag getVigor() {
        return vigor;
    }

    public void setVigor(ValorMag vigor) {
        this.vigor = vigor;
    }

    public ValorMag getSustentacao() {
        return sustentacao;
    }

    public void setSustentacao(ValorMag sustentacao) {
        this.sustentacao = sustentacao;
    }

    public ValorMag getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(ValorMag bonusCP) {
        this.bonusCP = bonusCP;
    }
}
