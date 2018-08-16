package br.com.desireworld.core.ser;

import br.com.desireworld.core.lugares.Origem;

import java.util.ArrayList;
import java.util.List;

public class Identidade {
    private String nome;
    private Origem origem;
    private int corpo;
    private List<Especie> especies;
    private List<Classe> classes;
    private Indole natureza;
    private Indole indole;
    private int magnitude;
    private List<Rei> reis;
    private int ki;
    private int nivel;
    private int tempo;

    public Identidade(String nome, Origem origem, int corpo, List<Especie> especies, List<Classe> classes, Indole natureza, Indole indole, int magnitude, List<Rei> reis, int ki, int nivel, int tempo) {
        this.nome = nome;
        this.origem = origem;
        this.corpo = corpo;
        this.especies = especies;
        this.classes = classes;
        this.natureza = natureza;
        this.indole = indole;
        this.magnitude = magnitude;
        this.reis = reis;
        this.ki = ki;
        this.nivel = nivel;
        this.tempo = tempo;
    }

    public Identidade() {
        this.nome = "";
        this.origem = new Origem();
        this.corpo = 0;
        this.especies = new ArrayList<>();
        this.classes = new ArrayList<>();
        this.natureza = new Indole();
        this.indole = new Indole();
        this.magnitude = 0;
        this.reis = new ArrayList<>();
        this.ki = 0;
        this.nivel = 0;
        this.tempo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public int getCorpo() {
        return corpo;
    }

    public void setCorpo(int corpo) {
        this.corpo = corpo;
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(List<Especie> especies) {
        this.especies = especies;
    }

    public List<Classe> getClasses() {
        return classes;
    }

    public void setClasses(List<Classe> classes) {
        this.classes = classes;
    }

    public Indole getNatureza() {
        return natureza;
    }

    public void setNatureza(Indole natureza) {
        this.natureza = natureza;
    }

    public Indole getIndole() {
        return indole;
    }

    public void setIndole(Indole indole) {
        this.indole = indole;
    }

    public int getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    public List<Rei> getReis() {
        return reis;
    }

    public void setReis(List<Rei> reis) {
        this.reis = reis;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
}
