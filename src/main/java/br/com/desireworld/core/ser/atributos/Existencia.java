package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Existencia extends Atributo {
    private ValorMag conhecimento;
    private ValorMag experiencia;
    private ValorMag ciencia;
    private ValorMag consciencia;
    private ValorMag memoria;
    private ValorMag bonusCP;

    public Existencia(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao, ValorMag conhecimento, ValorMag experiencia, ValorMag ciencia, ValorMag consciencia, ValorMag memoria, ValorMag bonusCP) {
        super(classe, nivel, pontos, porcentagem, evolucao);
        this.conhecimento = conhecimento;
        this.experiencia = experiencia;
        this.ciencia = ciencia;
        this.consciencia = consciencia;
        this.memoria = memoria;
        this.bonusCP = bonusCP;
    }

    public Existencia() {
        super();
        this.conhecimento = new ValorMag();
        this.experiencia = new ValorMag();
        this.ciencia = new ValorMag();
        this.consciencia = new ValorMag();
        this.memoria = new ValorMag();
        this.bonusCP = new ValorMag();
    }

    public ValorMag getConhecimento() {
        return conhecimento;
    }

    public void setConhecimento(ValorMag conhecimento) {
        this.conhecimento = conhecimento;
    }

    public ValorMag getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(ValorMag experiencia) {
        this.experiencia = experiencia;
    }

    public ValorMag getCiencia() {
        return ciencia;
    }

    public void setCiencia(ValorMag ciencia) {
        this.ciencia = ciencia;
    }

    public ValorMag getConsciencia() {
        return consciencia;
    }

    public void setConsciencia(ValorMag consciencia) {
        this.consciencia = consciencia;
    }

    public ValorMag getMemoria() {
        return memoria;
    }

    public void setMemoria(ValorMag memoria) {
        this.memoria = memoria;
    }

    public ValorMag getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(ValorMag bonusCP) {
        this.bonusCP = bonusCP;
    }
}
