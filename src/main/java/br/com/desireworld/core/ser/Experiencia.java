package br.com.desireworld.core.ser;

public class Experiencia {
    private long pontosGraduacao;
    private long pontosEvolucao;
    private long experienciaAtual;

    public Experiencia(long pontosGraduacao, long pontosEvolucao, long experienciaAtual) {
        this.pontosGraduacao = pontosGraduacao;
        this.pontosEvolucao = pontosEvolucao;
        this.experienciaAtual = experienciaAtual;
    }

    public long getPontosGraduacao() {
        return pontosGraduacao;
    }

    public void setPontosGraduacao(long pontosGraduacao) {
        this.pontosGraduacao = pontosGraduacao;
    }

    public long getPontosEvolucao() {
        return pontosEvolucao;
    }

    public void setPontosEvolucao(long pontosEvolucao) {
        this.pontosEvolucao = pontosEvolucao;
    }

    public long getExperienciaAtual() {
        return experienciaAtual;
    }

    public void setExperienciaAtual(long experienciaAtual) {
        this.experienciaAtual = experienciaAtual;
    }
}
