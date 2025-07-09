package NivelFacil;

public class memoriaearray {
    public static void main(String[] args) {
        // qual diferenca de array para lista
        // o array semrpe pre definido
        String[] ninjas = new String[6];
        ninjas[0] = "Narutin";
        ninjas[1] = "Sasukeee";
        ninjas[2] = "Sarada";
        ninjas[3] = "Itachi";
        ninjas[4] = "Jiraya";
        System.out.println(ninjas[4]);

        // for (int i = 0; i < 5 ; i++) {
            // System.out.println(ninjas[i]);

        // }

        // redeclarar a array

        ninjas = new String[7];
        ninjas[0] = "Primeiro Hokage";
        ninjas[1] = "Segundo Hokage";
        ninjas[2] = "Terceiro Hokage";
        ninjas[3] = "Quarto Hokage";
        ninjas[4] = "Quinto Hokage";
        ninjas[5] = "Sexto Hokage";
        ninjas[6] = "Setimo Hokage";
        System.out.println(ninjas[2]);

        for (int i = 0; i < 7 ; i++) {
            System.out.println(ninjas[i]);
        }

        // Array idade
        // O int se ele nao tiver nem uma memoria ele ira inicia como 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);

        // Array verdadeiro ou falso
        // Booleab se nao tiver nada dentro da memoria, ele lhe trara o valor de false
        boolean[] verdadeiro = new boolean[1];
        verdadeiro[0] = true;
        System.out.println(verdadeiro[0]);

        // Double se nao tiver nada na memoria dele, ele trara 0.0
        double[] fluatuante = new double[2];
        fluatuante[0] = 1.2;
        System.out.println(fluatuante[0]);





        //




        //




    }
}
