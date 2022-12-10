import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas Linhas tera sua matriz: ");
        int lines = sc.nextInt();
        System.out.println("Quantas Colunas tera sua matriz: ");
        int columns = sc.nextInt();

        int[][] mat = new int[lines][columns];


        for(int l = 0; l < lines; l++){
            for(int c = 0; c < columns; c++){
                System.out.println("Digite o valor da posição "+l+","+c);
                mat[l][c] = sc.nextInt();
            }
        }

        System.out.println("Digite um numero presente na matriz: ");
        int number = sc.nextInt();

        for(int l = 0; l < lines; l++){
            for(int c = 0; c < columns; c++){
                if (mat[l][c] == number){
                    System.out.println("Position : " + l + "," + c);
                    if (l > 0)
                        System.out.println("Up: " + mat[l-1][c]);
                    if (l < mat[l].length){
                        System.out.println("Down: " + mat[l+1][c]);
                    }
                    if(c>0){
                        System.out.println("Left: " + mat[l][c-1]);
                    }
                    if (c<mat[c].length){
                        System.out.println("Right: " + mat[l][c+1]);
                    }
                }
            }
        }
    }
}