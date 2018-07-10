package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Ideia {
    private int ki;
    private int base;
    private ValorMag misterio;
    private ValorMag holismo;
    private ValorMag nexo;
    private ValorMag bonusMP;
    private int bonusCP;

    public Ideia(int ki, int base, ValorMag misterio, ValorMag holismo, ValorMag nexo, ValorMag bonusMP, int bonusCP) {
        this.ki = ki;
        this.base = base;
        this.misterio = misterio;
        this.holismo = holismo;
        this.nexo = nexo;
        this.bonusMP = bonusMP;
        this.bonusCP = bonusCP;
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
