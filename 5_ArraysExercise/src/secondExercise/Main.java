package secondExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros voce vai digitar? ");
        int quantity = sc.nextInt();
        double[] numReais = new double[quantity];
        double soma = 0;

        for (int i = 0; i < numReais.length; i++){
            System.out.println("Digite o " + i + "º numero: ");
            numReais[i] = sc.nextDouble();
            soma = soma + numReais[i];
        }
        System.out.println("Valores = ");
        for (int i =0; i < numReais.length; i++){
            System.out.print(numReais[i] + "");
        }

        System.out.println("\nSOMA = " + soma +
                "\nMedia = " + soma/ numReais.length);
        sc.close();
    }
}