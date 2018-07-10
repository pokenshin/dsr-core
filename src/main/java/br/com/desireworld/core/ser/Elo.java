package br.com.desireworld.core.ser;

public class Elo {
    private int cansacoAtual;
    private int cansacoMax;
    private int genese;
    private int geracao;
    private int fe;
    private int karma;
    private String[] alma;
    private String eloDivino;
    private String trajetoria;
    private String idumentaria;
    private Comportamento comportamento;

    public Elo(int cansacoAtual, int cansacoMax, int genese, int geracao, int fe, int karma, String[] alma, String eloDivino, String trajetoria, String idumentaria, Comportamento comportamento) {
        this.cansacoAtual = cansacoAtual;
        this.cansacoMax = cansacoMax;
        this.genese = genese;
        this.geracao = geracao;
        this.fe = fe;
        this.karma = karma;
        this.alma = alma;
        this.eloDivino = eloDivino;
        this.trajetoria = trajetoria;
        this.idumentaria = idumentaria;
        this.comportamento = comportamento;
    }

    public int getCansacoAtual() {
        return cansacoAtual;
    }

    public void setCansacoAtual(int cansacoAtual) {
        this.cansacoAtual = cansacoAtual;
    }

    public int getCansacoMax() {
        return cansacoMax;
    }

    public void setCansacoMax(int cansacoMax) {
        this.cansacoMax = cansacoMax;
    }

    public int getGenese() {
        return genese;
    }

    public void setGenese(int genese) {
        this.genese = genese;
    }

    public int getGeracao() {
        return geracao;
    }

    public void setGeracao(int geracao) {
        this.geracao = geracao;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public String[] getAlma() {
        return alma;
    }

    public void setAlma(String[] alma) {
        this.alma = alma;
    }

    public String getEloDivino() {
        return eloDivino;
    }

    public void setEloDivino(String eloDivino) {
        this.eloDivino = eloDivino;
    }

    public String getTrajetoria() {
        return trajetoria;
    }

    public void setTrajetoria(String trajetoria) {
        this.trajetoria = trajetoria;
    }

    public String getIdumentaria() {
        return idumentaria;
    }

    public void setIdumentaria(String idumentaria) {
        this.idumentaria = idumentaria;
    }

    public Comportamento getComportamento() {
        return comportamento;
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }
}
