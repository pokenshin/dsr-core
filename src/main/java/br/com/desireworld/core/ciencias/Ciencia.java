package br.com.desireworld.core.ciencias;

public class Ciencia {
    private int id;
    private String nome;
    private Esfera esfera;

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

    public Esfera getEsfera() {
        return esfera;
    }

    public void setEsfera(Esfera esfera) {
        this.esfera = esfera;
    }

    public Ciencia(int id, String nome, Esfera esfera) {
        this.id = id;
        this.nome = nome;
        this.esfera = esfera;
    }
}
