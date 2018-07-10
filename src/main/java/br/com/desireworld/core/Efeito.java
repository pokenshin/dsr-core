package br.com.desireworld.core;

import br.com.desireworld.core.alvos.Alvo;

public class Efeito {
    private String tipo;
    private String descricao;
    private Duracao duracao;
    private ValorMag valor;
    private Energia energia;
    private Alvo tipoAlvo;

    public Efeito(String tipo, String descricao, Duracao duracao, ValorMag valor, Energia energia, Alvo tipoAlvo) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.duracao = duracao;
        this.valor = valor;
        this.energia = energia;
        this.tipoAlvo = tipoAlvo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Duracao getDuracao() {
        return duracao;
    }

    public void setDuracao(Duracao duracao) {
        this.duracao = duracao;
    }

    public ValorMag getValor() {
        return valor;
    }

    public void setValor(ValorMag valor) {
        this.valor = valor;
    }

    public Energia getEnergia() {
        return energia;
    }

    public void setEnergia(Energia energia) {
        this.energia = energia;
    }

    public Alvo getTipoAlvo() {
        return tipoAlvo;
    }

    public void setTipoAlvo(Alvo tipoAlvo) {
        this.tipoAlvo = tipoAlvo;
    }
}
