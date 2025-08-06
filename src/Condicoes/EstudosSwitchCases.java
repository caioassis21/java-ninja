package Condicoes;

import java.util.Scanner;

public class EstudosSwitchCases {
    public static void main(String[] args) {

        /*
         * Switches Cases - Servem para gerar casos especificos
         * Objetivo: Pedir para os usuarios escolherem entre os ninjas
         * switch cases
         * */

        // Pedir para o usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um persoanagem:");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Voce escolheu o ninja Naruto Uzumaki");
                break;

            case 2:
                System.out.println("Voce escolheu o ninja Sasuke Uchiha");
                break;

            case 3:
                System.out.println("Voce escolheu a ninja Sakura Haruno");
                break;

            default:
                System.out.println("Opção inválida. Escolha um numero entre 1 e 3");
                break;
        }


    }
}
