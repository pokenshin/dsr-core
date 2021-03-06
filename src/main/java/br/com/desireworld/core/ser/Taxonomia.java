package br.com.desireworld.core.ser;

import java.util.ArrayList;
import java.util.List;

public class Taxonomia {
    private int id;
    private String reino;
    private String filo;
    private String classe;
    private String ordem;
    private String familia;
    private String genero;
    private String nomeCientifico;
    private String nomePopular;
    private List<String> subClassificacoes;

    public Taxonomia(int id, String reino, String filo, String classe, String ordem, String familia, String genero, String nomeCientifico, String nomePopular, List<String> subClassificacoes) {
        this.id = id;
        this.reino = reino;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.familia = familia;
        this.genero = genero;
        this.nomeCientifico = nomeCientifico;
        this.nomePopular = nomePopular;
        this.subClassificacoes = subClassificacoes;
    }

    public Taxonomia() {
        this.id = 0;
        this.reino = "";
        this.filo = "";
        this.classe = "";
        this.ordem = "";
        this.familia = "";
        this.genero = "";
        this.nomeCientifico = "";
        this.nomePopular = "";
        this.subClassificacoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getFilo() {
        return filo;
    }

    public void setFilo(String filo) {
        this.filo = filo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getOrdem() {
        return ordem;
    }

    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeCientifico() {
        return nomeCientifico;
    }

    public void setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public List<String> getSubClassificacoes() {
        return subClassificacoes;
    }

    public void setSubClassificacoes(List<String> subClassificacoes) {
        this.subClassificacoes = subClassificacoes;
    }
}
