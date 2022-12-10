package firstExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar ?");
        int quantity = sc.nextInt();
        int[] vect = new int[quantity];
        if (vect.length < 10){
            for (int i=0; i<vect.length; i++ ){
                System.out.println("Digite o " + i + "º numero: ");
                vect[i] = sc.nextInt();
            }

            System.out.println("Numeros negativos: ");
            for (int i=0; i<vect.length; i++ ){
                if (vect[i] < 0){
                    System.out.println(vect[i]);
                }
            }
        }
        else {
            System.out.println("Por favor, digite uma quantidade até 10");
        }

        sc.close();
    }
}