package fifthExercise;

import java.util.Scanner;

public class Main {

    /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).
    */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qauntos numeros você vai digitar?");
        int quantity = sc.nextInt();
        int[] numbers = new int[quantity];
        int maiorValor = 0;
        int position = 0;

        for(int i = 0; i < numbers.length; i++){
            System.out.print("Digite um numero:");
            numbers[i] = sc.nextInt();
            if (numbers[i] > maiorValor){
                maiorValor = numbers[i];
                position = i;
            }
        }

        System.out.println("Maior valor: " + maiorValor + "\nPosicao o maior valor: " + position + 1);
    }
}
