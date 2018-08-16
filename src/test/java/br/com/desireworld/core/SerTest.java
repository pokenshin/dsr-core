package br.com.desireworld.core;

import br.com.desireworld.core.ser.Especie;
import br.com.desireworld.core.ser.Identidade;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SerTest {
    private Ser ser;

    @Test
    public void calculaEspecial() {
        this.ser = new Ser();
        Identidade identidade = new Identidade();
        List<Especie> especies = new ArrayList<>();
        while (especies.size() < 3){
            especies.add(new Especie());
        }
        especies.get(0).setEspecial(10);
        especies.get(1).setEspecial(35);
        especies.get(2).setEspecial(53);
        identidade.setEspecies(especies);
        this.ser.setIdentidade(identidade);
        this.ser.calculaEspecial();
        assertEquals(53, ser.getEspecial());
        //verificar se o especial do ser == 53
    }
}