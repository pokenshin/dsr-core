package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Ideia extends Atributo {
    private int ki;
    private int base;
    private ValorMag misterio;
    private ValorMag holismo;
    private ValorMag nexo;
    private ValorMag bonusMP;
    private int bonusCP;

    public Ideia(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao, int ki, int base, ValorMag misterio, ValorMag holismo, ValorMag nexo, ValorMag bonusMP, int bonusCP) {
        super(classe, nivel, pontos, porcentagem, evolucao);
        this.ki = ki;
        this.base = base;
        this.misterio = misterio;
        this.holismo = holismo;
        this.nexo = nexo;
        this.bonusMP = bonusMP;
        this.bonusCP = bonusCP;
    }

    public Ideia() {
        super();
        this.ki = 0;
        this.base = 0;
        this.misterio = new ValorMag();
        this.holismo = new ValorMag();
        this.nexo = new ValorMag();
        this.bonusMP = new ValorMag();
        this.bonusCP = 0;

    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public ValorMag getMisterio() {
        return misterio;
    }

    public void setMisterio(ValorMag misterio) {
        this.misterio = misterio;
    }

    public ValorMag getHolismo() {
        return holismo;
    }

    public void setHolismo(ValorMag holismo) {
        this.holismo = holismo;
    }

    public ValorMag getNexo() {
        return nexo;
    }

    public void setNexo(ValorMag nexo) {
        this.nexo = nexo;
    }

    public ValorMag getBonusMP() {
        return bonusMP;
    }

    public void setBonusMP(ValorMag bonusMP) {
        this.bonusMP = bonusMP;
    }

    public int getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(int bonusCP) {
        this.bonusCP = bonusCP;
    }
}
