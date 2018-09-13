package br.com.desireworld.core;

import br.com.desireworld.core.ser.*;
import br.com.desireworld.core.ser.acoes.Habilidade;
import br.com.desireworld.core.ser.atributos.Atributos;
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

    @Test
    public void calculaCerne(){
        Especie especieUm = new Especie();
        especieUm.setDestrias(new Intervalo<Integer>(1, 2));
        especieUm.setDensidade(new ValorMag(30, 2));
        especieUm.setTurno(new Intervalo<Integer>(1, 3));
        this.ser.getIdentidade().getEspecies().add(especieUm);

        Especie especieDois = new Especie();
        especieDois.setTurno(new Intervalo<Integer>(1, 20));
        this.ser.getIdentidade().getEspecies().add(especieDois);

        Atributos atributos = new Atributos();
        atributos.getForca().setVigor(new ValorMag(25, 2));
        atributos.getForca().setSustentacao(new ValorMag(84, 2));
        atributos.getForca().setDureza(new ValorMag(75, 2));
        atributos.getForca().setPorcentagem(new ValorMag(25, 2));
        atributos.getMateria().setVitalidade(new ValorMag(35, 2));
        atributos.getMateria().setImpulso(new ValorMag(44, 2));
        atributos.getMateria().setResistencia(new ValorMag(25, 2));
        atributos.getMateria().setPontos(25);
        atributos.getMateria().setPorcentagem(new ValorMag(25,2));
        atributos.getDestreza().setCoordenacao(new ValorMag(36, 2));
        atributos.getDestreza().setPontos(26);
        atributos.getDestreza().setPorcentagem(new ValorMag(25,2));
        atributos.getDestreza().setIniciativa(new ValorMag(36, 2));
        atributos.getIntelecto().setPorcentagem(new ValorMag(25,2));
        atributos.getCriatividade().setPorcentagem(new ValorMag(25,2));
        atributos.getIdeia().setPorcentagem(new ValorMag(25,2));
        atributos.getExistencia().setPorcentagem(new ValorMag(25,2));

        this.ser.setAtributos(atributos);
        this.ser.getCerne().setAltura(new ValorMag(18, 3));
        this.ser.getCerne().setLargura(new ValorMag(25, 1));

        this.ser.calculaCerne();

        //Acao = (vigor + vitalidade + coordenação) / 3
        assertEquals(new ValorMag(32, 2), this.ser.getCerne().getAcao());
        //Altura = definido pelo usuário
        //Carga = (impulso + sustentação) /2
        assertEquals(new ValorMag(60, 2), this.ser.getCerne().getCarga());
        //Comprimento = Pontos em matéria para ValorMag
        assertEquals(new ValorMag(25, 2), this.ser.getCerne().getComprimento());
        //Destria = Pontos Destreza / 10 (até o maximo da espécie)
        assertEquals(2, this.ser.getCerne().getDestria());
        //Essencia = média de todos os atributos
        assertEquals(new ValorMag(22, 2), this.ser.getCerne().getEssencia());
        //Iniciativa = Iniciativa da destreza
        assertEquals(new ValorMag(36, 2), this.ser.getCerne().getIniciativa());
        //Massa = ((altura * comprimento) * largura ) *densidade da espécie
        assertEquals(new ValorMag(33, 6), this.ser.getCerne().getMassa());
        //Reacao = (Vitalidade + coordenação) / 2
        assertEquals(new ValorMag(35, 2), this.ser.getCerne().getReacao());
        //Tenacidade = (Dureza + Resistêcia) /2
        assertEquals(new ValorMag(50, 2), this.ser.getCerne().getTenacidade());
        //Turno = valor minimo da especie dominante + 20% da maior especie
        assertEquals(5, this.ser.getCerne().getTurno());
    }

    @Test
    public void calculaSubatributos(){
        Atributos atributos = new Atributos();
        atributos.getMateria().setPorcentagem(new ValorMag(45, 2));
        atributos.getMateria().setBonusCP(new ValorMag(20, 2));
        atributos.getMateria().setBonusHP(new ValorMag(15, 2));
        atributos.getMateria().setPontos(10);
        atributos.getMateria().getEvolucao().setPontosAtuais(3);
        atributos.getForca().setPorcentagem(new ValorMag(66, 2));
        atributos.getForca().setBonusCP(new ValorMag(20, 2));
        atributos.getForca().setPontos(10);
        atributos.getForca().getEvolucao().setPontosAtuais(3);
        atributos.getDestreza().setPorcentagem(new ValorMag(54, 2));
        atributos.getDestreza().setBonusCP(new ValorMag(20, 2));
        atributos.getDestreza().setPontos(10);
        atributos.getDestreza().getEvolucao().setPontosAtuais(3);
        atributos.getCriatividade().setPorcentagem(new ValorMag(38, 2));
        atributos.getCriatividade().setBonusCP(new ValorMag(20, 2));
        atributos.getCriatividade().setBonusMP(new ValorMag(30, 2));
        atributos.getCriatividade().setPontos(10);
        atributos.getCriatividade().getEvolucao().setPontosAtuais(3);
        atributos.getExistencia().setPorcentagem(new ValorMag(48, 2));
        atributos.getExistencia().setBonusCP(new ValorMag(20, 2));
        atributos.getExistencia().setPontos(10);
        atributos.getExistencia().getEvolucao().setPontosAtuais(3);
        atributos.getIntelecto().setPorcentagem(new ValorMag(75, 2));
        atributos.getIntelecto().setBonusCP(new ValorMag(20, 2));
        atributos.getIntelecto().setPontos(10);
        atributos.getIntelecto().getEvolucao().setPontosAtuais(3);
        atributos.getIdeia().setPorcentagem(new ValorMag(28, 2));
        atributos.getIdeia().setBonusCP(new ValorMag(20, 2));
        atributos.getIdeia().setBonusMP(new ValorMag(13, 2));
        atributos.getIdeia().setPontos(10);
        atributos.getIdeia().getEvolucao().setPontosAtuais(3);

        this.ser.setAtributos(atributos);
        this.ser.calculaSubatributos();

        //Anatomia = (Materia + Força + Destreza) /3
        assertEquals(new ValorMag(53, 2), this.ser.getSubatributos().getAnatomia());
        //Animo = (Criatividade + Existencia)/2
        assertEquals(new ValorMag(43, 2), this.ser.getSubatributos().getAnimo());
        //Autocontrole = (Intelecto + Existencia) / 2
        assertEquals(new ValorMag(60, 2), this.ser.getSubatributos().getAutocontrole());
        //CP = todos os atributos somados
        assertEquals(new ValorMag(14, 3), this.ser.getSubatributos().getBonusCP());
        //HP = Matéria
        assertEquals(new ValorMag(15, 2), this.ser.getSubatributos().getBonusHP());
        //MP = Criatividade + Idéia
        assertEquals(new ValorMag(43, 2), this.ser.getSubatributos().getBonusMP());
        //SP = ((15*(pontos de todos atributos-7))*7) (somar tracinhos)
        assertEquals(new ValorMag(66, 4), this.ser.getSubatributos().getBonusSP());
        //Instinto = (Ideia + Destreza) / 2
        assertEquals(new ValorMag(41, 2), this.ser.getSubatributos().getInstinto());
        //Movimento = (Destreza + Forca*2) /3
        assertEquals(new ValorMag(60, 2), this.ser.getSubatributos().getMovimento());
        //Precisao = (Forca + Destreza*2) / 3
        assertEquals(new ValorMag(53, 2), this.ser.getSubatributos().getPrecisao());
        //Raciocinio = (Intelecto + Criatividade) / 2
        assertEquals(new ValorMag(55, 2), this.ser.getSubatributos().getRaciocinio());
        //Subconsciencia = (Existencia + Ideia) / 2
        assertEquals(new ValorMag(38, 2), this.ser.getSubatributos().getSubconsciencia());
    }

    @Test
    public void calculaIra(){
        Especie especieUm = new Especie();
        Especie especieDois = new Especie();
        Especie especieTres = new Especie();
        especieUm.setIra(new Intervalo<Integer>(0, 5));
        especieDois.setIra(new Intervalo<Integer>(5, 10));
        especieTres.setIra(new Intervalo<Integer>(3, 10));
        this.ser.getIdentidade().getEspecies().add(especieUm);
        this.ser.getIdentidade().getEspecies().add(especieDois);
        this.ser.getIdentidade().getEspecies().add(especieTres);

        this.ser.calculaIra();
        assertEquals(5, this.ser.getIra());
    }

    @Test
    public void calculaForcaVontade(){
        Especie especieUm = new Especie();
        Especie especieDois = new Especie();
        Especie especieTres = new Especie();
        especieUm.setForcaVontade(new Intervalo<Integer>(2, 6));
        especieDois.setForcaVontade(new Intervalo<Integer>(5, 7));
        especieTres.setForcaVontade(new Intervalo<Integer>(10, 15));
        this.ser.getIdentidade().getEspecies().add(especieUm);
        this.ser.getIdentidade().getEspecies().add(especieDois);
        this.ser.getIdentidade().getEspecies().add(especieTres);

        this.ser.calculaForcaVontade();
        assertEquals(10, this.ser.getForcaVontade());
    }
}