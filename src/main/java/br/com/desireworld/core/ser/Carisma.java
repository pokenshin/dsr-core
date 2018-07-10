package br.com.desireworld.core.ser;

public class Carisma {
    private int negativo;
    private int neutro;
    private int positivo;

    public Carisma(int negativo, int neutro, int positivo) {
        this.negativo = negativo;
        this.neutro = neutro;
        this.positivo = positivo;
    }

    public int getNegativo() {
        return negativo;
    }

    public void setNegativo(int negativo) {
        this.negativo = negativo;
    }

    public int getNeutro() {
        return neutro;
    }

    public void setNeutro(int neutro) {
        this.neutro = neutro;
    }

    public int getPositivo() {
        return positivo;
    }

    public void setPositivo(int positivo) {
        this.positivo = positivo;
    }
}
