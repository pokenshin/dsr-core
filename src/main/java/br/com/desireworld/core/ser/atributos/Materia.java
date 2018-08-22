package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Materia extends Atributo {
    private ValorMag concentracao;
    private ValorMag visualizacao;
    private ValorMag aprendizagem;
    private ValorMag senso;
    private ValorMag eidos;
    private ValorMag bonusCP;
    private ValorMag bonusHP;

    public ValorMag getBonusHP() {
        return bonusHP;
    }

    public void setBonusHP(ValorMag bonusHP) {
        this.bonusHP = bonusHP;
    }

    public Materia(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao, ValorMag concentracao, ValorMag visualizacao, ValorMag aprendizagem, ValorMag senso, ValorMag eidos, ValorMag bonusCP, ValorMag bonusHP) {
        super(classe, nivel, pontos, porcentagem, evolucao);
        this.concentracao = concentracao;
        this.visualizacao = visualizacao;
        this.aprendizagem = aprendizagem;
        this.senso = senso;
        this.eidos = eidos;
        this.bonusCP = bonusCP;
        this.bonusHP = bonusHP;
    }

    public Materia() {
        super();
        this.concentracao = new ValorMag();
        this.visualizacao = new ValorMag();
        this.aprendizagem = new ValorMag();
        this.senso = new ValorMag();
        this.eidos = new ValorMag();
        this.bonusCP = new ValorMag();
        this.bonusHP = new ValorMag();
    }

    public ValorMag getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(ValorMag concentracao) {
        this.concentracao = concentracao;
    }

    public ValorMag getVisualizacao() {
        return visualizacao;
    }

    public void setVisualizacao(ValorMag visualizacao) {
        this.visualizacao = visualizacao;
    }

    public ValorMag getAprendizagem() {
        return aprendizagem;
    }

    public void setAprendizagem(ValorMag aprendizagem) {
        this.aprendizagem = aprendizagem;
    }

    public ValorMag getSenso() {
        return senso;
    }

    public void setSenso(ValorMag senso) {
        this.senso = senso;
    }

    public ValorMag getEidos() {
        return eidos;
    }

    public void setEidos(ValorMag eidos) {
        this.eidos = eidos;
    }

    public ValorMag getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(ValorMag bonusCP) {
        this.bonusCP = bonusCP;
    }
}
