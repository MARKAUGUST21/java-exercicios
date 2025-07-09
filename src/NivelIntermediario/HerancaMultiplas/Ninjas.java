package NivelIntermediario.HerancaMultiplas;

public class Ninjas {

    //TODO: Incluir dois novos atributos, numero de missoes e Rank
    // TODO: RANK , GENNIN, CHUNIN, JOUNIN, HOKAGE

    String nome;
    String aldeia;
    int idade;
    String habilidade;
    NivelNinja rank;

    public Ninjas(){
    }
    public Ninjas(String nome, String aldeia, int idade, String habilidade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.habilidade = habilidade;
    }

}
