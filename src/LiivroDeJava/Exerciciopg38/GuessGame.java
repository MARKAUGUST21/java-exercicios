package LiivroDeJava.Exerciciopg38;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void starGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10 );

        System.out.println("Estou pensando em numero de 0 a 9 ! ");



    }




}
