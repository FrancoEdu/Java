package eleventhExercise;

import java.util.Scanner;

public class Main {


    /*
        Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
        que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
        de homens.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas ?");
        int quantity = sc.nextInt();

        double[] alturas = new double[quantity];
        char[] generos = new char[quantity];

        for (int i=0; i<quantity; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            generos[i] = sc.next().charAt(0);
        }

        double menoraltura = alturas[0];
        double maioraltura = alturas[0];

        for (int i=1; i<quantity; i++) {
            if (alturas[i] > maioraltura) {
                maioraltura = alturas[i];
            }
            if (alturas[i] < menoraltura) {
                menoraltura = alturas[i];
            }
        }

        int qtdhomens = 0;
        int qtdmulheres = 0;
        double alturafemtotal = 0;
        for (int i=0; i<quantity; i++) {
            if (generos[i]=='M') {
                qtdhomens++;
            }
            else {
                qtdmulheres++;
                alturafemtotal = alturafemtotal + alturas[i];
            }
        }

        double alturafemMedia = alturafemtotal / qtdmulheres;

        System.out.printf("Menor altura = %.2f\n", menoraltura);
        System.out.printf("Maior altura = %.2f\n", maioraltura);
        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
        System.out.printf("Numero de homens = %d\n", qtdhomens);

        sc.close();
    }
}
