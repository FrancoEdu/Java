package SixthExercise;

import java.util.Scanner;

public class Main {
    /*
        Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int quantity = sc.nextInt();

        int[] vetorA = new int[quantity];
        int[] vetorB = new int[quantity];
        int[] vetorC = new int[quantity];

        System.out.println("Digite os valores de A:");
        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os valores de B:");
        for(int i = 0; i < vetorB.length; i++){
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < vetorC.length; i++){
            System.out.println(vetorC[i] = vetorA[i] + vetorB[i]);
        }
    }
}
