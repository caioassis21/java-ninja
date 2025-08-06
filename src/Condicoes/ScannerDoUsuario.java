package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        /*
         * Scanner = É um jeito de trazer o usuario para dentro da aplicacao.
         * Objetivo: O usuario vai criar um ninja e vamos validar os dados.
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do ninja: ");
        String nomeDoNinja = sc.nextLine();

        System.out.print("Digite a idade do ninja: ");
        int idade = sc.nextInt();

        System.out.println("O nome do ninja é " + nomeDoNinja + " e ele(a) tem " + idade + " anos.");

        // Tratamento de dados
        if (idade >= 18) {
            System.out.println("Esse ninja é maior de idade. Ele já pode ir para missoes fora da vila.");
        } else {
            System.out.println("Esse ninja é muito novo ainda. Ele precisa treinar mais antes de sair da " +
                    "vila");
        }

    }
}
