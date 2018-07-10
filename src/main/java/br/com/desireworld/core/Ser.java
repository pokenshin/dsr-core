package br.com.desireworld.core;

import br.com.desireworld.core.ciencias.Elemento;
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
    //TODO: Dons
    //TODO: Defeitos
    private String[] estimulos;
    private Elemento[] elementos;
    private Experiencia experiencia;
    //TODO: Equipamento
    //TODO: Posses
    private Elo elo;
    //TODO: Modificadores ativos
}
