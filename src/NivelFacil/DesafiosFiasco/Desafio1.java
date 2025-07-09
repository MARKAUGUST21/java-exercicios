package NivelFacil.DesafiosFiasco;

public class Desafio1 {
    public static void main(String[] args) {
        // Crie um programa que represente tres ninjas da vila da folha de naruto, e suas respectivas missoes
        // Cada ninja tem um nome, uma idade  e uma missao atribuidada a ele, com o nome da missao, nivel da dificuldade e status da conclusao

        // Ninja 1

        String nomeNinja1 = "Naruto Uzumaki";
        String missao = "Encontrar o inimigo";
        int idade = 16;
        String statusDamissao = "Em andamento";
        char nivelDaMissao = 'A';

        // Verificar nivel da missao e idade do ninja
        if (idade < 15){
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDamissao = "Concluido";
            }else {
                statusDamissao = "Nao concluida";
            }

        }else {
            statusDamissao ="Concluida";

        }

        System.out.println("--------------------------------------------");

        System.out.println("Nome do ninja : " + nomeNinja1);
        System.out.println("Idade do ninja : " + idade);
        System.out.println("Missao do ninja : " + missao);
        System.out.println("Status da missao  : " + statusDamissao);
        System.out.println("Nivel da missao  : " + nivelDaMissao);

        System.out.println("--------------------------------------------");



        // Ninja 2

        String nomeNinja2 = "Sasuke Uchila";
        String missao2 = "Reconhecimento de terreno";
        int idade2 = 16;
        String statusDamissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        // Verificar nivel da missao e idade do ninja
        if (idade2 < 15){
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDamissao2 = "Concluido";
            }else {
                statusDamissao2 = "Nao concluida";
            }

        }else {
            statusDamissao2 ="Concluida";

        }


        System.out.println("--------------------------------------------");

        System.out.println("Nome do ninja : " + nomeNinja2);
        System.out.println("Idade do ninja : " + idade2);
        System.out.println("Missao do ninja : " + missao2);
        System.out.println("Status da missao  : " + statusDamissao2);
        System.out.println("Nivel da missao  : " + nivelDaMissao2);

        System.out.println("--------------------------------------------");

        // Ninja 3

        String nomeNinja3 = "Sakura Haruno";
        String missao3 = "Curar feridos da guerra";
        int idade3 = 16;
        String statusDamissao3 = "Em andamento";
        char nivelDaMissao3 = 'D';

        // Verificar nivel da missao e idade do ninja
        if (idade3 < 15){
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D'){
                statusDamissao3= "Concluido";
            }else {
                statusDamissao3 = "Nao concluida";
            }

        }else {
            statusDamissao3 ="Concluida";

        }












        System.out.println("--------------------------------------------");

        System.out.println("Nome do ninja : " + nomeNinja3);
        System.out.println("Idade do ninja : " + idade3);
        System.out.println("Missao do ninja : " + missao3);
        System.out.println("Status da missao  : " + statusDamissao3);
        System.out.println("Nivel da missao  : " + nivelDaMissao3);

        System.out.println("--------------------------------------------");






    }
}
