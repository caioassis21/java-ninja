package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
         * IF e Else - Condicoes
         * Objetivo: Passar um ninja de nivel de acordo com o numero de missoes
         * */

        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounim");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
