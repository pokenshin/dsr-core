package br.com.desireworld.core;

import br.com.desireworld.core.ser.*;
import br.com.desireworld.core.ser.acoes.Habilidade;
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
    public void calculaDeslocamentos(){
        //Adiciona Espécie
        this.ser.getIdentidade().getEspecies().add(new Especie());
        this.ser.getIdentidade().getEspecies().add(new Especie());
        this.ser.getIdentidade().getEspecies().add(new Especie());
        //Adiciona deslocamento do tipo "Solo" na espécie
        this.ser.getIdentidade().getEspecies().get(0).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(25, 2), "Solo"));
        this.ser.getIdentidade().getEspecies().get(1).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(28, 2), "Solo"));
        this.ser.getIdentidade().getEspecies().get(2).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(73, 2), "Solo"));
        //Adiciona deslocamento do tipo "Mar" na espécie
        this.ser.getIdentidade().getEspecies().get(0).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(16, 2), "Mar"));
        this.ser.getIdentidade().getEspecies().get(1).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(28, 2), "Mar"));
        this.ser.getIdentidade().getEspecies().get(2).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(88, 2), "Mar"));
        //Adiciona deslocamento do tipo "Ar" na espécie
        this.ser.getIdentidade().getEspecies().get(0).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(0, 0), "Ar"));
        this.ser.getIdentidade().getEspecies().get(1).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(77, 2), "Ar"));
        this.ser.getIdentidade().getEspecies().get(2).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(10, 3), "Ar"));
        //Adiciona deslocamento do tipo "Espaço" na espécie
        this.ser.getIdentidade().getEspecies().get(0).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(34, 2), "Espaço"));
        this.ser.getIdentidade().getEspecies().get(1).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(99, 2), "Espaço"));
        this.ser.getIdentidade().getEspecies().get(2).getDeslocamentosMedios().add(new Deslocamento(new ValorMag(21, 3), "Espaço"));

        //Seta pontos minimos de Força da especie
        this.ser.getIdentidade().getEspecies().get(0).getAtributos().getMin().getForca().setPontos(10);
        //Seta pontos minimos de Destreza da especie
        this.ser.getIdentidade().getEspecies().get(0).getAtributos().getMin().getDestreza().setPontos(10);
        //Seta pontos de destreza atuais do ser
        this.ser.getAtributos().getForca().setPontos(16);
        this.ser.getAtributos().getDestreza().setPontos(14);

        this.ser.calculaDeslocamentos();
        assertNotNull(this.ser.getDeslocamento("Solo"));
        assertNotNull(this.ser.getDeslocamento("Mar"));
        assertNotNull(this.ser.getDeslocamento("Ar"));
        assertNotNull(this.ser.getDeslocamento("Espaço"));
    }

    @Test
    public void criaListaPericias() {
        for (int i = 0; i < 2 ; i++) {
            this.ser.getIdentidade().getClasses().add(new Classe());
            this.ser.getIdentidade().getEspecies().add(new Especie());
            for (int j = 0; j < 3 ; j++) {
                this.ser.getIdentidade().getClasses().get(i).getPericias().add(new Pericia());
                this.ser.getIdentidade().getEspecies().get(i).getPericias().add(new Pericia());
            }
        }
        this.ser.criaListaPericias();
        assertEquals(12, this.ser.getPericias().size());

    }

    @Test
    public void criaListaHabilidades(){
        for (int i = 0; i < 2 ; i++) {
            this.ser.getIdentidade().getEspecies().add(new Especie());
            for (int j = 0; j < 3 ; j++) {
                this.ser.getIdentidade().getEspecies().get(i).getHabilidades().add(new Habilidade());
            }
        }
        this.ser.criaListaHabilidades();
        assertEquals(6, this.ser.getHabilidades().size());
    }

    @Test
    public void calculaCansaco() {
        for (int i = 0; i < 2 ; i++) {
            this.ser.getIdentidade().getEspecies().add(new Especie());
            this.ser.getIdentidade().getEspecies().get(i).setCansaco(new Intervalo<>(0, 3 * i+1));
        }
        this.ser.calculaCansaco();
        assertEquals(4, this.ser.getElo().getCansacoMax());
        assertEquals(0, this.ser.getElo().getCansacoAtual());
    }

    @Test
    public void calculaComportamento(){
        for (int i = 0; i < 3 ; i++) {
            Comportamento comportamento = new Comportamento(5*(i+1), 3*(i+1), 7*(i+1), 6*(i+1), 2*(i+1), 9 * (i+1));

            this.ser.getIdentidade().getEspecies().add(new Especie());
            this.ser.getIdentidade().getEspecies().get(i).setComportamento(comportamento);
        }
        this.ser.calculaComportamento();
        assertEquals(15, this.ser.getElo().getComportamento().getHonra());
        assertEquals(9, this.ser.getElo().getComportamento().getMoral());
        assertEquals(21, this.ser.getElo().getComportamento().getPersonalidade());
        assertEquals(18, this.ser.getElo().getComportamento().getApresentacao());
        assertEquals(6, this.ser.getElo().getComportamento().getPercepcao());
        assertEquals(27, this.ser.getElo().getComportamento().getConcepcao());
    }

    @Test
    public void calculaKarma(){
        for (int i = 0; i < 3 ; i++) {
            Especie especie = new Especie();
            especie.setKarma(new Intervalo<Integer>(((i+1)*10), 90));
            this.ser.getIdentidade().getEspecies().add(especie);
        }
        this.ser.calculaKarma();
        assertEquals(30, this.ser.getElo().getKarma());
    }
}