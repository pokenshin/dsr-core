package br.com.desireworld.core;

public class Duracao {
    private String tipo;
    private ValorMag valor;
    private String unidade;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ValorMag getValor() {
        return valor;
    }

    public void setValor(ValorMag valor) {
        this.valor = valor;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String toString(){
        if (this.valor.toString() != "0m0" && this.unidade != ""){
            return "Durante " + this.valor.toString() + " " + this.unidade;
        } else{
            return this.tipo;
        }
    }
}
