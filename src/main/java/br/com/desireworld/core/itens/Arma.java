package br.com.desireworld.core.itens;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ValorMag;

public  abstract class Arma extends Equipamento {
    private long danoPenetracao;
    private long danoCorte;
    private long danoImpacto;
    private String atributoBonus;
    private String modificadorDano;
    private int multiplicadorCritico;

    public Arma(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, Material materialBase, int slot, long danoPenetracao, long danoCorte, long danoImpacto, String atributoBonus, String modificadorDano, int multiplicadorCritico) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso, materialBase, slot);
        this.danoPenetracao = danoPenetracao;
        this.danoCorte = danoCorte;
        this.danoImpacto = danoImpacto;
        this.atributoBonus = atributoBonus;
        this.modificadorDano = modificadorDano;
        this.multiplicadorCritico = multiplicadorCritico;
    }

    public long getDanoPenetracao() {
        return danoPenetracao;
    }

    public void setDanoPenetracao(long danoPenetracao) {
        this.danoPenetracao = danoPenetracao;
    }

    public long getDanoCorte() {
        return danoCorte;
    }

    public void setDanoCorte(long danoCorte) {
        this.danoCorte = danoCorte;
    }

    public long getDanoImpacto() {
        return danoImpacto;
    }

    public void setDanoImpacto(long danoImpacto) {
        this.danoImpacto = danoImpacto;
    }

    public String getAtributoBonus() {
        return atributoBonus;
    }

    public void setAtributoBonus(String atributoBonus) {
        this.atributoBonus = atributoBonus;
    }

    public String getModificadorDano() {
        return modificadorDano;
    }

    public void setModificadorDano(String modificadorDano) {
        this.modificadorDano = modificadorDano;
    }

    public int getMultiplicadorCritico() {
        return multiplicadorCritico;
    }

    public void setMultiplicadorCritico(int multiplicadorCritico) {
        this.multiplicadorCritico = multiplicadorCritico;
    }
}
