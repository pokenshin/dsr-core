package br.com.desireworld.core.lugares;

public class Origem {
    private int id;
    private String nome;
    private Plano plano;

    public Origem(int id, String nome, Plano plano) {
        this.id = id;
        this.nome = nome;
        this.plano = plano;
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

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
}
