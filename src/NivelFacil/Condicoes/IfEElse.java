package NivelFacil.Condicoes;

public class IfEElse {

    public static void main(String[] args) {

        /*
        * If e Else - Condiecoes
        * Objetivo da aula, passar o ninja de nivel de acordod de missoes
        */

        String rank ="";
        String nome = "Naruto";
        int idade = 20;
        boolean hokage = false;
        short numeroDemissoes = 20;

        /*
        * if (condicao) {resultado}
        * else if (conficao) {resultado}
        * else {resultado caso nada seja verdadeiro}
        * */


        // se (condicao) {faca isso}
        if (numeroDemissoes == 10 && idade > 15){
            System.out.println("Rank: Chunnin");
        } else if (numeroDemissoes >= 20){
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("Rank: Gennim");
        }


    }



}
