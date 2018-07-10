package br.com.desireworld.core.ser.atributos;

public class Atributos {
    private Forca forca;
    private Materia materia;
    private Destreza destreza;
    private Intelecto intelecto;
    private Criatividade criatividade;
    private Existencia existencia;
    private Ideia ideia;

    public Atributos(Forca forca, Materia materia, Destreza destreza, Intelecto intelecto, Criatividade criatividade, Existencia existencia, Ideia ideia) {
        this.forca = forca;
        this.materia = materia;
        this.destreza = destreza;
        this.intelecto = intelecto;
        this.criatividade = criatividade;
        this.existencia = existencia;
        this.ideia = ideia;
    }

    public Forca getForca() {
        return forca;
    }

    public void setForca(Forca forca) {
        this.forca = forca;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Destreza getDestreza() {
        return destreza;
    }

    public void setDestreza(Destreza destreza) {
        this.destreza = destreza;
    }

    public Intelecto getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(Intelecto intelecto) {
        this.intelecto = intelecto;
    }

    public Criatividade getCriatividade() {
        return criatividade;
    }

    public void setCriatividade(Criatividade criatividade) {
        this.criatividade = criatividade;
    }

    public Existencia getExistencia() {
        return existencia;
    }

    public void setExistencia(Existencia existencia) {
        this.existencia = existencia;
    }

    public Ideia getIdeia() {
        return ideia;
    }

    public void setIdeia(Ideia ideia) {
        this.ideia = ideia;
    }
}
