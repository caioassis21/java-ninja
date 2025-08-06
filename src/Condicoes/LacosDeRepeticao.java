package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
         * Lacos de repeticao: Vao repetir infinitamente ou ate voce atingir a condicao desejada.
         * while = for
         * */

        // while
        // while (condicao) { tudo aqui vai acontecer }

        int numeroDeClones = 1;
        int numeroMaximoDeClones = 40;

//        while (numeroDeClones <= 40) {
//            System.out.println("O Naruto fez " + numeroDeClones + " clone");
//            numeroDeClones = numeroDeClones +1;
//        }

        // for

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Sasuke fez " + i + " clones");
        }


    }
}
