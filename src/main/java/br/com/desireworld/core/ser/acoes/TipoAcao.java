package br.com.desireworld.core.ser.acoes;

public class TipoAcao {
    private int id;
    private String nome;

    public TipoAcao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public TipoAcao() {
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
