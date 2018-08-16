package br.com.desireworld.core;

public class Modificador {
    private String alvo;
    private char tipo;
    private ValorMag valorMag;
    private int valorInt;
    private double valorDouble;
    private String origem;

    public Modificador(String alvo, char tipo, double valorDouble) {
        this.alvo = alvo;
        this.tipo = tipo;
        this.valorDouble = valorDouble;
    }

    public Modificador(String alvo, char tipo, int valorInt) {
        this.alvo = alvo;
        this.tipo = tipo;
        this.valorInt = valorInt;
    }

    public Modificador(String alvo, char tipo, ValorMag valorMag) {
        this.alvo = alvo;
        this.tipo = tipo;
        this.valorMag = valorMag;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getAlvo() {
        return alvo;
    }

    public void setAlvo(String alvo) {
        this.alvo = alvo;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public ValorMag getValorMag() {
        return valorMag;
    }

    public void setValorMag(ValorMag valorMag) {
        this.valorMag = valorMag;
    }

    public int getValorInt() {
        return valorInt;
    }

    public void setValorInt(int valorInt) {
        this.valorInt = valorInt;
    }

    public double getValorDouble() {
        return valorDouble;
    }

    public void setValorDouble(double valorDouble) {
        this.valorDouble = valorDouble;
    }
}
