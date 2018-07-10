package br.com.desireworld.core.itens;

import br.com.desireworld.core.Energia;
import br.com.desireworld.core.Intervalo;
import br.com.desireworld.core.ValorMag;

public class ArmaTiro extends Arma {
    private long tirosPorCarga;
    private long tirosPorAcao;
    private long capacidade;
    private Intervalo distancia;
    private String[] operacoes;
    private Municao municao;

    public ArmaTiro(int id, String nome, int nivel, int magnitude, int raridade, String caracteristicas, ValorMag massa, int essencia, Energia energia, int valor, int tipo, ValorMag comprimento, ValorMag largura, ValorMag peso, Material materialBase, int slot, long danoPenetracao, long danoCorte, long danoImpacto, String atributoBonus, String modificadorDano, int multiplicadorCritico, long tirosPorCarga, long tirosPorAcao, long capacidade, Intervalo distancia, String[] operacoes, Municao municao) {
        super(id, nome, nivel, magnitude, raridade, caracteristicas, massa, essencia, energia, valor, tipo, comprimento, largura, peso, materialBase, slot, danoPenetracao, danoCorte, danoImpacto, atributoBonus, modificadorDano, multiplicadorCritico);
        this.tirosPorCarga = tirosPorCarga;
        this.tirosPorAcao = tirosPorAcao;
        this.capacidade = capacidade;
        this.distancia = distancia;
        this.operacoes = operacoes;
        this.municao = municao;
    }

    public long getTirosPorCarga() {
        return tirosPorCarga;
    }

    public void setTirosPorCarga(long tirosPorCarga) {
        this.tirosPorCarga = tirosPorCarga;
    }

    public long getTirosPorAcao() {
        return tirosPorAcao;
    }

    public void setTirosPorAcao(long tirosPorAcao) {
        this.tirosPorAcao = tirosPorAcao;
    }

    public long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(long capacidade) {
        this.capacidade = capacidade;
    }

    public Intervalo getDistancia() {
        return distancia;
    }

    public void setDistancia(Intervalo distancia) {
        this.distancia = distancia;
    }

    public String[] getOperacoes() {
        return operacoes;
    }

    public void setOperacoes(String[] operacoes) {
        this.operacoes = operacoes;
    }

    public Municao getMunicao() {
        return municao;
    }

    public void setMunicao(Municao municao) {
        this.municao = municao;
    }
}
