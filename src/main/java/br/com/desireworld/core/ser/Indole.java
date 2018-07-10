package br.com.desireworld.core.ser;

public class Indole {
    private int id;
    private String nome;
    private Carisma carisma;
    private Destino destino;

    public Indole(int id, String nome, Carisma carisma, Destino destino) {
        this.id = id;
        this.nome = nome;
        this.carisma = carisma;
        this.destino = destino;
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

    public Carisma getCarisma() {
        return carisma;
    }

    public void setCarisma(Carisma carisma) {
        this.carisma = carisma;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}
