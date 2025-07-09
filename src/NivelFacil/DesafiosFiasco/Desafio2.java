package NivelFacil.DesafiosFiasco;


import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        // Abre scanner

        Scanner scanner = new Scanner(System.in);


        // Fazendo a Array:
        int Numero_max = 5;
        String[] ninjas = new String[Numero_max];

        int ninjascadastrados = 0;
        int opcao = 0;


        while (opcao != 3){

            // MENU

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch  (opcao){
            case 1:
                if (ninjascadastrados < Numero_max){
                    System.out.println("Digite o nome do ninja para cadastrar:");
                    String nomeNinja = scanner.nextLine();
                    ninjas[ninjascadastrados] = nomeNinja;
                    // Somando sempre 1 ninja a mais
                    ninjascadastrados ++;
                    System.out.println("Ninja cadastrado com sucesso");



                }else   {
                    System.out.println("A lista de ninjas esta cheia:");

                }
                break;

            case 2:
                    if (ninjascadastrados == 0){
                       System.out.println("Nem um ninja encontrado");
                    } else {
                        System.out.println("================= Lista de ninjas ==================");
                        for ( int i = 0; i < ninjas.length ; i++){
                            System.out.println(ninjas[i]);
                        }

                    }
                    break;
            case 3:
                System.out.println("Estamos terminado o programa... Aguarde!");
                break;


                default:
                    System.out.println("Essa opcao nao é valida");
            }



        }







    }
}
