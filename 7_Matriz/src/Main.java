import java.util.Scanner;

public class Main {
    /*
        Fazer um programa para ler um número inteiro N e uma matriz de
        ordem N contendo números inteiros. Em seguida, mostrar a diagonal
        principal e a quantidade de valores negativos da matriz.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual será a ordem de sua matriz ?");
        int ordem = sc.nextInt();

        int[][] mat = new int[ordem][ordem];

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.println("Numero da " + i + " Linha e " + j + " Coluna");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Digonal: ");
        for (int i = 0; i < mat.length; i++){
            System.out.print(" " + mat[i][i]);
        }

        int negativeNumbers =0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat[i][j] < 0){
                    negativeNumbers++;
                }
            }
        }
        System.out.println("Negative numbers = " + negativeNumbers);
    }
}