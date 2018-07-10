package br.com.desireworld.core.ser;

import br.com.desireworld.core.ValorMag;

public class Subatributos {
    private ValorMag instinto;
    private ValorMag raciocinio;
    private ValorMag subconsciencia;
    private ValorMag autocontrole;
    private ValorMag anatomia;
    private ValorMag animo;
    private ValorMag movimento;
    private ValorMag precisao;
    private ValorMag bonusHP;
    private ValorMag bonusMP;
    private ValorMag bonusCP;
    private ValorMag bonusSP;

    public Subatributos(ValorMag instinto, ValorMag raciocinio, ValorMag subconsciencia, ValorMag autocontrole, ValorMag anatomia, ValorMag animo, ValorMag movimento, ValorMag precisao, ValorMag bonusHP, ValorMag bonusMP, ValorMag bonusCP, ValorMag bonusSP) {
        this.instinto = instinto;
        this.raciocinio = raciocinio;
        this.subconsciencia = subconsciencia;
        this.autocontrole = autocontrole;
        this.anatomia = anatomia;
        this.animo = animo;
        this.movimento = movimento;
        this.precisao = precisao;
        this.bonusHP = bonusHP;
        this.bonusMP = bonusMP;
        this.bonusCP = bonusCP;
        this.bonusSP = bonusSP;
    }

    public ValorMag getInstinto() {
        return instinto;
    }

    public void setInstinto(ValorMag instinto) {
        this.instinto = instinto;
    }

    public ValorMag getRaciocinio() {
        return raciocinio;
    }

    public void setRaciocinio(ValorMag raciocinio) {
        this.raciocinio = raciocinio;
    }

    public ValorMag getSubconsciencia() {
        return subconsciencia;
    }

    public void setSubconsciencia(ValorMag subconsciencia) {
        this.subconsciencia = subconsciencia;
    }

    public ValorMag getAutocontrole() {
        return autocontrole;
    }

    public void setAutocontrole(ValorMag autocontrole) {
        this.autocontrole = autocontrole;
    }

    public ValorMag getAnatomia() {
        return anatomia;
    }

    public void setAnatomia(ValorMag anatomia) {
        this.anatomia = anatomia;
    }

    public ValorMag getAnimo() {
        return animo;
    }

    public void setAnimo(ValorMag animo) {
        this.animo = animo;
    }

    public ValorMag getMovimento() {
        return movimento;
    }

    public void setMovimento(ValorMag movimento) {
        this.movimento = movimento;
    }

    public ValorMag getPrecisao() {
        return precisao;
    }

    public void setPrecisao(ValorMag precisao) {
        this.precisao = precisao;
    }

    public ValorMag getBonusHP() {
        return bonusHP;
    }

    public void setBonusHP(ValorMag bonusHP) {
        this.bonusHP = bonusHP;
    }

    public ValorMag getBonusMP() {
        return bonusMP;
    }

    public void setBonusMP(ValorMag bonusMP) {
        this.bonusMP = bonusMP;
    }

    public ValorMag getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(ValorMag bonusCP) {
        this.bonusCP = bonusCP;
    }

    public ValorMag getBonusSP() {
        return bonusSP;
    }

    public void setBonusSP(ValorMag bonusSP) {
        this.bonusSP = bonusSP;
    }
}
