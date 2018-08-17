package br.com.desireworld.core.ser.acoes;

import br.com.desireworld.core.Efeito;
import br.com.desireworld.core.ciencias.AreaCientifica;
import br.com.desireworld.core.ser.Pericia;

import java.util.ArrayList;
import java.util.List;

public abstract class Acao {
    private int id;
    private String nome;
    private int magnitude;
    private String caracteristicas;
    private TipoAcao tipo;
    private Pericia pericia;
    private AreaCientifica areaCientifica;
    private List<Efeito> efeitos;

    public Acao(int id, String nome, int magnitude, String caracteristicas, TipoAcao tipo, Pericia pericia, AreaCientifica areaCientifica, List<Efeito> efeitos) {
        this.id = id;
        this.nome = nome;
        this.magnitude = magnitude;
        this.caracteristicas = caracteristicas;
        this.tipo = tipo;
        this.pericia = pericia;
        this.areaCientifica = areaCientifica;
        this.efeitos = efeitos;
    }

    public Acao() {
        this.id = 0;
        this.nome = "";
        this.magnitude = 0;
        this.caracteristicas = "";
        this.tipo = new TipoAcao();
        this.pericia = new Pericia();
        this.areaCientifica = new AreaCientifica();
        this.efeitos = new ArrayList<>();
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

    public int getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public TipoAcao getTipo() {
        return tipo;
    }

    public void setTipo(TipoAcao tipo) {
        this.tipo = tipo;
    }

    public Pericia getPericia() {
        return pericia;
    }

    public void setPericia(Pericia pericia) {
        this.pericia = pericia;
    }

    public AreaCientifica getAreaCientifica() {
        return areaCientifica;
    }

    public void setAreaCientifica(AreaCientifica areaCientifica) {
        this.areaCientifica = areaCientifica;
    }

    public List<Efeito> getEfeitos() {
        return efeitos;
    }

    public void setEfeitos(List<Efeito> efeitos) {
        this.efeitos = efeitos;
    }
}
