package Tiposdedados;

import java.lang.reflect.Array;

public class Dadosnaoprimitivos {
    public static void main(String[] args) { // sempre precisa declarar essa porra psvm = nao esquece de declarar
                                            // tudo que eu colocar aqui dentro sera declarado
        /*
             * Dados nao primitivos; String, Array, Class, enum.

                 */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();// ToUppercase vai colocar tudo em CAPSLOCK
        System.out.println("Meu nome é: " + nomeUpperCase);

        String aldeia = " ALDEIA DA Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // tudo que eu colocar aqui ficara coma minusculo
        System.out.println("Tudo aqui ficara minusculo: " + aldeiaLowerCase);



    }
}
