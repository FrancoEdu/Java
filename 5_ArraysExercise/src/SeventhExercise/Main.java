package SeventhExercise;

import java.util.Scanner;

public class Main {
    /*
        Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elemntos vai ter o vetor ?");
        int quantity = sc.nextInt();

        double somaVetor = 0;

        double[] number = new double[quantity];

        for (int i = 0; i < number.length; i++){
            System.out.println("Digite um numero: ");
            number[i] = sc.nextDouble();
            somaVetor = somaVetor + number[i];
        }

        System.out.println("Media do vetor = " + somaVetor/quantity);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA : ");
        for (int i = 0; i < number.length; i++){
            if (number[i] < somaVetor/quantity){
                System.out.println(number[i]);
            }
        }
    }
}
