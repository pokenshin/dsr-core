package br.com.desireworld.core.itens;

import br.com.desireworld.core.Efeito;
import br.com.desireworld.core.Energia;
import br.com.desireworld.core.ValorMag;

public class Municao extends Equipamento {
    private Material materialBase;
    private long penetracaoBonus;
    private long impactoBonus;
    private long corteBonus;
    private Efeito[] efeitosBonus;

    public Municao(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, Material materialBase, int slot, Material materialBase1, long penetracaoBonus, long impactoBonus, long corteBonus, Efeito[] efeitosBonus) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso, materialBase, slot);
        this.materialBase = materialBase1;
        this.penetracaoBonus = penetracaoBonus;
        this.impactoBonus = impactoBonus;
        this.corteBonus = corteBonus;
        this.efeitosBonus = efeitosBonus;
    }

    @Override
    public Material getMaterialBase() {
        return materialBase;
    }

    @Override
    public void setMaterialBase(Material materialBase) {
        this.materialBase = materialBase;
    }

    public long getPenetracaoBonus() {
        return penetracaoBonus;
    }

    public void setPenetracaoBonus(long penetracaoBonus) {
        this.penetracaoBonus = penetracaoBonus;
    }

    public long getImpactoBonus() {
        return impactoBonus;
    }

    public void setImpactoBonus(long impactoBonus) {
        this.impactoBonus = impactoBonus;
    }

    public long getCorteBonus() {
        return corteBonus;
    }

    public void setCorteBonus(long corteBonus) {
        this.corteBonus = corteBonus;
    }

    public Efeito[] getEfeitosBonus() {
        return efeitosBonus;
    }

    public void setEfeitosBonus(Efeito[] efeitosBonus) {
        this.efeitosBonus = efeitosBonus;
    }
}
