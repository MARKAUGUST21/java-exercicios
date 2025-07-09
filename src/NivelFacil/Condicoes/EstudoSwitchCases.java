package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        /*
        *SwitchCases: serve para gerar casos especificos
        * Objetivo: Pedir ao usario escolher entre os Ninjas
        **/

        // Pedir para o usario

        Scanner scanner = new Scanner(System.in);


        // Mostrar as opcoes para o usuario:

        System.out.println(" Escolha o personagem: ");
        System.out.println(" 1 - Naruto");
        System.out.println(" 2 - Sasuke");
        System.out.println(" 3 - Sakura");

        // Pedir para o usaurio escolher uma opcao
        int escolhaUs= scanner.nextInt();

        System.out.println("Voce digitou o numero: " + escolhaUs);

        // Reacao ao escolher um personagem

        switch (escolhaUs){
            case 1:
                System.out.println("O usuario escolheu o Naruto ");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke");
                break;
            case 3:
                System.out.println("O usuario escolheu  a 1Sakura");
            default:
                System.out.println("Voce nao digitou uma resposta valida! ");


        }



        //Fechar minha caixa
        scanner.close();
    }
}
