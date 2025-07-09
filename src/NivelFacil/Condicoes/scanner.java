package NivelFacil.Condicoes;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        /*
         *
         * scanner é o jeito que fazemos para validar os dados
         * Objetivo o usuario vai criar um ninja e vamos validar*/



        // Abrir op Scanner = a input = recebe algo
        Scanner caixaDeTexto = new Scanner(System.in);

        // Recebe o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
         String nomedoninja = caixaDeTexto.nextLine();

        System.out.println("------------------------------------");
        System.out.println(nomedoninja);
        System.out.println("O nome do ninja é: " + nomedoninja);
        System.out.println("------------------------------------");

        // Recebe a idade do ninja

        System.out.println("------------------------------------");
        System.out.println("Escreva aqui a idade do seu ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");
        System.out.println("------------------------------------");

        // Tratamento de dados

        if (idadeDoNinja >= 18) {

            System.out.println("Esse ninja é maior de idade e pode ir para missoes fora da aldeia ");

        } else {

            System.out.println("Esse ninja é muito novo, precisa treinar mais para sair da vila");
        }



        // Fechar sempre o Scanner
        caixaDeTexto.close();






    }


}
