package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Materia extends Atributo {
    private ValorMag colapso;
    private ValorMag impulso;
    private ValorMag resistencia;
    private ValorMag vitalidade;
    private ValorMag regeneracao;
    private ValorMag bonusCP;
    private ValorMag bonusHP;

    public ValorMag getBonusHP() {
        return bonusHP;
    }

    public void setBonusHP(ValorMag bonusHP) {
        this.bonusHP = bonusHP;
    }

    public Materia(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao, ValorMag colapso, ValorMag impulso, ValorMag resistencia, ValorMag vitalidade, ValorMag regeneracao, ValorMag bonusCP, ValorMag bonusHP) {
        super(classe, nivel, pontos, porcentagem, evolucao);
        this.colapso = colapso;
        this.impulso = impulso;
        this.resistencia = resistencia;
        this.vitalidade = vitalidade;
        this.regeneracao = regeneracao;
        this.bonusCP = bonusCP;
        this.bonusHP = bonusHP;
    }

    public Materia() {
        super();
        this.colapso = new ValorMag();
        this.impulso = new ValorMag();
        this.resistencia = new ValorMag();
        this.vitalidade = new ValorMag();
        this.regeneracao = new ValorMag();
        this.bonusCP = new ValorMag();
        this.bonusHP = new ValorMag();
    }

    public ValorMag getColapso() {
        return colapso;
    }

    public void setColapso(ValorMag colapso) {
        this.colapso = colapso;
    }

    public ValorMag getImpulso() {
        return impulso;
    }

    public void setImpulso(ValorMag impulso) {
        this.impulso = impulso;
    }

    public ValorMag getResistencia() {
        return resistencia;
    }

    public void setResistencia(ValorMag resistencia) {
        this.resistencia = resistencia;
    }

    public ValorMag getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(ValorMag vitalidade) {
        this.vitalidade = vitalidade;
    }

    public ValorMag getRegeneracao() {
        return regeneracao;
    }

    public void setRegeneracao(ValorMag regeneracao) {
        this.regeneracao = regeneracao;
    }

    public ValorMag getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(ValorMag bonusCP) {
        this.bonusCP = bonusCP;
    }
}
