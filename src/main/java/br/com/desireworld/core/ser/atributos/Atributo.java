package br.com.desireworld.core.ser.atributos;

import br.com.desireworld.core.ValorMag;

public abstract class Atributo {
    private String classe;
    private int nivel;
    private int pontos;
    private ValorMag porcentagem;
    private Evolucao evolucao;

    public Atributo(String classe, int nivel, int pontos, ValorMag porcentagem, Evolucao evolucao) {
        this.classe = classe;
        this.nivel = nivel;
        this.pontos = pontos;
        this.porcentagem = porcentagem;
        this.evolucao = evolucao;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public ValorMag getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(ValorMag porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Evolucao getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(Evolucao evolucao) {
        this.evolucao = evolucao;
    }
}
