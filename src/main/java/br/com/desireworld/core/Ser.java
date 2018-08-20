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
        this.calculaDeslocamentos();
        this.criaListaPericias();
        this.criaListaHabilidades();
//        this.criaListaArcnidades();
        this.calculaCansaco();
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

    //Máximo de cansaço do ser
    public void calculaCansaco() {
        List<Integer> cansacoMax = this.identidade.getEspecies().stream()
                .map(e -> e.getCansaco().getMax())
                .collect(Collectors.toList());

        this.elo.setCansacoMax(cansacoMax.stream()
                .mapToInt(c -> c)
                .max()
                .getAsInt());

    }

    // Pega habilidades da Espécie
    public void criaListaHabilidades() {
        List<Habilidade> habilidades = new ArrayList<>();

        for(Especie esp: this.identidade.getEspecies()){
            for (Habilidade hab: esp.getHabilidades()){
                if (habilidades.stream().filter(h -> h.getId() == hab.getId()).collect(Collectors.toList()).size() == 0){
                    this.getHabilidades().add(hab);
                }
            }
        }
    }

    // Pega perícias da Classe e da Espécie
    public void criaListaPericias() {
        List<Pericia> pericias = new ArrayList<>();

        for(Classe cla: this.identidade.getClasses()){
            for (Pericia per: cla.getPericias()){
                //Só adiciona perícia se não houver nenhuma perícia com o mesmo ID
                if (pericias.stream().filter(p -> p.getId() == per.getId()).collect(Collectors.toList()).size() == 0){
                    this.getPericias().add(per);
                }
            }
        }

        for(Especie esp: this.identidade.getEspecies()){
            for (Pericia per: esp.getPericias()){
                if (pericias.stream().filter(p -> p.getId() == per.getId()).collect(Collectors.toList()).size() == 0){
                    this.getPericias().add(per);
                }
            }
        }
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
        //Cria deslocamentos do ser
        List<Deslocamento> desSer = new ArrayList<>();
        //Calcula fatorTotal = (FatorDex + FatorFor) / 2
        int especieDexMin = this.identidade.getEspecies().get(0).getAtributos().getMin().getDestreza().getPontos();
        int especieForMin = this.identidade.getEspecies().get(0).getAtributos().getMin().getForca().getPontos();
        int serDex = this.atributos.getDestreza().getPontos();
        int serFor = this.atributos.getForca().getPontos();
        double fatorTotal = ((10 * serDex / especieDexMin) + (10 * serFor / especieForMin)) / 2;

        //Cria lista de Deslocamentos baseado nas espécies
        List<Deslocamento> deslocamentosEspecie = new ArrayList<>();

        for(Especie esp: this.identidade.getEspecies() ){
            for(Deslocamento des: esp.getDeslocamentosMedios()){
                deslocamentosEspecie.add(des);
            }
        }

        //Cria listas de deslocamento especificos da espécie
        List<Deslocamento> desSolo = deslocamentosEspecie.stream()
                .filter(d -> d.getTipo() == "Solo")
                .collect(Collectors.toList());
        List<Deslocamento> desMar = deslocamentosEspecie.stream()
                .filter(d -> d.getTipo() == "Mar")
                .collect(Collectors.toList());
        List<Deslocamento> desAr = deslocamentosEspecie.stream()
                .filter(d -> d.getTipo() == "Ar")
                .collect(Collectors.toList());
        List<Deslocamento> desEspaco = deslocamentosEspecie.stream()
                .filter(d -> d.getTipo() == "Espaço")
                .collect(Collectors.toList());

        //Calcula Deslocamento de Solo
        Deslocamento solo = new Deslocamento(new ValorMag(), "Solo");
        solo.setValor(calculaMediaDeslocamentos(desSolo).multiply(new ValorMag(fatorTotal)));
        solo.setValor(solo.getValor().divide(2));
        this.deslocamentos.add(solo);
        //Calcula Deslocamento de Mar
        Deslocamento mar = new Deslocamento(new ValorMag(), "Mar");
        mar.setValor(calculaMediaDeslocamentos(desMar).multiply(new ValorMag(fatorTotal)));
        mar.setValor(mar.getValor().divide(4));
        this.deslocamentos.add(mar);
        //Calcula Deslocamento de Ar
        Deslocamento ar = new Deslocamento(new ValorMag(), "Ar");
        ar.setValor(calculaMediaDeslocamentos(desAr).multiply(new ValorMag(fatorTotal)));
        ar.setValor(ar.getValor().divide(3));
        this.deslocamentos.add(ar);
        //Calcula Deslocamento de Espaço
        Deslocamento espaco = new Deslocamento(new ValorMag(), "Espaço");
        espaco.setValor(calculaMediaDeslocamentos(desEspaco).multiply(new ValorMag(fatorTotal)));
        this.deslocamentos.add(espaco);

    }

    private ValorMag calculaMediaDeslocamentos(List<Deslocamento> deslocamentos) {
        if (deslocamentos.size() == 1){
            return deslocamentos.get(0).getValor();
        }else{
            ValorMag media = new ValorMag();
            for (Deslocamento des: deslocamentos){
                media = media.add(des.getValor());
            }
            return media.divide(deslocamentos.size());
        }
    }

}
