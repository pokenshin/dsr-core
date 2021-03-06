package br.com.desireworld.core.ser;

import br.com.desireworld.core.ValorMag;

public class Cerne {
    private ValorMag iniciativa;
    private ValorMag acao;
    private ValorMag reacao;
    private int turno;
    private int destria;
    private ValorMag altura;
    private ValorMag largura;
    private ValorMag comprimento;
    private ValorMag carga;
    private ValorMag massa;
    private ValorMag tenacidade;
    private ValorMag essencia;

    public Cerne(ValorMag iniciativa, ValorMag acao, ValorMag reacao, int turno, int destria, ValorMag altura, ValorMag largura, ValorMag comprimento, ValorMag carga, ValorMag massa, ValorMag tenacidade, ValorMag essencia) {
        this.iniciativa = iniciativa;
        this.acao = acao;
        this.reacao = reacao;
        this.turno = turno;
        this.destria = destria;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.carga = carga;
        this.massa = massa;
        this.tenacidade = tenacidade;
        this.essencia = essencia;
    }

    public Cerne() {
        this.iniciativa = new ValorMag();
        this.acao = new ValorMag();
        this.reacao = new ValorMag();
        this.turno = 0;
        this.destria = 0;
        this.altura = new ValorMag();
        this.largura = new ValorMag();
        this.comprimento = new ValorMag();
        this.carga = new ValorMag();
        this.massa = new ValorMag();
        this.tenacidade = new ValorMag();
        this.essencia = new ValorMag();
    }

    public ValorMag getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(ValorMag iniciativa) {
        this.iniciativa = iniciativa;
    }

    public ValorMag getAcao() {
        return acao;
    }

    public void setAcao(ValorMag acao) {
        this.acao = acao;
    }

    public ValorMag getReacao() {
        return reacao;
    }

    public void setReacao(ValorMag reacao) {
        this.reacao = reacao;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getDestria() {
        return destria;
    }

    public void setDestria(int destria) {
        this.destria = destria;
    }

    public ValorMag getAltura() {
        return altura;
    }

    public void setAltura(ValorMag altura) {
        this.altura = altura;
    }

    public ValorMag getLargura() {
        return largura;
    }

    public void setLargura(ValorMag largura) {
        this.largura = largura;
    }

    public ValorMag getComprimento() {
        return comprimento;
    }

    public void setComprimento(ValorMag comprimento) {
        this.comprimento = comprimento;
    }

    public ValorMag getCarga() {
        return carga;
    }

    public void setCarga(ValorMag carga) {
        this.carga = carga;
    }

    public ValorMag getMassa() {
        return massa;
    }

    public void setMassa(ValorMag massa) {
        this.massa = massa;
    }

    public ValorMag getTenacidade() {
        return tenacidade;
    }

    public void setTenacidade(ValorMag tenacidade) {
        this.tenacidade = tenacidade;
    }

    public ValorMag getEssencia() {
        return essencia;
    }

    public void setEssencia(ValorMag essencia) {
        this.essencia = essencia;
    }
}
