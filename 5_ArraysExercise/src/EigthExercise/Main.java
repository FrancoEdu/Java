package EigthExercise;

import java.util.Scanner;

public class Main {
    /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elemntos vai ter o vetor ?");
        int quantity = sc.nextInt();

        int[] vetorDeNumeros = new int[quantity];
        int total = 0;
        int totalDePares = 0;

        for(int i = 0;i < vetorDeNumeros.length;i++){
            System.out.println("Digite um numero: ");
            vetorDeNumeros[i] = sc.nextInt();
            if (vetorDeNumeros[i] % 2 == 0){
                total = total + vetorDeNumeros[i];
                totalDePares++;
            }
        }

        if (totalDePares > 0){
            System.out.println("Media dos pares = " + total/totalDePares);
        }
        else{
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}
