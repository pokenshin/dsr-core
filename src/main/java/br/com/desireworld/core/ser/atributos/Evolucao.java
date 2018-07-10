package br.com.desireworld.core.ser.atributos;

public class Evolucao {
    private int pontosAtuais;
    private int multiplicador;
    private boolean chakraAberto;
    private String chakraNome;
    private int chakraMag;

    public Evolucao(int pontosAtuais, int multiplicador, boolean chakraAberto, String chakraNome, int chakraMag) {
        this.pontosAtuais = pontosAtuais;
        this.multiplicador = multiplicador;
        this.chakraAberto = chakraAberto;
        this.chakraNome = chakraNome;
        this.chakraMag = chakraMag;
    }

    public int getPontosAtuais() {
        return pontosAtuais;
    }

    public void setPontosAtuais(int pontosAtuais) {
        this.pontosAtuais = pontosAtuais;
    }

    public int getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(int multiplicador) {
        this.multiplicador = multiplicador;
    }

    public boolean isChakraAberto() {
        return chakraAberto;
    }

    public void setChakraAberto(boolean chakraAberto) {
        this.chakraAberto = chakraAberto;
    }

    public String getChakraNome() {
        return chakraNome;
    }

    public void setChakraNome(String chakraNome) {
        this.chakraNome = chakraNome;
    }

    public int getChakraMag() {
        return chakraMag;
    }

    public void setChakraMag(int chakraMag) {
        this.chakraMag = chakraMag;
    }
}
