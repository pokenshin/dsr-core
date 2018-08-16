package br.com.desireworld.core;

import br.com.desireworld.core.ciencias.Elemento;
import br.com.desireworld.core.itens.Equipamento;
import br.com.desireworld.core.itens.Item;
import br.com.desireworld.core.ser.*;
import br.com.desireworld.core.ser.acoes.Habilidade;
import br.com.desireworld.core.ser.acoes.Tecnica;
import br.com.desireworld.core.ser.atributos.Atributos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ser {
    private Identidade identidade;
    private Atributos atributos;
    private List<Energia> energias;
    private int especial;
    private List<Deslocamento> deslocamentos;
    private Subatributos subatributos;
    private Cerne cerne;
    private List<Pericia> pericias;
    private List<Habilidade> fugacidade;
    private List<Habilidade> habilidades;
    private List<Habilidade> arcanidades;
    private List<Tecnica> tecnicas;
    private Resposta resposta;
    private int forcaVontade;
    private int ira;
    private int poderMaximo;
    private List<Modificador> dons;
    private List<Modificador> defeitos;
    private List<String> estimulos;
    private List<Elemento> elementos;
    private Experiencia experiencia;
    private List<Equipamento> itensEquipados;
    private List<Item> posses;
    private Elo elo;
    private List<Modificador> modificadoresAtivos;

    public Ser() {
        this.identidade = new Identidade();
        this.atributos = new Atributos();
        this.energias = new ArrayList<>();
        this.especial = 0;
        this.deslocamentos = new ArrayList<>();
        this.subatributos = new Subatributos();
        this.cerne = new Cerne();
        this.pericias = new ArrayList<>();
        this.fugacidade = new ArrayList<>();
        this.habilidades = new ArrayList<>();
        this.arcanidades = new ArrayList<>();
        this.tecnicas = new ArrayList<>();
        this.resposta = new Resposta();
        this.forcaVontade = 0;
        this.ira = 0;
        this.poderMaximo = 0;
        this.estimulos = new ArrayList<>();
        this.elementos = new ArrayList<>();
        this.experiencia = new Experiencia();
        this.itensEquipados = new ArrayList<>();
        this.posses = new ArrayList<>();
        this.elo = new Elo();
    }

    public List<Modificador> getDons() {
        return dons;
    }

    public void setDons(List<Modificador> dons) {
        this.dons = dons;
    }

    public List<Modificador> getDefeitos() {
        return defeitos;
    }

    public void setDefeitos(List<Modificador> defeitos) {
        this.defeitos = defeitos;
    }

    public List<Modificador> getModificadoresAtivos() {
        return modificadoresAtivos;
    }

    public void setModificadoresAtivos(List<Modificador> modificadoresAtivos) {
        this.modificadoresAtivos = modificadoresAtivos;
    }

    public Ser(Identidade identidade, Atributos atributos, List<Energia> energias, int especial, List<Deslocamento> deslocamentos, Subatributos subatributos, Cerne cerne, List<Pericia> pericias, List<Habilidade> fugacidade, List<Habilidade> habilidades, List<Habilidade> arcanidades, List<Tecnica> tecnicas, Resposta resposta, int forcaVontade, int ira, int poderMaximo, List<String> estimulos, List<Elemento> elementos, Experiencia experiencia, List<Equipamento> itensEquipados, List<Item> posses, Elo elo) {
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

    public Ser(Identidade identidade, Atributos atributos, List<Pericia> pericias, List<Habilidade> habilidades, List<Habilidade> arcanidades, List<Tecnica> tecnicas, List<Modificador> dons, List<Modificador> defeitos, List<Equipamento> itensEquipados, List<Item> posses) {
        this.identidade = identidade;
        this.atributos = atributos;
        this.pericias = pericias;
        this.habilidades = habilidades;
        this.arcanidades = arcanidades;
        this.tecnicas = tecnicas;
        this.dons = dons;
        this.defeitos = defeitos;
        this.itensEquipados = itensEquipados;
        this.posses = posses;
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

    public List<Energia> getEnergias() {
        return energias;
    }

    public void setEnergias(List<Energia> energias) {
        this.energias = energias;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public List<Deslocamento> getDeslocamentos() {
        return deslocamentos;
    }

    public Deslocamento getDeslocamento(String tipo){
        if (this.deslocamentos.size() > 0){
            return deslocamentos.stream().filter(d -> d.getTipo() == tipo).collect(Collectors.toList()).get(0);
        } else return null;
    }

    public void setDeslocamentos(List<Deslocamento> deslocamentos) {
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

    public List<Pericia> getPericias() {
        return pericias;
    }

    public void setPericias(List<Pericia> pericias) {
        this.pericias = pericias;
    }

    public List<Habilidade> getFugacidade() {
        return fugacidade;
    }

    public void setFugacidade(List<Habilidade> fugacidade) {
        this.fugacidade = fugacidade;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Habilidade> getArcanidades() {
        return arcanidades;
    }

    public void setArcanidades(List<Habilidade> arcanidades) {
        this.arcanidades = arcanidades;
    }

    public List<Tecnica> getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(List<Tecnica> tecnicas) {
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

    public List<String> getEstimulos() {
        return estimulos;
    }

    public void setEstimulos(List<String> estimulos) {
        this.estimulos = estimulos;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public List<Equipamento> getItensEquipados() {
        return itensEquipados;
    }

    public void setItensEquipados(List<Equipamento> itensEquipados) {
        this.itensEquipados = itensEquipados;
    }

    public List<Item> getPosses() {
        return posses;
    }

    public void setPosses(List<Item> posses) {
        this.posses = posses;
    }

    public Elo getElo() {
        return elo;
    }

    public void setElo(Elo elo) {
        this.elo = elo;
    }

    public void calcular(){
        this.calculaEspecial();
//        this.calculaDeslocamentos();
//        this.criaListaPericias();
//        this.criaListaHabilidades();
//        this.criaListaArcnidades();
//        this.calculaCansaco();
//        this.calculaComportamento();
//        this.calculaFe();
//        this.calculaKarma();
//        this.calculaSubatributos();
//        this.calculaCerne();
//        this.calculaIra();
//        this.calculaForcaVontade();
//        this.calculaPoderMaximo();
//        this.calculaResposta();
//        this.calculaFugacidade();
//        this.calculaModificadoresAtivos();
//        this.calculaMagnitude();
//        this.calculaEnergias();
//        this.calculaExperiencia();
    }

    public void calculaEspecial() {

        List<Integer> especiais = this.identidade.getEspecies().stream()
                .map(Especie::getEspecial)
                .collect(Collectors.toList());
        this.especial = especiais.stream()
                .max(Integer::compare)
                .get();
    }

//  DeslocamentoSolo = Minimo da Especie * (FatorDex + FatorFor) / 2
//  DeslocamentoMar = (Minimo da Especie * (FatorDex + FatorFor)) / 4
//  DeslocamentoAr = (Minimo da Especie * (FatorDex + FatorFor)) / 3
//  DeslocamentoEspaco = Minimo da Especie * (FatorDex + FatorFor)
    public void calculaDeslocamentos() {
        int especieDexMin = this.identidade.getEspecies().get(0).getAtributos().getMin().getDestreza().getPontos();
        int especieForMin = this.identidade.getEspecies().get(0).getAtributos().getMin().getForca().getPontos();
        int serDex = this.atributos.getDestreza().getPontos();
        int serFor = this.atributos.getForca().getPontos();
        double fatorTotal = ((10 * serDex / especieDexMin) + (10 * serFor / especieForMin)) / 2;

        this.calculaDeslocamentoSolo(fatorTotal);
        this.calculaDeslocamentoMar();
        this.calculaDeslocamentoAr();
        this.calculaDeslocamentoEspaco();
    }

//  DeslocamentoEspaco = Minimo da Especie * (FatorDex + FatorFor)
    private void calculaDeslocamentoEspaco() {

    }

//  DeslocamentoAr = (Minimo da Especie * (FatorDex + FatorFor)) / 3
    private void calculaDeslocamentoAr() {

    }

//  DeslocamentoMar = (Minimo da Especie * (FatorDex + FatorFor)) / 4
    private void calculaDeslocamentoMar() {
    }

//  DeslocamentoSolo = Minimo da Especie * (FatorDex + FatorFor) / 2
    private void calculaDeslocamentoSolo(double fatorTotal) {
        Deslocamento deslocamento = new Deslocamento(new ValorMag(), "Solo");
        List<Deslocamento> desSoloEspecie = this.identidade.getEspecies().get(0).getDeslocamentosMedios().stream()
                .filter(d -> d.getTipo() == "Solo")
                .collect(Collectors.toList());
        if (desSoloEspecie.size() > 0){
            deslocamento.setValor(desSoloEspecie.get(0).getValor().multiply(new ValorMag(fatorTotal)));
            deslocamento.setValor(deslocamento.getValor().divide(2));
        }
        this.deslocamentos.add(deslocamento);
    }


}
