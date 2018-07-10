package br.com.desireworld.core.ser;

public class Rei {
    private int id;
    private String nome;
    private int magnitude;
    private String origem;
    private String cor;

    public Rei(int id, String nome, int magnitude, String origem, String cor) {
        this.id = id;
        this.nome = nome;
        this.magnitude = magnitude;
        this.origem = origem;
        this.cor = cor;
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

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
