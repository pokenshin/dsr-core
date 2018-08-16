package br.com.desireworld.core;

import br.com.desireworld.core.ser.Deslocamento;
import br.com.desireworld.core.ser.Especie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SerTest {
    private Ser ser;

    @Before
    public void setUp() throws Exception {
        this.ser = new Ser();
   }

    @Test
    //Maior especial das espécies do ser
    public void calculaEspecial() {
        this.ser.getIdentidade().getEspecies().add(new Especie());
        this.ser.getIdentidade().getEspecies().add(new Especie());
        this.ser.getIdentidade().getEspecies().get(0).setEspecial(39);
        this.ser.getIdentidade().getEspecies().get(1).setEspecial(53);
        this.ser.calculaEspecial();
        assertEquals(53, ser.getEspecial());
    }

    @Test
//  DeslocamentoSolo = Minimo da Especie * (FatorDex + FatorFor) / 2
//  DeslocamentoMar = (Minimo da Especie * (FatorDex + FatorFor)) / 4
//  DeslocamentoAr = (Minimo da Especie * (FatorDex + FatorFor)) / 3
//  DeslocamentoEspaco = Minimo da Especie * (FatorDex + FatorFor)
    public void calculaDeslocamento(){
        //Adiciona Espécie
        this.ser.getIdentidade().getEspecies().add(new Especie());
        //Adiciona deslocamento do tipo "Solo" na espécie
        this.ser.getIdentidade().getEspecies().get(0).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(25, 2), "Solo"));
        //Adiciona deslocamento do tipo "Mar" na espécie
        this.ser.getIdentidade().getEspecies().get(0).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(16, 2), "Mar"));
        //Adiciona deslocamento do tipo "Ar" na espécie
        this.ser.getIdentidade().getEspecies().get(0).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(10, 2), "Ar"));
        //Adiciona deslocamento do tipo "Espaço" na espécie
        this.ser.getIdentidade().getEspecies().get(0).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(34, 2), "Espaço"));
        //Seta pontos minimos de Força da especie
        this.ser.getIdentidade().getEspecies().get(0).getAtributos().getMin().getForca().setPontos(35);
        //Seta pontos minimos de Destreza da especie
        this.ser.getIdentidade().getEspecies().get(0).getAtributos().getMin().getDestreza().setPontos(26);
        //Seta pontos de destreza atuais do ser
        this.ser.getAtributos().getForca().setPontos(39);
        this.ser.getAtributos().getDestreza().setPontos(29);

        this.ser.calculaDeslocamentos();
        assertNotNull(this.ser.getDeslocamento("Solo"));
    }
}