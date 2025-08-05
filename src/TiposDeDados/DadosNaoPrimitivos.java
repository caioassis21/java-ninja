package TiposDeDados;

public class DadosNaoPrimitivos {

    public static void main(String[] args) {

        /*
         * Dados nao primitivos: Strings, Arrays, Class, enum
         * Objetivo: Criar um ninja e atribuir metodos a ele
         * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase();
        System.out.println("Esse é um texto em caixa alta: " + nomeUpperCase);

        String aldeia = "Aldeia da folha";
        String aldeiaCaixaBaixa = aldeia.toLowerCase(); // Deixa tudo em caixa baixa
        System.out.println(aldeiaCaixaBaixa);

    }
}
