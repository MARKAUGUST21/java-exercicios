package NivelIntermediario.Construtores;

public class Hokages {

    // CRTL + INSERT = ACESSO AS CONSTRUTORES
    String nome;
    boolean vivoOuNao;
    int idade;
    double altura;
    double saldoBancario;


    public Hokages(String nome){
        this.nome = nome;
    }
    public Hokages (int idade){
        this.idade = idade;
    }

    // All args construtors
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;

    }


}
