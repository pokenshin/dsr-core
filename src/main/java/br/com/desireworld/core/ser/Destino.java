package br.com.desireworld.core.ser;

public class Destino {
    private int desgraca;
    private int azar;
    private int acaso;
    private int sorte;
    private int milagre;

    public Destino(int desgraca, int azar, int acaso, int sorte, int milagre) {
        this.desgraca = desgraca;
        this.azar = azar;
        this.acaso = acaso;
        this.sorte = sorte;
        this.milagre = milagre;
    }

    public int getDesgraca() {
        return desgraca;
    }

    public void setDesgraca(int desgraca) {
        this.desgraca = desgraca;
    }

    public int getAzar() {
        return azar;
    }

    public void setAzar(int azar) {
        this.azar = azar;
    }

    public int getAcaso() {
        return acaso;
    }

    public void setAcaso(int acaso) {
        this.acaso = acaso;
    }

    public int getSorte() {
        return sorte;
    }

    public void setSorte(int sorte) {
        this.sorte = sorte;
    }

    public int getMilagre() {
        return milagre;
    }

    public void setMilagre(int milagre) {
        this.milagre = milagre;
    }
}
