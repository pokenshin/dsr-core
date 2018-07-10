package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public class Intelecto {
    private ValorMag concentracao;
    private ValorMag visualizacao;
    private ValorMag aprendizagem;
    private ValorMag senso;
    private ValorMag eidos;
    private int bonusCP;

    public Intelecto(ValorMag concentracao, ValorMag visualizacao, ValorMag aprendizagem, ValorMag senso, ValorMag eidos, int bonusCP) {
        this.concentracao = concentracao;
        this.visualizacao = visualizacao;
        this.aprendizagem = aprendizagem;
        this.senso = senso;
        this.eidos = eidos;
        this.bonusCP = bonusCP;
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

    public int getBonusCP() {
        return bonusCP;
    }

    public void setBonusCP(int bonusCP) {
        this.bonusCP = bonusCP;
    }
}
