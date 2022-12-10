package NinethExercise;

import java.util.Scanner;

public class Main {
    /*
        Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha.
     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elemntos vai ter o vetor ?");
        int quantity = sc.nextInt();

        String[] vetorDeNomes = new String[quantity];
        int[] idade = new int[quantity];

        for(int x=0; x< quantity;x++){
            System.out.printf("Dados da %da pessoa:\n", x + 1);
            System.out.println("Nome:");
            vetorDeNomes[x] = sc.next();
            System.out.println("Idade:");
            idade[x] = sc.nextInt();
        }

        int maiorIdade = idade[0];
        int posicaoMaior = 0;

        for (int x = 1; x < quantity; x++){
            if (idade[x] > maiorIdade){
                maiorIdade = idade[x];
                posicaoMaior++;
            }
        }

        System.out.println("Pessoa mais velha: " + vetorDeNomes[posicaoMaior]);
    }
}
