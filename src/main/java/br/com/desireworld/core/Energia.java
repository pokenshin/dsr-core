package br.com.desireworld.core;

public class Energia {
    private int id;
    private String sigla;
    private String nome;
    private long quantidade;
    private long maximo;

    public Energia(int id, String sigla, String nome, long quantidade, long maximo) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
        this.quantidade = quantidade;
        this.maximo = maximo;
    }

    public Energia(){
        this.id = 0;
        this.sigla = "";
        this.nome = "";
        this.quantidade = 0;
        this.maximo = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(long quantidade) {
        this.quantidade = quantidade;
    }

    public long getMaximo() {
        return maximo;
    }

    public void setMaximo(long maximo) {
        this.maximo = maximo;
    }

    @Override
    public String toString(){
        return this.sigla + ": " + this.quantidade + "/" + this.maximo;
    }
}
