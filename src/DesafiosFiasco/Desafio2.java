package DesafiosFiasco;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        // Abrir Scanner

        Scanner listadehokage = new Scanner(System.in);

        String[] listadohokage =  new String[7];

        System.out.println("Qual seu nome: ");
        listadohokage[0] = listadehokage.nextLine();

        System.out.println("Qual sua idade: ");
        listadohokage[1] = listadehokage.nextLine();

        System.out.println("Qual seu cargo na vila da folha: ");
        listadohokage[2] = listadehokage.nextLine();

        System.out.println("Quantas missoes voce ja fez: ");
        listadohokage[3] = listadehokage.nextLine();

        System.out.println("Qual seu objetivo: ");
        listadohokage[4] = listadehokage.nextLine();

      // Acesso ao menu:
     // A o acessar a opcao par, o usuario consegue ver



        System.out.println("========= Lista Menu =============");

        System.out.println("Escolha a opcao desejada: ");

        System.out.println("1 - Ver lista de ninjas");
        System.out.println("2 - Ver lista de ninjas que tem mais de 10 missoes");
        System.out.println("3 - Ver lista de ninjas com menos de 10 missoes");
        System.out.println("4 - Sair" );
        System.out.println("==================================");

        switch (listadehokage.nextInt()){



            case 1: System.out.println("Lista de ninjas");
                System.out.println(listadohokage[0]);
                if (listadohokage[3].equals("10")){
                    System.out.println(listadohokage[3]);
                    }
             break ;


            case 2: System.out.println("Lista de ninjas que tem mais de 10 missoes");
                System.out.println(listadohokage[3]);
            break;






            }

        listadehokage.close();


        }
}
