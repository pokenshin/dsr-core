package br.com.desireworld.core.itens;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.Intervalo;
import br.com.desireworld.core.ValorMag;

public class ArmaBranca extends Arma {
    private Intervalo distancia;

    public ArmaBranca(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, Material materialBase, int slot, long danoPenetracao, long danoCorte, long danoImpacto, String atributoBonus, String modificadorDano, int multiplicadorCritico, Intervalo distancia) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso, materialBase, slot, danoPenetracao, danoCorte, danoImpacto, atributoBonus, modificadorDano, multiplicadorCritico);
        this.distancia = distancia;
    }

    public Intervalo getDistancia() {
        return distancia;
    }

    public void setDistancia(Intervalo distancia) {
        this.distancia = distancia;
    }
}
