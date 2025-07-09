package NivelIntermediario.Enums;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Metodos abstratos
    public abstract void nomeDoNinja();


    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai");
    }

}
