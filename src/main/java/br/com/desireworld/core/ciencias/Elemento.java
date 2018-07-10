package br.com.desireworld.core.ciencias;

import br.com.desireworld.core.ValorMag;

public class Elemento {
    private int id;
    private String nome;
    private ValorMag valorPositivo;
    private ValorMag valorNegativo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ValorMag getValorPositivo() {
        return valorPositivo;
    }

    public void setValorPositivo(ValorMag valorPositivo) {
        this.valorPositivo = valorPositivo;
    }

    public ValorMag getValorNegativo() {
        return valorNegativo;
    }

    public void setValorNegativo(ValorMag valorNegativo) {
        this.valorNegativo = valorNegativo;
    }

    public Elemento(int id, String nome, ValorMag valorPositivo, ValorMag valorNegativo) {
        this.id = id;
        this.nome = nome;
        this.valorPositivo = valorPositivo;
        this.valorNegativo = valorNegativo;
    }
}
