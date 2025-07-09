package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {


        // NoArgs Constructor = Oque estamos usando é esse!
        // Exemplo puclic construtor{}
        // Um construtor que vem vazio nao necessariamente recebe argumento nenhum.

        // AllArgs Contructor
        // Um construtor que é preenchido com todos os atributos da classe


        Hokages Hashirama = new Hokages("Hashirama");
        Hashirama.nome = " Naruto 7° Hokage";
        Hashirama.idade = 45;
        Hashirama.vivoOuNao = false;


        Hokages Tobirama = new Hokages("Tobirama Senju");
        Tobirama.idade = 45;
        Tobirama.vivoOuNao = false;
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(45);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato Namikaze", 32, false );
        System.out.println(Minato.nome);


    }

    public Main() {
    }
}