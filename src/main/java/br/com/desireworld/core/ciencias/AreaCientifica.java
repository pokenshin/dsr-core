package br.com.desireworld.core.ciencias;

public class AreaCientifica {
    private int id;
    private String nome;
    private Ciencia ciencia;

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

    public AreaCientifica(int id, String nome, Ciencia ciencia) {
        this.id = id;
        this.nome = nome;
        this.ciencia = ciencia;
    }
}
