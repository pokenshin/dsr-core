package br.com.desireworld.core.lugares;

public class Plano {
    private int id;
    private String nome;
    private Realidade realidade;

    public Plano(int id, String nome, Realidade realidade) {
        this.id = id;
        this.nome = nome;
        this.realidade = realidade;
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

    public Realidade getRealidade() {
        return realidade;
    }

    public void setRealidade(Realidade realidade) {
        this.realidade = realidade;
    }
}
