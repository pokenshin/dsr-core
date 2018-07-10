package br.com.desireworld.core.ser;

import br.com.desireworld.core.ciencias.Ciencia;

public class Classe {
    private int id;
    private String nome;
    private String estilo;
    private String funcao;
    private String origemPoder;
    private String atributoFisico;
    private String atributoMental;
    private String atributoEspiritual;
    private String descricao;
    private Ciencia ciencia;
    private Pericia[] pericias;

    public Classe(int id, String nome, String estilo, String funcao, String origemPoder, String atributoFisico, String atributoMental, String atributoEspiritual, String descricao, Ciencia ciencia, Pericia[] pericias) {
        this.id = id;
        this.nome = nome;
        this.estilo = estilo;
        this.funcao = funcao;
        this.origemPoder = origemPoder;
        this.atributoFisico = atributoFisico;
        this.atributoMental = atributoMental;
        this.atributoEspiritual = atributoEspiritual;
        this.descricao = descricao;
        this.ciencia = ciencia;
        this.pericias = pericias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getOrigemPoder() {
        return origemPoder;
    }

    public void setOrigemPoder(String origemPoder) {
        this.origemPoder = origemPoder;
    }

    public String getAtributoFisico() {
        return atributoFisico;
    }

    public void setAtributoFisico(String atributoFisico) {
        this.atributoFisico = atributoFisico;
    }

    public String getAtributoMental() {
        return atributoMental;
    }

    public void setAtributoMental(String atributoMental) {
        this.atributoMental = atributoMental;
    }

    public String getAtributoEspiritual() {
        return atributoEspiritual;
    }

    public void setAtributoEspiritual(String atributoEspiritual) {
        this.atributoEspiritual = atributoEspiritual;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Ciencia getCiencia() {
        return ciencia;
    }

    public void setCiencia(Ciencia ciencia) {
        this.ciencia = ciencia;
    }

    public Pericia[] getPericias() {
        return pericias;
    }

    public void setPericias(Pericia[] pericias) {
        this.pericias = pericias;
    }
}
