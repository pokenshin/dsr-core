package br.com.desireworld.core;

import br.com.desireworld.core.ciencias.Elemento;
import br.com.desireworld.core.itens.Equipamento;
import br.com.desireworld.core.itens.Item;
import br.com.desireworld.core.ser.*;
import br.com.desireworld.core.ser.acoes.Habilidade;
import br.com.desireworld.core.ser.acoes.Tecnica;
import br.com.desireworld.core.ser.atributos.Atributos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ser {
    private Identidade identidade;
    private Atributos atributos;
    private List<Energia> energias;
    private int especial;
    private List<Deslocamento> deslocamentos;
    private Subatributos subatributos;
    private Cerne cerne;
    private List<Pericia> pericias;
    private List<Habilidade> fugacidade;
    private List<Habilidade> habilidades;
    private List<Habilidade> arcanidades;
    private List<Tecnica> tecnicas;
    private Resposta resposta;
    private int forcaVontade;
    private int ira;
    private int poderMaximo;
    private List<Modificador> dons;
    private List<Modificador> defeitos;
    private List<String> estimulos;
    private List<Elemento> elementos;
    private Experiencia experiencia;
    private List<Equipamento> itensEquipados;
    private List<Item> posses;
    private Elo elo;
    private List<Modificador> modificadoresAtivos;

    public Ser() {
        this.identidade = new Identidade();
        this.atributos = new Atributos();
        this.criaEnergias();
        this.especial = 0;
        this.deslocamentos = new ArrayList<>();
        this.subatributos = new Subatributos();
        this.cerne = new Cerne();
        this.pericias = new ArrayList<>();
        this.fugacidade = new ArrayList<>();
        this.habilidades = new ArrayList<>();
        this.arcanidades = new ArrayList<>();
        this.tecnicas = new ArrayList<>();
        this.resposta = new Resposta();
        this.forcaVontade = 0;
        this.ira = 0;
        this.poderMaximo = 0;
        this.estimulos = new ArrayList<>();
        this.elementos = new ArrayList<>();
        this.experiencia = new Experiencia();
        this.itensEquipados = new ArrayList<>();
        this.posses = new ArrayList<>();
        this.elo = new Elo();
    }

    public List<Modificador> getDons() {
        return dons;
    }

    public void setDons(List<Modificador> dons) {
        this.dons = dons;
    }

    public List<Modificador> getDefeitos() {
        return defeitos;
    }

    public void setDefeitos(List<Modificador> defeitos) {
        this.defeitos = defeitos;
    }

    public List<Modificador> getModificadoresAtivos() {
        return modificadoresAtivos;
    }

    public void setModificadoresAtivos(List<Modificador> modificadoresAtivos) {
        this.modificadoresAtivos = modificadoresAtivos;
    }

    public Ser(Identidade identidade, Atributos atributos, List<Energia> energias, int especial, List<Deslocamento> deslocamentos, Subatributos subatributos, Cerne cerne, List<Pericia> pericias, List<Habilidade> fugacidade, List<Habilidade> habilidades, List<Habilidade> arcanidades, List<Tecnica> tecnicas, Resposta resposta, int forcaVontade, int ira, int poderMaximo, List<String> estimulos, List<Elemento> elementos, Experiencia experiencia, List<Equipamento> itensEquipados, List<Item> posses, Elo elo) {
        this.identidade = identidade;
        this.atributos = atributos;
        this.energias = energias;
        this.especial = especial;
        this.deslocamentos = deslocamentos;
        this.subatributos = subatributos;
        this.cerne = cerne;
        this.pericias = pericias;
        this.fugacidade = fugacidade;
        this.habilidades = habilidades;
        this.arcanidades = arcanidades;
        this.tecnicas = tecnicas;
        this.resposta = resposta;
        this.forcaVontade = forcaVontade;
        this.ira = ira;
        this.poderMaximo = poderMaximo;
        this.estimulos = estimulos;
        this.elementos = elementos;
        this.experiencia = experiencia;
        this.itensEquipados = itensEquipados;
        this.posses = posses;
        this.elo = elo;
    }

    public Ser(Identidade identidade, Atributos atributos, List<Pericia> pericias, List<Habilidade> habilidades, List<Habilidade> arcanidades, List<Tecnica> tecnicas, List<Modificador> dons, List<Modificador> defeitos, List<Equipamento> itensEquipados, List<Item> posses) {
        this.identidade = identidade;
        this.atributos = atributos;
        this.pericias = pericias;
        this.habilidades = habilidades;
        this.arcanidades = arcanidades;
        this.tecnicas = tecnicas;
        this.dons = dons;
        this.defeitos = defeitos;
        this.itensEquipados = itensEquipados;
        this.posses = posses;
    }

    public Identidade getIdentidade() {
        return identidade;
    }

    public void setIdentidade(Identidade identidade) {
        this.identidade = identidade;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public List<Energia> getEnergias() {
        return energias;
    }

    public void setEnergias(List<Energia> energias) {
        this.energias = energias;
    }

    public int getEspecial() {
        return especial;
    }

    public void setEspecial(int especial) {
        this.especial = especial;
    }

    public List<Deslocamento> getDeslocamentos() {
        return deslocamentos;
    }

    public Deslocamento getDeslocamento(String tipo){
        if (this.deslocamentos.size() > 0){
            return deslocamentos.stream().filter(d -> d.getTipo() == tipo).collect(Collectors.toList()).get(0);
        } else return null;
    }

    public void setDeslocamentos(List<Deslocamento> deslocamentos) {
        this.deslocamentos = deslocamentos;
    }

    public Subatributos getSubatributos() {
        return subatributos;
    }

    public void setSubatributos(Subatributos subatributos) {
        this.subatributos = subatributos;
    }

    public Cerne getCerne() {
        return cerne;
    }

    public void setCerne(Cerne cerne) {
        this.cerne = cerne;
    }

    public List<Pericia> getPericias() {
        return pericias;
    }

    public void setPericias(List<Pericia> pericias) {
        this.pericias = pericias;
    }

    public List<Habilidade> getFugacidade() {
        return fugacidade;
    }

    public void setFugacidade(List<Habilidade> fugacidade) {
        this.fugacidade = fugacidade;
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidade> habilidades) {
        this.habilidades = habilidades;
    }

    public List<Habilidade> getArcanidades() {
        return arcanidades;
    }

    public void setArcanidades(List<Habilidade> arcanidades) {
        this.arcanidades = arcanidades;
    }

    public List<Tecnica> getTecnicas() {
        return tecnicas;
    }

    public void setTecnicas(List<Tecnica> tecnicas) {
        this.tecnicas = tecnicas;
    }

    public Resposta getResposta() {
        return resposta;
    }

    public void setResposta(Resposta resposta) {
        this.resposta = resposta;
    }

    public int getForcaVontade() {
        return forcaVontade;
    }

    public void setForcaVontade(int forcaVontade) {
        this.forcaVontade = forcaVontade;
    }

    public int getIra() {
        return ira;
    }

    public void setIra(int ira) {
        this.ira = ira;
    }

    public int getPoderMaximo() {
        return poderMaximo;
    }

    public void setPoderMaximo(int poderMaximo) {
        this.poderMaximo = poderMaximo;
    }

    public List<String> getEstimulos() {
        return estimulos;
    }

    public void setEstimulos(List<String> estimulos) {
        this.estimulos = estimulos;
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public Experiencia getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(Experiencia experiencia) {
        this.experiencia = experiencia;
    }

    public List<Equipamento> getItensEquipados() {
        return itensEquipados;
    }

    public void setItensEquipados(List<Equipamento> itensEquipados) {
        this.itensEquipados = itensEquipados;
    }

    public List<Item> getPosses() {
        return posses;
    }

    public void setPosses(List<Item> posses) {
        this.posses = posses;
    }

    public Elo getElo() {
        return elo;
    }

    public void setElo(Elo elo) {
        this.elo = elo;
    }

    public void calcular(){
        this.calculaEspecial();
        this.calculaDeslocamentos();
        this.criaListaPericias();
        this.criaListaHabilidades();
//        this.criaListaArcnidades();
        this.calculaCansaco();
        this.calculaComportamento();
        this.calculaFe();
        this.calculaKarma();
        this.calculaSubatributos();
        this.calculaCerne();
        this.calculaIra();
        this.calculaForcaVontade();
        this.calculaPoderMaximo();
        this.calculaResposta();
        this.calculaFugacidade();
        this.calculaMagnitude();
        this.calculaEnergias();
//      this.calculaModificadoresAtivos();


//        this.calculaExperiencia();
    }

    public Energia getEnergiaById(int id){
        return this.energias.stream()
                .filter(e -> e.getId() == id )
                .findFirst()
                .get();
    }

    // Pega todas as energias das espécies
    // Calcula a quantidade de cada uma das energias
    // TODO: Refatorar para ficar melhor
    public void calculaEnergias() {
        //Energias: "AP", "CP", "EP", "HP", "MP", "QP", "SP", "PE", "PA";
        for (Especie especie: this.getIdentidade().getEspecies()){
            for(Energia energia: especie.getEnergias()){
                long valor = this.getEnergiaById(energia.getId()).getMaximo();
                this.energias.stream().filter(e -> e.getId() == energia.getId()).findFirst().get().setQuantidade(valor + energia.getQuantidade());
                this.energias.stream().filter(e -> e.getId() == energia.getId()).findFirst().get().setMaximo(valor + energia.getQuantidade());
            }
        }
    }

    private void criaEnergias(){
        this.energias = new ArrayList<>();
        this.energias.add(new Energia(1, "AP", "Action Points", 0, 0));
        this.energias.add(new Energia(2, "CP", "Constitution Points", 0, 0));
        this.energias.add(new Energia(3, "EP", "Espirito Points", 0, 0));
        this.energias.add(new Energia(4, "HP", "Hit Points", 0, 0));
        this.energias.add(new Energia(5, "MP", "Magic Points", 0, 0));
        this.energias.add(new Energia(6, "QP", "Quintessential Points", 0, 0));
        this.energias.add(new Energia(7, "SP", "Spirit Points", 0,0));
        this.energias.add(new Energia(8, "PE", "Points", 0,0));
        this.energias.add(new Energia(9,"PA", "Paradigma Points", 0,0));
    }

    //Magnitude média dos atributos
    //Pega magnitude do Rei se for maior que a média dos atributos
    public void calculaMagnitude() {
        int magTotal = this.atributos.getForca().getPorcentagem().getMag() + this.atributos.getDestreza().getPorcentagem().getMag() + this.atributos.getMateria().getPorcentagem().getMag() + this.atributos.getExistencia().getPorcentagem().getMag() + this.atributos.getIdeia().getPorcentagem().getMag() + this.atributos.getCriatividade().getPorcentagem().getMag() + this.atributos.getIntelecto().getPorcentagem().getMag();
        magTotal /= 7;
        int magReis = getMax(this.identidade.getReis().stream().map(r -> r.getMagnitude()).collect(Collectors.toList()));
        this.identidade.setMagnitude(Math.max(magTotal, magReis));

    }

    //Lista todas as habilidades do tipo Fugacidade
    public void calculaFugacidade() {
        this.setFugacidade(this.habilidades.stream()
                .filter(h -> h.getTipo().getNome() == "Fugacidade")
                .collect(Collectors.toList()));
    }

    //PoderMaximo = Maximo do minimo das espécies
    public void calculaPoderMaximo() {
        this.setPoderMaximo(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getPoderMaximo().getMin())
                .collect(Collectors.toList())
        ));
    }

    //ForcaVontade = Máximo do mínimo das espécies
    public void calculaForcaVontade() {
        this.setForcaVontade(getMax(this.identidade.getEspecies().stream()
            .map(e -> e.getForcaVontade().getMin())
            .collect(Collectors.toList())
        ));
    }

    //Ira = Máximo do mínimo das espécies
    public void calculaIra() {
        this.setIra(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getIra().getMin())
                .collect(Collectors.toList())
        ));
    }

    public void calculaCerne() {
        //Acao = (vigor + vitalidade + coordenação) / 3
        this.cerne.setAcao(this.atributos.getForca().getVigor().add(this.atributos.getMateria().getVitalidade()));
        this.cerne.setAcao(this.cerne.getAcao().add(this.atributos.getDestreza().getCoordenacao()));
        this.cerne.setAcao(this.cerne.getAcao().divide(3));
        //Carga = (impulso + sustentação) / 2
        this.cerne.setCarga(this.atributos.getMateria().getImpulso().add(this.atributos.getForca().getSustentacao()));
        this.cerne.setCarga(this.cerne.getCarga().divide(2));
        //Comprimento = Pontos em matéria para ValorMag
        this.cerne.setComprimento(new ValorMag(this.atributos.getMateria().getPontos()));
        //Destria = Pontos Destreza / 10 (até o maximo da espécie)
        if ((this.atributos.getDestreza().getPontos() / 10) > this.identidade.getEspecies().get(0).getDestrias().getMin()) {
            this.cerne.setDestria(this.atributos.getDestreza().getPontos() / 10);
        } else{
            this.cerne.setDestria(this.identidade.getEspecies().get(0).getDestrias().getMin());
        }
        //Essência = Média de todos os atributos
        this.cerne.setEssencia(this.atributos.getForca().getPorcentagem().add(this.atributos.getDestreza().getPorcentagem()));
        this.cerne.setEssencia(this.cerne.getEssencia().add(this.atributos.getMateria().getPorcentagem()));
        this.cerne.setEssencia(this.cerne.getEssencia().add(this.atributos.getIdeia().getPorcentagem()));
        //Destria = Pontos Destreza / 10 (até o maximo da espécie)
        this.cerne.setDestria(atributos.getDestreza().getPontos() / 10);
        //Essencia = média de todos os atributos
        this.cerne.setEssencia(this.atributos.getForca().getPorcentagem().add(this.atributos.getDestreza().getPorcentagem()));
        this.cerne.setEssencia(this.cerne.getEssencia().add(this.atributos.getMateria().getPorcentagem()));
        this.cerne.setEssencia(this.cerne.getEssencia().add(this.atributos.getIntelecto().getPorcentagem()));
        this.cerne.setEssencia(this.cerne.getEssencia().add(this.atributos.getCriatividade().getPorcentagem()));
        this.cerne.setEssencia(this.cerne.getEssencia().add(this.atributos.getIdeia().getPorcentagem()));
        this.cerne.setEssencia(this.cerne.getEssencia().add(this.atributos.getExistencia().getPorcentagem()));
        this.cerne.setEssencia(this.cerne.getEssencia().divide(7));
        //Iniciativa = Iniciativa da destreza
        this.cerne.setIniciativa(this.atributos.getDestreza().getIniciativa());
        //Largura = escolhido pelo usuário
        //Massa = ((altura * comprimento) * largura ) *densidade da espécie
        this.cerne.setMassa(this.cerne.getAltura().multiply(this.cerne.getComprimento()));
        this.cerne.setMassa(this.cerne.getMassa().multiply(this.cerne.getLargura()));
        this.cerne.setMassa(this.cerne.getMassa().multiply(this.identidade.getEspecies().get(0).getDensidade()));
        //Reacao = (Vitalidade + coordenação) / 2
        this.cerne.setReacao(this.atributos.getMateria().getVitalidade().add(this.atributos.getDestreza().getCoordenacao()));
        this.cerne.setReacao(this.cerne.getReacao().divide(2));
        //Tenacidade = (Dureza + Resistêcia) /2
        this.cerne.setTenacidade(this.atributos.getForca().getDureza().add(this.atributos.getMateria().getResistencia()));
        this.cerne.setTenacidade(this.cerne.getTenacidade().divide(2));
        //Turno = valor minimo da especie dominante + 20% da maior especie
        this.cerne.setTurno(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getTurno().getMax())
                .collect(Collectors.toList())));
        this.cerne.setTurno((int)Math.round(cerne.getTurno() * 0.2));
        this.cerne.setTurno(this.cerne.getTurno() + this.identidade.getEspecies().get(0).getTurno().getMin());

    }

    public void calculaSubatributos() {
        //Anatomia = (Materia + Força + Destreza) /3
        this.subatributos.setAnatomia(this.atributos.getMateria().getPorcentagem().add(this.atributos.getForca().getPorcentagem()));
        this.subatributos.setAnatomia(this.subatributos.getAnatomia().add(this.atributos.getDestreza().getPorcentagem()));
        this.subatributos.setAnatomia(this.subatributos.getAnatomia().divide(3));
        //Animo = (Criatividade + Existencia)/2
        this.subatributos.setAnimo(this.atributos.getCriatividade().getPorcentagem().add(this.atributos.getExistencia().getPorcentagem()));
        this.subatributos.setAnimo(this.subatributos.getAnimo().divide(2));
        //Autocontrole = (Intelecto + Existencia) / 2
        this.subatributos.setAutocontrole(this.atributos.getIntelecto().getPorcentagem().add(this.atributos.getExistencia().getPorcentagem()));
        this.subatributos.setAutocontrole(this.subatributos.getAutocontrole().divide(2));
        //CP = todos os atributos somados
        this.subatributos.setBonusCP(this.atributos.getForca().getBonusCP().add(this.atributos.getDestreza().getBonusCP()));
        this.subatributos.setBonusCP(this.subatributos.getBonusCP().add(this.atributos.getMateria().getBonusCP()));
        this.subatributos.setBonusCP(this.subatributos.getBonusCP().add(this.atributos.getExistencia().getBonusCP()));
        this.subatributos.setBonusCP(this.subatributos.getBonusCP().add(this.atributos.getCriatividade().getBonusCP()));
        this.subatributos.setBonusCP(this.subatributos.getBonusCP().add(this.atributos.getIntelecto().getBonusCP()));
        this.subatributos.setBonusCP(this.subatributos.getBonusCP().add(this.atributos.getForca().getBonusCP()));
        //HP = Matéria
        this.subatributos.setBonusHP(this.atributos.getMateria().getBonusHP());
        //MP = Criatividade + Idéia
        this.subatributos.setBonusMP(this.atributos.getCriatividade().getBonusMP().add(this.atributos.getIdeia().getBonusMP()));
        //SP = ((15*(pontos de todos atributos-7))*7) (somar tracinhos)
        int bonusSP = 0;
        bonusSP = (this.atributos.getForca().getPontos() + this.atributos.getMateria().getPontos() + this.atributos.getDestreza().getPontos() + this.atributos.getIntelecto().getPontos() + this.atributos.getCriatividade().getPontos() + this.atributos.getIdeia().getPontos() + this.atributos.getExistencia().getPontos());
        bonusSP = (bonusSP - 7) * 105;
        bonusSP = bonusSP + this.atributos.getForca().getEvolucao().getPontosAtuais() + this.atributos.getDestreza().getEvolucao().getPontosAtuais()  + this.atributos.getMateria().getEvolucao().getPontosAtuais()  + this.atributos.getIntelecto().getEvolucao().getPontosAtuais()  + this.atributos.getCriatividade().getEvolucao().getPontosAtuais()  + this.atributos.getExistencia().getEvolucao().getPontosAtuais()  + this.atributos.getIdeia().getEvolucao().getPontosAtuais();
        this.subatributos.setBonusSP(new ValorMag(bonusSP));
        //Instinto = (Ideia + Destreza) / 2
        this.subatributos.setInstinto(this.atributos.getIdeia().getPorcentagem().add(this.atributos.getDestreza().getPorcentagem()));
        this.subatributos.setInstinto(this.subatributos.getInstinto().divide(2));
        //Movimento = (Destreza + Forca*2) /3
        this.subatributos.setMovimento(this.atributos.getForca().getPorcentagem().multiply(2));
        this.subatributos.setMovimento(this.subatributos.getMovimento().add(this.atributos.getDestreza().getPorcentagem()));
        this.subatributos.setMovimento(this.subatributos.getMovimento().divide(3));
        //Precisao = (Forca + Destreza*2) / 3
        this.subatributos.setPrecisao(this.atributos.getDestreza().getPorcentagem().multiply(2));
        this.subatributos.setPrecisao(this.atributos.getForca().getPorcentagem().add(this.subatributos.getPrecisao()));
        this.subatributos.setPrecisao(this.subatributos.getPrecisao().divide(3));
        //Raciocinio = (Intelecto + Criatividade) / 2
        this.subatributos.setRaciocinio(this.atributos.getIntelecto().getPorcentagem().add((this.atributos.getCriatividade().getPorcentagem())));
        this.subatributos.setRaciocinio(this.subatributos.getRaciocinio().divide(2));
        //Subconsciencia = (Existencia + Ideia) / 2
        this.subatributos.setSubconsciencia(this.atributos.getExistencia().getPorcentagem().add(this.atributos.getIdeia().getPorcentagem()));
        this.subatributos.setSubconsciencia(this.subatributos.getSubconsciencia().divide(2));
    }

    public void calculaKarma() {
        this.elo.setKarma(getMax(this.identidade.getEspecies().stream()
                .map (e -> e.getKarma().getMin())
                .collect(Collectors.toList())
        ));
    }

    //Mínimo entre as espécies do Ser
    public void calculaFe(){
        this.elo.setFe(getMax(this.identidade.getEspecies().stream()
            .map (e -> e.getFe().getMin())
            .collect(Collectors.toList())
        ));
    }

    //Máximo entre as espécies do Ser
    public void calculaComportamento() {
        this.elo.getComportamento().setHonra(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getComportamento().getHonra())
                .collect(Collectors.toList())
        ));
        this.elo.getComportamento().setMoral(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getComportamento().getMoral())
                .collect(Collectors.toList())
        ));
        this.elo.getComportamento().setPersonalidade(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getComportamento().getPersonalidade())
                .collect(Collectors.toList())
        ));
        this.elo.getComportamento().setApresentacao(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getComportamento().getApresentacao())
                .collect(Collectors.toList())
        ));
        this.elo.getComportamento().setPercepcao(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getComportamento().getPercepcao())
                .collect(Collectors.toList())
        ));
        this.elo.getComportamento().setConcepcao(getMax(this.identidade.getEspecies().stream()
                .map(e -> e.getComportamento().getConcepcao())
                .collect(Collectors.toList())
        ));
    }

    //Pega o maior inteiro de uma lista de inteiros
    private int getMax(List<Integer> lista){
        return lista.stream()
                .mapToInt(i -> i)
                .max()
                .getAsInt();
    }

    private int getMin(List<Integer> lista){
        return lista.stream()
                .mapToInt(i -> i)
                .min()
                .getAsInt();
    }

    //Máximo de cansaço do ser
    public void calculaCansaco() {
        List<Integer> cansacoMax = this.identidade.getEspecies().stream()
                .map(e -> e.getCansaco().getMax())
                .collect(Collectors.toList());

        this.elo.setCansacoMax(getMax(cansacoMax));
    }

    // Pega habilidades da Espécie
    public void criaListaHabilidades() {
        List<Habilidade> habilidades = new ArrayList<>();

        for(Especie esp: this.identidade.getEspecies()){
            for (Habilidade hab: esp.getHabilidades()){
                if (habilidades.stream().filter(h -> h.getId() == hab.getId()).collect(Collectors.toList()).size() == 0){
                    this.getHabilidades().add(hab);
                }
            }
        }
    }

    // Pega perícias da Classe e da Espécie
    public void criaListaPericias() {
        List<Pericia> pericias = new ArrayList<>();

        for(Classe cla: this.identidade.getClasses()){
            for (Pericia per: cla.getPericias()){
                //Só adiciona perícia se não houver nenhuma perícia com o mesmo ID
                if (pericias.stream().filter(p -> p.getId() == per.getId()).collect(Collectors.toList()).size() == 0){
                    this.getPericias().add(per);
                }
            }
        }

        for(Especie esp: this.identidade.getEspecies()){
            for (Pericia per: esp.getPericias()){
                if (pericias.stream().filter(p -> p.getId() == per.getId()).collect(Collectors.toList()).size() == 0){
                    this.getPericias().add(per);
                }
            }
        }
    }

    public void calculaEspecial() {

        List<Integer> especiais = this.identidade.getEspecies().stream()
                .map(Especie::getEspecial)
                .collect(Collectors.toList());
        this.especial = especiais.stream()
                .max(Integer::compare)
                .get();
    }

//  DeslocamentoSolo = Minimo da Especie * (FatorDex + FatorFor) / 2
//  DeslocamentoMar = (Minimo da Especie * (FatorDex + FatorFor)) / 4
//  DeslocamentoAr = (Minimo da Especie * (FatorDex + FatorFor)) / 3
//  DeslocamentoEspaco = Minimo da Especie * (FatorDex + FatorFor)
    public void calculaDeslocamentos() {
        //Cria deslocamentos do ser
        List<Deslocamento> desSer = new ArrayList<>();
        //Calcula fatorTotal = (FatorDex + FatorFor) / 2
        int especieDexMin = this.identidade.getEspecies().get(0).getAtributos().getMin().getDestreza().getPontos();
        int especieForMin = this.identidade.getEspecies().get(0).getAtributos().getMin().getForca().getPontos();
        int serDex = this.atributos.getDestreza().getPontos();
        int serFor = this.atributos.getForca().getPontos();
        double fatorTotal = ((10 * serDex / especieDexMin) + (10 * serFor / especieForMin)) / 2;

        //Cria lista de Deslocamentos baseado nas espécies
        List<Deslocamento> deslocamentosEspecie = new ArrayList<>();

        for(Especie esp: this.identidade.getEspecies() ){
            for(Deslocamento des: esp.getDeslocamentosMedios()){
                deslocamentosEspecie.add(des);
            }
        }

        //Cria listas de deslocamento especificos da espécie
        List<Deslocamento> desSolo = deslocamentosEspecie.stream()
                .filter(d -> d.getTipo() == "Solo")
                .collect(Collectors.toList());
        List<Deslocamento> desMar = deslocamentosEspecie.stream()
                .filter(d -> d.getTipo() == "Mar")
                .collect(Collectors.toList());
        List<Deslocamento> desAr = deslocamentosEspecie.stream()
                .filter(d -> d.getTipo() == "Ar")
                .collect(Collectors.toList());
        List<Deslocamento> desEspaco = deslocamentosEspecie.stream()
                .filter(d -> d.getTipo() == "Espaço")
                .collect(Collectors.toList());

        //Calcula Deslocamento de Solo
        Deslocamento solo = new Deslocamento(new ValorMag(), "Solo");
        solo.setValor(calculaMediaDeslocamentos(desSolo).multiply(new ValorMag(fatorTotal)));
        solo.setValor(solo.getValor().divide(2));
        this.deslocamentos.add(solo);
        //Calcula Deslocamento de Mar
        Deslocamento mar = new Deslocamento(new ValorMag(), "Mar");
        mar.setValor(calculaMediaDeslocamentos(desMar).multiply(new ValorMag(fatorTotal)));
        mar.setValor(mar.getValor().divide(4));
        this.deslocamentos.add(mar);
        //Calcula Deslocamento de Ar
        Deslocamento ar = new Deslocamento(new ValorMag(), "Ar");
        ar.setValor(calculaMediaDeslocamentos(desAr).multiply(new ValorMag(fatorTotal)));
        ar.setValor(ar.getValor().divide(3));
        this.deslocamentos.add(ar);
        //Calcula Deslocamento de Espaço
        Deslocamento espaco = new Deslocamento(new ValorMag(), "Espaço");
        espaco.setValor(calculaMediaDeslocamentos(desEspaco).multiply(new ValorMag(fatorTotal)));
        this.deslocamentos.add(espaco);

    }

    private ValorMag calculaMediaDeslocamentos(List<Deslocamento> deslocamentos) {
        if (deslocamentos.size() == 1){
            return deslocamentos.get(0).getValor();
        }else{
            ValorMag media = new ValorMag();
            for (Deslocamento des: deslocamentos){
                media = media.add(des.getValor());
            }
            return media.divide(deslocamentos.size());
        }
    }

    //Resposta = mínimo da espécie principal
    public void calculaResposta() {
        Resposta resposta = new Resposta();
        resposta.setBravura(this.identidade.getEspecies().get(0).getResposta().getMin().getBravura());
        resposta.setCoragem(this.identidade.getEspecies().get(0).getResposta().getMin().getCoragem());
        resposta.setDesespero(this.identidade.getEspecies().get(0).getResposta().getMin().getDesespero());
        resposta.setHeroismo(this.identidade.getEspecies().get(0).getResposta().getMin().getHeroismo());
        resposta.setIndiferenca(this.identidade.getEspecies().get(0).getResposta().getMin().getIndiferenca());
        resposta.setMedo(this.identidade.getEspecies().get(0).getResposta().getMin().getMedo());
        resposta.setPanico(this.identidade.getEspecies().get(0).getResposta().getMin().getPanico());
        this.setResposta(resposta);
    }
}