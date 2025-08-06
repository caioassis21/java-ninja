package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class DesafioAtletas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double maiorAtura = 0;
        double totalPeso = 0;
        int totalHomens = 0;
        int totalMulheres = 0;
        double somaAturaMulheres = 0;

        String atletaMaisAlto = "";

        System.out.print("Qual a quantidade de atletas? ");
        int quantidadeDeAtletas = sc.nextInt();


        for (int i = 1; i <= quantidadeDeAtletas; i++) {
            System.out.println("Digite os dados do atleta numero " + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Sexo: ");
            String sexo = sc.next();
            while (!sexo.equals("M") && !sexo.equals("m") && !sexo.equals("F") && !sexo.equals("f")) {
                System.out.print("Valor invalido! Favor digitar F ou M: ");
                sexo = sc.next();
            }

            if (sexo.equals("M") || sexo.equals("m")) {
                totalHomens = totalHomens + 1;
            } else {
                totalMulheres = totalMulheres + 1;
            }
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                altura = sc.nextDouble();
            }

            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor invalido! Favor digitar um valor positivo: ");
                peso = sc.nextDouble();
            }

            totalPeso = totalPeso + peso;


            if (sexo.equals("f") || sexo.equals("F")) {
                somaAturaMulheres = somaAturaMulheres + altura;
            }


            if (altura >= maiorAtura) {
                atletaMaisAlto = nome;
                maiorAtura = altura;
            }

        }

        double pesoMedioAtletas = totalPeso / quantidadeDeAtletas;
        double porcentagemDeHomens = (double) totalHomens / quantidadeDeAtletas * 100;

        System.out.println("\nRELATÓRIO:");
        System.out.printf("Peso medio dos atletas: %.2f%n", pesoMedioAtletas);
        System.out.printf("Atleta mais alto: %s%n", atletaMaisAlto);
        System.out.printf("Porcentagem dos homens: %.1f%%%n", porcentagemDeHomens);
        if (totalMulheres > 0) {
            double alturaMediaMulheres = somaAturaMulheres / totalMulheres;
            System.out.printf("Altura media das mulheres: %.2f%n", alturaMediaMulheres);
        } else {
            System.out.println("Não há mulheres cadastradas");
        }

        sc.close();

    }
}
