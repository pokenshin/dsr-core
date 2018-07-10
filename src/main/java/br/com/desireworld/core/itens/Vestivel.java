package br.com.desireworld.core.itens;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ValorMag;

public class Vestivel extends Equipamento {
    private ValorMag resCorte;
    private ValorMag resPenetracao;
    private ValorMag resImpacto;
    private ValorMag resDegeneracao;

    public Vestivel(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, Material materialBase, int slot, ValorMag resCorte, ValorMag resPenetracao, ValorMag resImpacto, ValorMag resDegeneracao) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso, materialBase, slot);
        this.resCorte = resCorte;
        this.resPenetracao = resPenetracao;
        this.resImpacto = resImpacto;
        this.resDegeneracao = resDegeneracao;
    }

    public ValorMag getResCorte() {
        return resCorte;
    }

    public void setResCorte(ValorMag resCorte) {
        this.resCorte = resCorte;
    }

    public ValorMag getResPenetracao() {
        return resPenetracao;
    }

    public void setResPenetracao(ValorMag resPenetracao) {
        this.resPenetracao = resPenetracao;
    }

    public ValorMag getResImpacto() {
        return resImpacto;
    }

    public void setResImpacto(ValorMag resImpacto) {
        this.resImpacto = resImpacto;
    }

    public ValorMag getResDegeneracao() {
        return resDegeneracao;
    }

    public void setResDegeneracao(ValorMag resDegeneracao) {
        this.resDegeneracao = resDegeneracao;
    }
}
