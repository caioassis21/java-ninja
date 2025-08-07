package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int NUMERO_MAXIMO = 10;
        String[] ninjas = new String[NUMERO_MAXIMO];

        int ninjasCadastrados = 0;
        int opcoes = 0;

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcoes = sc.nextInt();

            switch (opcoes) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAXIMO) {
                        System.out.print("Digite o nome do ninja: ");
                        sc.nextLine();
                        String nomeNinja = sc.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados = ninjasCadastrados + 1;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninjas está cheia. Impossibel cadastrar novo ninja");
                    }

                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("----------- Lista de ninjas: ------------");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }

                    break;

                case 3:
                    System.out.println("Estamos terminando o programa... Aguarde");
                    break;

                default:
                    System.out.println("Opção inválida. Escolha entre as opções (1, 2, 3)");

            }
        } while (opcoes != 3);


    }
}
