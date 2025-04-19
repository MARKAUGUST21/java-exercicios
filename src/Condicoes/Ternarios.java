package Condicoes;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {


        /*
        *Ternarios sao maneiras de minimizar o seu codigo
        * Variavel  = condicao ? valorSeVerdadeiro: valorSeFalso;
        * */


        short numerodemissoes = 11;
        String nivel = (numerodemissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes ";
        System.out.println(nivel);

    }
}
