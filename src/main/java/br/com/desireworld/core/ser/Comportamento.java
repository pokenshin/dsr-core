package br.com.desireworld.core.ser;

public class Comportamento {
    private int honra;
    private int moral;
    private int personalidade;
    private int apresentacao;
    private int percepcao;
    private int concepcao;

    public Comportamento(int honra, int moral, int personalidade, int apresentacao, int percepcao, int concepcao) {
        this.honra = honra;
        this.moral = moral;
        this.personalidade = personalidade;
        this.apresentacao = apresentacao;
        this.percepcao = percepcao;
        this.concepcao = concepcao;
    }

    public int getHonra() {
        return honra;
    }

    public void setHonra(int honra) {
        this.honra = honra;
    }

    public int getMoral() {
        return moral;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }

    public int getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(int personalidade) {
        this.personalidade = personalidade;
    }

    public int getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(int apresentacao) {
        this.apresentacao = apresentacao;
    }

    public int getPercepcao() {
        return percepcao;
    }

    public void setPercepcao(int percepcao) {
        this.percepcao = percepcao;
    }

    public int getConcepcao() {
        return concepcao;
    }

    public void setConcepcao(int concepcao) {
        this.concepcao = concepcao;
    }
}
