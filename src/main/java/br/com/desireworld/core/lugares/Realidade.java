package br.com.desireworld.core.lugares;

public class Realidade {
    private int id;
    private String nome;

    public Realidade(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Realidade() {
        this.id = 0;
        this.nome = "";
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
}
