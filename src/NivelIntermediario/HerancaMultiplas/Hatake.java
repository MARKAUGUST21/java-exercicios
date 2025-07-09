package NivelIntermediario.HerancaMultiplas;


// Dentro de uma sub classe, eu consigo colocar mais de uma interface


public class Hatake extends Ninjas implements Sharingan, AnbuInterface{

    public void Time7(){
        System.out.println(nome +": Sou da Anbu");
    }

    // Metodo da interface
    public void SharinganAtivado(){
        System.out.println(nome + ": Ativou o Sharingan");
    }


    public void ninjaDeElite() {
        System.out.println( "Todos os ninjas que ja passaram pela Anbu, são ninjas de Elite, e eu: " + nome + " Sou um ninja de elite!");

    }
}
