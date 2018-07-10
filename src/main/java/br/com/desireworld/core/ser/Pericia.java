package br.com.desireworld.core.ser;

import br.com.desireworld.core.ciencias.Ciencia;

public class Pericia {
    private int id;
    private String nome;
    private Ciencia ciencia;
    private String caracteristicas;

    public Pericia(int id, String nome, Ciencia ciencia, String caracteristicas) {
        this.id = id;
        this.nome = nome;
        this.ciencia = ciencia;
        this.caracteristicas = caracteristicas;
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

    public Ciencia getCiencia() {
        return ciencia;
    }

    public void setCiencia(Ciencia ciencia) {
        this.ciencia = ciencia;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
