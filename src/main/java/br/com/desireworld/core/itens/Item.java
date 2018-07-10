package br.com.desireworld.core.itens;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ValorMag;

public abstract class Item {
    private int id;
    private String nome;
    private int nivel;
    private int magnitude;
    private int raridade;
    private String caracteristicas;
    //TODO: Modificadores
    private ValorMag massa;
    private int essencia;
    private Energia energia;
    private int valor;
    private int tipo;
    private ValorMag comprimento;
    private ValorMag largura;
    private ValorMag peso;

    public Item(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.magnitude = magnitude;
        this.raridade = raridade;
        this.caracteristicas = caracteristicas;
        this.massa = massa;
        this.essencia = essencia;
        this.energia = energia;
        this.valor = valor;
        this.tipo = tipo;
        this.comprimento = comprimento;
        this.largura = largura;
        this.peso = peso;
    }

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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public int getRaridade() {
        return raridade;
    }

    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public ValorMag getMassa() {
        return massa;
    }

    public void setMassa(ValorMag massa) {
        this.massa = massa;
    }

    public int getEssencia() {
        return essencia;
    }

    public void setEssencia(int essencia) {
        this.essencia = essencia;
    }

    public Energia getEnergia() {
        return energia;
    }

    public void setEnergia(Energia energia) {
        this.energia = energia;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public ValorMag getComprimento() {
        return comprimento;
    }

    public void setComprimento(ValorMag comprimento) {
        this.comprimento = comprimento;
    }

    public ValorMag getLargura() {
        return largura;
    }

    public void setLargura(ValorMag largura) {
        this.largura = largura;
    }

    public ValorMag getPeso() {
        return peso;
    }

    public void setPeso(ValorMag peso) {
        this.peso = peso;
    }
}
