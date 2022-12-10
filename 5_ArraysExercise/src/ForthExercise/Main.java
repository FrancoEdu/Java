package ForthExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantityPar = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        int quantity = sc.nextInt();

        int[] numeros = new int[quantity];

        for (int i = 0; i < quantity; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros pares: ");
        for (int i = 0; i < quantity; i++){
            if(numeros[i] % 2 ==0) {
                quantityPar++;
                System.out.print(numeros[i] + "  ");
            }
        }

        System.out.print("\nQuantidade de pares: " + quantityPar);

        sc.close();
    }
}
