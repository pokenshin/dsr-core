package br.com.desireworld.core;

import br.com.desireworld.core.ciencias.Elemento;
import br.com.desireworld.core.itens.Equipamento;
import br.com.desireworld.core.itens.Item;
import br.com.desireworld.core.ser.*;
import br.com.desireworld.core.ser.acoes.Arcanidade;
import br.com.desireworld.core.ser.acoes.Habilidade;
import br.com.desireworld.core.ser.acoes.Tecnica;
import br.com.desireworld.core.ser.atributos.Atributos;

public class Ser {
    private Identidade identidade;
    private Atributos atributos;
    private Energia[] energias;
    private int especial;
    private Deslocamento[] deslocamentos;
    private Subatributos subatributos;
    private Cerne cerne;
    private Pericia[] pericias;
    private Habilidade[] fugacidade;
    private Habilidade[] habilidades;
    private Arcanidade[] arcanidades;
    private Tecnica[] tecnicas;
    private Resposta resposta;
    private int forcaVontade;
    private int ira;
    private int poderMaximo;
    //TODO: Dons (Modificadores)
    //TODO: Defeitos (Modificadores)
    private String[] estimulos;
    private Elemento[] elementos;
    private Experiencia experiencia;
    private Equipamento[] itensEquipados;
    private Item[] posses;
    private Elo elo;
    //TODO: Modificadores ativos


    public Ser(Identidade identidade, Atributos atributos, Energia[] energias, int especial, Deslocamento[] deslocamentos, Subatributos subatributos, Cerne cerne, Pericia[] pericias, Habilidade[] fugacidade, Habilidade[] habilidades, Arcanidade[] arcanidades, Tecnica[] tecnicas, Resposta resposta, int forcaVontade, int ira, int poderMaximo, String[] estimulos, Elemento[] elementos, Experiencia experiencia, Equipamento[] itensEquipados, Item[] posses, Elo elo) {
        this.identidade = identidade;
        this.atributos = atributos;
        this.energias = energias;
        this.especial = especial;
        this.deslocamentos = deslocamentos;
        this.subatributos = subatributos;
        this.cerne = cerne;
        this.pericias = pericias;
        this.fugacidade = fugacidade;
        this.habilidades = habilidades;
        this.arcanidades = arcanidades;
        this.tecnicas = tecnicas;
        this.resposta = resposta;
        this.forcaVontade = forcaVontade;
        this.ira = ira;
        this.poderMaximo = poderMaximo;
        this.estimulos = estimulos;
        this.elementos = elementos;
        this.experiencia = experiencia;
        this.itensEquipados = itensEquipados;
        this.posses = posses;
        this.elo = elo;
    }

    public Identidade getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Identidade identidade) {
        this.identidade = identidade;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Energia[] getEnergias() {
        return energias;
    }

    public void setEnergias(Energia[] energias) {
        this.energias = energias;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public Deslocamento[] getDeslocamentos() {
        return deslocamentos;
    }

    public void setDeslocamentos(Deslocamento[] deslocamentos) {
        this.deslocamentos = deslocamentos;
    }

    public Subatributos getSubatributos() {
        return subatributos;
    }

    public void setSubatributos(Subatributos subatributos) {
        this.subatributos = subatributos;
    }

    public Cerne getCerne() {
        return cerne;
    }

    public void setCerne(Cerne cerne) {
        this.cerne = cerne;
    }

    public Pericia[] getPericias() {
        return pericias;
    }

    public void setPericias(Pericia[] pericias) {
        this.pericias = pericias;
    }

    public Habilidade[] getFugacidade() {
        return fugacidade;
    }

    public void setFugacidade(Habilidade[] fugacidade) {
        this.fugacidade = fugacidade;
    }

    public Habilidade[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidade[] habilidades) {
        this.habilidades = habilidades;
    }

    public Arcanidade[] getArcanidades() {
        return arcanidades;
    }

    public void setArcanidades(Arcanidade[] arcanidades) {
        this.arcanidades = arcanidades;
    }

    public Tecnica[] getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(Tecnica[] tecnicas) {
        this.tecnicas = tecnicas;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public int getForcaVontade() {
        return forcaVontade;
    }

    public void setForcaVontade(int forcaVontade) {
        this.forcaVontade = forcaVontade;
    }

    public int getIra() {
        return ira;
    }

    public void setIra(int ira) {
        this.ira = ira;
    }

    public int getPoderMaximo() {
        return poderMaximo;
    }

    public void setPoderMaximo(int poderMaximo) {
        this.poderMaximo = poderMaximo;
    }

    public String[] getEstimulos() {
        return estimulos;
    }

    public void setEstimulos(String[] estimulos) {
        this.estimulos = estimulos;
    }

    public Elemento[] getElementos() {
        return elementos;
    }

    public void setElementos(Elemento[] elementos) {
        this.elementos = elementos;
    }

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public Equipamento[] getItensEquipados() {
        return itensEquipados;
    }

    public void setItensEquipados(Equipamento[] itensEquipados) {
        this.itensEquipados = itensEquipados;
    }

    public Item[] getPosses() {
        return posses;
    }

    public void setPosses(Item[] posses) {
        this.posses = posses;
    }

    public Elo getElo() {
        return elo;
    }

    public void setElo(Elo elo) {
        this.elo = elo;
    }
}
