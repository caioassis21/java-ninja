package Desafios;

public class Desafio1 {

    public static void main(String[] args) {

        // ninja 1
        String nomeNinja01 = "Sasuke Uchiha";
        int idadeNinja01 = 16;
        String missaoNinja01 = "Ir atras do Orochimaru";
        String nivelMissaoNinja01 = "S";
        String statusConclusaoNinja01 = "Em andamento";

        if (idadeNinja01 < 15) {
            if (nivelMissaoNinja01.equals("C") || nivelMissaoNinja01.equals("D")) {
                statusConclusaoNinja01 = "Concluido";
            } else {
                statusConclusaoNinja01 = "Nao concluido";
            }
        } else {
            statusConclusaoNinja01 = "Concluido";
        }

        // ninja 2;
        String nomeNinja02 = "Konohamaru Sarutobi";
        int idadeNinja02 = 12;
        String missaoNinja02 = "Ir atras do Gato do senhor feldal";
        String nivelMissaoNinja02 = "D";
        String statusConclusaoNinja02 = "Em andamento";

        if (idadeNinja02 < 15) {
            if (nivelMissaoNinja02.equals("C") || nivelMissaoNinja02.equals("D")) {
                statusConclusaoNinja02 = "Concluido";
            } else {
                statusConclusaoNinja02 = "Nao concluido";
            }
        } else {
            statusConclusaoNinja02 = "Concluido";
        }

        // ninja 3
        String nomeNinja03 = "Rock Lee";
        int idadeNinja03 = 15;
        String missaoNinja03 = "Proteger o construtor da ponte";
        String nivelMissaoNinja03 = "A";
        String statusConclusaoNinja03 = "Em andamento";

        if (idadeNinja03 < 15) {
            if (nivelMissaoNinja03.equals("C") || nivelMissaoNinja03.equals("D")) {
                statusConclusaoNinja03 = "Concluido";
            } else {
                statusConclusaoNinja03 = "Nao concluido";
            }
        } else {
            statusConclusaoNinja03 = "Concluido";
        }


        System.out.println("============ Resultado das missoes: ==============");

        System.out.println("Nome do ninja: " + nomeNinja01);
        System.out.println("Idade do ninja: " + idadeNinja01);
        System.out.println("Missao: " + missaoNinja01);
        System.out.println("Nivel da missao: " + nivelMissaoNinja01);
        System.out.println("Status da missao: " + statusConclusaoNinja01);


        System.out.println("\nNome do ninja: " + nomeNinja02);
        System.out.println("Idade do ninja: " + idadeNinja02);
        System.out.println("Missao: " + missaoNinja02);
        System.out.println("Nivel da missao: " + nivelMissaoNinja02);
        System.out.println("Status da missao: " + statusConclusaoNinja02);

        System.out.println("\nNome do ninja: " + nomeNinja03);
        System.out.println("Idade do ninja: " + idadeNinja03);
        System.out.println("Missao: " + missaoNinja03);
        System.out.println("Nivel da missao: " + nivelMissaoNinja03);
        System.out.println("Status da missao: " + statusConclusaoNinja03);

    }
}
