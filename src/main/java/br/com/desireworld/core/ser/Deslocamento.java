package br.com.desireworld.core.ser;

import br.com.desireworld.core.ValorMag;

public class Deslocamento {
    private ValorMag valor;
    private String tipo;
    private String unidade;

    public Deslocamento(ValorMag valor, String tipo) {
        this.valor = valor;
        this.tipo = tipo;
        this.unidade = "km/h";
    }

    public String toString(){
        return this.valor.toString() + " " + this.unidade;
    }

    public ValorMag getValor() {
        return valor;
    }

    public void setValor(ValorMag valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
