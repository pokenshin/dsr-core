package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Criatividade extends Atributo {

    private ValorMag singularidade;
    private ValorMag invencao;
    private ValorMag tutor;
    private ValorMag realidade;
    private ValorMag irrealidade;
    private ValorMag bonusMP;
    private ValorMag bonusCP;

    public Criatividade(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao, ValorMag singularidade, ValorMag invencao, ValorMag tutor, ValorMag realidade, ValorMag irrealidade, ValorMag bonusMP, ValorMag bonusCP) {
        super(classe, nivel, pontos, porcentagem, evolucao);
        this.singularidade = singularidade;
        this.invencao = invencao;
        this.tutor = tutor;
        this.realidade = realidade;
        this.irrealidade = irrealidade;
        this.bonusMP = bonusMP;
        this.bonusCP = bonusCP;
    }

    public Criatividade() {
        super();
        this.singularidade = new ValorMag();
        this.invencao = new ValorMag();
        this.tutor = new ValorMag();
        this.realidade = new ValorMag();
        this.irrealidade = new ValorMag();
        this.bonusMP = new ValorMag();
        this.bonusCP = new ValorMag();
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

    public ValorMag getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(ValorMag bonusCP) {
        this.bonusCP = bonusCP;
    }
}
