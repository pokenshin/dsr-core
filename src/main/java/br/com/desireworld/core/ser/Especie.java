package br.com.desireworld.core.ser;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.Intervalo;
import br.com.desireworld.core.Modificador;
import br.com.desireworld.core.ValorMag;
import br.com.desireworld.core.ciencias.Elemento;
import br.com.desireworld.core.ciencias.Esfera;
import br.com.desireworld.core.lugares.Origem;
import br.com.desireworld.core.ser.acoes.Arcanidade;
import br.com.desireworld.core.ser.acoes.Habilidade;
import br.com.desireworld.core.ser.atributos.Atributos;

import java.util.ArrayList;
import java.util.List;

public class Especie {
    private int id;
    private Taxonomia taxonomia;
    private Origem origem;
    private Intervalo<Integer> magnitude;
    private Intervalo<Integer> reis;
    private Intervalo<Integer> ki;
    private Intervalo<Integer> nivel;
    private Intervalo<Integer> tempo;
    private Esfera essencia;
    private List<Energia> energias;
    private Intervalo<Atributos> atributos;
    private List<Pericia> pericias;
    private List<Habilidade> habilidades;
    private List<Arcanidade> arcanidades;
    private String origemPoder;
    private List<Modificador> virtudes;
    private List<Modificador> defeitos;
    private Intervalo<Integer> forcaVontade;
    private Intervalo<Integer> ira;
    private Intervalo<Integer> poderMaximo;
    private int fatorProgressao;
    private Intervalo<Integer> cansaco;
    private Intervalo<Integer> fe;
    private Intervalo<Integer> karma;
    private int maxItensEquipados;
    private int maxArmasEquipadas;
    private Intervalo<Integer> acao;
    private Intervalo<Integer> turno;
    private Intervalo<ValorMag> altura;
    private Intervalo<ValorMag> maturidade;
    private int dominancia; //Porcentagem de dominância vs outras especies
    private Intervalo<Integer> destrias;
    private Intervalo<Integer> trabalho;
    private ValorMag densidade;
    private Intervalo<ValorMag> largura;
    private int especial;
    private Comportamento comportamento;
    private Intervalo<Resposta> resposta;
    private List<Habilidade> fugacidade;
    private List<Deslocamento> deslocamentosMedios;
    private List<Elemento> elementos;
    private List<String> estimulos;

    public Especie(int id, Taxonomia taxonomia, Origem origem, Intervalo<Integer> magnitude, Intervalo<Integer> reis, Intervalo<Integer> ki, Intervalo<Integer> nivel, Intervalo<Integer> tempo, Esfera essencia, List<Energia> energias, Intervalo<Atributos> atributos, List<Pericia> pericias, List<Habilidade> habilidades, List<Arcanidade> arcanidades, String origemPoder, List<Modificador> virtudes, List<Modificador> defeitos, Intervalo<Integer> forcaVontade, Intervalo<Integer> ira, Intervalo<Integer> poderMaximo, int fatorProgressao, Intervalo<Integer> cansaco, Intervalo<Integer> fe, Intervalo<Integer> karma, int maxItensEquipados, int maxArmasEquipadas, Intervalo<Integer> acao, Intervalo<Integer> turno, Intervalo<ValorMag> altura, Intervalo<ValorMag> maturidade, int dominancia, Intervalo<Integer> destrias, Intervalo<Integer> trabalho, ValorMag densidade, Intervalo<ValorMag> largura, int especial, Comportamento comportamento, Intervalo<Resposta> resposta, List<Habilidade> fugacidade, List<Deslocamento> deslocamentosMedios, List<Elemento> elementos, List<String> estimulos) {
        this.id = id;
        this.taxonomia = taxonomia;
        this.origem = origem;
        this.magnitude = magnitude;
        this.reis = reis;
        this.ki = ki;
        this.nivel = nivel;
        this.tempo = tempo;
        this.essencia = essencia;
        this.energias = energias;
        this.atributos = atributos;
        this.pericias = pericias;
        this.habilidades = habilidades;
        this.arcanidades = arcanidades;
        this.origemPoder = origemPoder;
        this.virtudes = virtudes;
        this.defeitos = defeitos;
        this.forcaVontade = forcaVontade;
        this.ira = ira;
        this.poderMaximo = poderMaximo;
        this.fatorProgressao = fatorProgressao;
        this.cansaco = cansaco;
        this.fe = fe;
        this.karma = karma;
        this.maxItensEquipados = maxItensEquipados;
        this.maxArmasEquipadas = maxArmasEquipadas;
        this.acao = acao;
        this.turno = turno;
        this.altura = altura;
        this.maturidade = maturidade;
        this.dominancia = dominancia;
        this.destrias = destrias;
        this.trabalho = trabalho;
        this.densidade = densidade;
        this.largura = largura;
        this.especial = especial;
        this.comportamento = comportamento;
        this.resposta = resposta;
        this.fugacidade = fugacidade;
        this.deslocamentosMedios = deslocamentosMedios;
        this.elementos = elementos;
        this.estimulos = estimulos;
    }

    public Especie() {
        this.id = 0;
        this.taxonomia = new Taxonomia();
        this.origem = new Origem();
        this.magnitude = new Intervalo<>(0, 0);
        this.reis = new Intervalo<>(0, 0);
        this.ki = new Intervalo<>(0, 0);
        this.nivel = new Intervalo<>(0, 0);
        this.tempo = new Intervalo<>(0, 0);
        this.essencia = new Esfera();
        this.energias = new ArrayList<>();
        this.atributos = new Intervalo<>(new Atributos(), new Atributos());
        this.pericias = new ArrayList<>();
        this.habilidades = new ArrayList<>();
        this.arcanidades = new ArrayList<>();
        this.origemPoder = "";
        this.virtudes = new ArrayList<>();
        this.defeitos = new ArrayList<>();
        this.forcaVontade = new Intervalo<>(0, 0);
        this.ira = new Intervalo<>(0, 0);
        this.poderMaximo = new Intervalo<>(0, 0);
        this.fatorProgressao = 0;
        this.cansaco = new Intervalo<>(0, 0);
        this.fe = new Intervalo<>(0, 0);
        this.karma = new Intervalo<>(0, 0);
        this.maxItensEquipados = 0;
        this.maxArmasEquipadas = 0;
        this.acao = new Intervalo<>(0, 0);
        this.turno = new Intervalo<>(0 ,0);
        this.altura = new Intervalo<>(new ValorMag(), new ValorMag());
        this.maturidade = new Intervalo<>(new ValorMag(), new ValorMag());
        this.dominancia = 0;
        this.destrias = new Intervalo<>(0, 0);
        this.trabalho = new Intervalo<>(0, 0);
        this.densidade = new ValorMag();
        this.largura = new Intervalo<>(new ValorMag(), new ValorMag());
        this.especial = 0;
        this.comportamento = new Comportamento();
        this.resposta = new Intervalo<>(new Resposta(), new Resposta());
        this.fugacidade = new ArrayList<>();
        this.deslocamentosMedios = new ArrayList<>();
        this.elementos = new ArrayList<>();
        this.estimulos = new ArrayList<>();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Taxonomia getTaxonomia() {
        return taxonomia;
    }

    public void setTaxonomia(Taxonomia taxonomia) {
        this.taxonomia = taxonomia;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Intervalo<Integer> getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Intervalo<Integer> magnitude) {
        this.magnitude = magnitude;
    }

    public Intervalo<Integer> getReis() {
        return reis;
    }

    public void setReis(Intervalo<Integer> reis) {
        this.reis = reis;
    }

    public Intervalo<Integer> getKi() {
        return ki;
    }

    public void setKi(Intervalo<Integer> ki) {
        this.ki = ki;
    }

    public Intervalo<Integer> getNivel() {
        return nivel;
    }

    public void setNivel(Intervalo<Integer> nivel) {
        this.nivel = nivel;
    }

    public Intervalo<Integer> getTempo() {
        return tempo;
    }

    public void setTempo(Intervalo<Integer> tempo) {
        this.tempo = tempo;
    }

    public Esfera getEssencia() {
        return essencia;
    }

    public void setEssencia(Esfera essencia) {
        this.essencia = essencia;
    }

    public List<Energia> getEnergias() {
        return energias;
    }

    public void setEnergias(List<Energia> energias) {
        this.energias = energias;
    }

    public Intervalo<Atributos> getAtributos() {
        return atributos;
    }

    public void setAtributos(Intervalo<Atributos> atributos) {
        this.atributos = atributos;
    }

    public List<Pericia> getPericias() {
        return pericias;
    }

    public void setPericias(List<Pericia> pericias) {
        this.pericias = pericias;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Arcanidade> getArcanidades() {
        return arcanidades;
    }

    public void setArcanidades(List<Arcanidade> arcanidades) {
        this.arcanidades = arcanidades;
    }

    public String getOrigemPoder() {
        return origemPoder;
    }

    public void setOrigemPoder(String origemPoder) {
        this.origemPoder = origemPoder;
    }

    public List<Modificador> getVirtudes() {
        return virtudes;
    }

    public void setVirtudes(List<Modificador> virtudes) {
        this.virtudes = virtudes;
    }

    public List<Modificador> getDefeitos() {
        return defeitos;
    }

    public void setDefeitos(List<Modificador> defeitos) {
        this.defeitos = defeitos;
    }

    public Intervalo<Integer> getForcaVontade() {
        return forcaVontade;
    }

    public void setForcaVontade(Intervalo<Integer> forcaVontade) {
        this.forcaVontade = forcaVontade;
    }

    public Intervalo<Integer> getIra() {
        return ira;
    }

    public void setIra(Intervalo<Integer> ira) {
        this.ira = ira;
    }

    public Intervalo<Integer> getPoderMaximo() {
        return poderMaximo;
    }

    public void setPoderMaximo(Intervalo<Integer> poderMaximo) {
        this.poderMaximo = poderMaximo;
    }

    public int getFatorProgressao() {
        return fatorProgressao;
    }

    public void setFatorProgressao(int fatorProgressao) {
        this.fatorProgressao = fatorProgressao;
    }

    public Intervalo<Integer> getCansaco() {
        return cansaco;
    }

    public void setCansaco(Intervalo<Integer> cansaco) {
        this.cansaco = cansaco;
    }

    public Intervalo<Integer> getFe() {
        return fe;
    }

    public void setFe(Intervalo<Integer> fe) {
        this.fe = fe;
    }

    public Intervalo<Integer> getKarma() {
        return karma;
    }

    public void setKarma(Intervalo<Integer> karma) {
        this.karma = karma;
    }

    public int getMaxItensEquipados() {
        return maxItensEquipados;
    }

    public void setMaxItensEquipados(int maxItensEquipados) {
        this.maxItensEquipados = maxItensEquipados;
    }

    public int getMaxArmasEquipadas() {
        return maxArmasEquipadas;
    }

    public void setMaxArmasEquipadas(int maxArmasEquipadas) {
        this.maxArmasEquipadas = maxArmasEquipadas;
    }

    public Intervalo<Integer> getAcao() {
        return acao;
    }

    public void setAcao(Intervalo<Integer> acao) {
        this.acao = acao;
    }

    public Intervalo<Integer> getTurno() {
        return turno;
    }

    public void setTurno(Intervalo<Integer> turno) {
        this.turno = turno;
    }

    public Intervalo<ValorMag> getAltura() {
        return altura;
    }

    public void setAltura(Intervalo<ValorMag> altura) {
        this.altura = altura;
    }

    public Intervalo<ValorMag> getMaturidade() {
        return maturidade;
    }

    public void setMaturidade(Intervalo<ValorMag> maturidade) {
        this.maturidade = maturidade;
    }

    public int getDominancia() {
        return dominancia;
    }

    public void setDominancia(int dominancia) {
        this.dominancia = dominancia;
    }

    public Intervalo<Integer> getDestrias() {
        return destrias;
    }

    public void setDestrias(Intervalo<Integer> destrias) {
        this.destrias = destrias;
    }

    public Intervalo<Integer> getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Intervalo<Integer> trabalho) {
        this.trabalho = trabalho;
    }

    public ValorMag getDensidade() {
        return densidade;
    }

    public void setDensidade(ValorMag densidade) {
        this.densidade = densidade;
    }

    public Intervalo<ValorMag> getLargura() {
        return largura;
    }

    public void setLargura(Intervalo<ValorMag> largura) {
        this.largura = largura;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public Comportamento getComportamento() {
        return comportamento;
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public Intervalo<Resposta> getResposta() {
        return resposta;
    }

    public void setResposta(Intervalo<Resposta> resposta) {
        this.resposta = resposta;
    }

    public List<Habilidade> getFugacidade() {
        return fugacidade;
    }

    public void setFugacidade(List<Habilidade> fugacidade) {
        this.fugacidade = fugacidade;
    }

    public List<Deslocamento> getDeslocamentosMedios() {
        return deslocamentosMedios;
    }

    public void setDeslocamentosMedios(List<Deslocamento> deslocamentosMedios) {
        this.deslocamentosMedios = deslocamentosMedios;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public List<String> getEstimulos() {
        return estimulos;
    }

    public void setEstimulos(List<String> estimulos) {
        this.estimulos = estimulos;
    }
}
