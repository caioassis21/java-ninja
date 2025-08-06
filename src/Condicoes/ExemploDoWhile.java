package Condicoes;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        char resposta;
        do {
            System.out.print("Digite a temperatura em celsius: ");
            double temperaturaCelsius = sc.nextDouble();

            double fahrenheit = ((9 * temperaturaCelsius) / 5) + 32;
            System.out.printf("Equivalente em fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir(s/n)? ");
            resposta = sc.next().charAt(0);
        } while (resposta != 'n');

    }
}
