package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Criatividade extends Atributo {

    private ValorMag singularidade;
    private ValorMag invencao;
    private ValorMag tutor;
    private ValorMag realidade;
    private ValorMag irrealidade;
    private ValorMag bonusMP;
    private int bonusCP;

    public Criatividade(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao, ValorMag singularidade, ValorMag invencao, ValorMag tutor, ValorMag realidade, ValorMag irrealidade, ValorMag bonusMP, int bonusCP) {
        super(classe, nivel, pontos, porcentagem, evolucao);
        this.singularidade = singularidade;
        this.invencao = invencao;
        this.tutor = tutor;
        this.realidade = realidade;
        this.irrealidade = irrealidade;
        this.bonusMP = bonusMP;
        this.bonusCP = bonusCP;
    }

    public ValorMag getSingularidade() {
        return singularidade;
    }

    public void setSingularidade(ValorMag singularidade) {
        this.singularidade = singularidade;
    }

    public ValorMag getInvencao() {
        return invencao;
    }

    public void setInvencao(ValorMag invencao) {
        this.invencao = invencao;
    }

    public ValorMag getTutor() {
        return tutor;
    }

    public void setTutor(ValorMag tutor) {
        this.tutor = tutor;
    }

    public ValorMag getRealidade() {
        return realidade;
    }

    public void setRealidade(ValorMag realidade) {
        this.realidade = realidade;
    }

    public ValorMag getIrrealidade() {
        return irrealidade;
    }

    public void setIrrealidade(ValorMag irrealidade) {
        this.irrealidade = irrealidade;
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
