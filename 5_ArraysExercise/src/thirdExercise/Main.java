package thirdExercise;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Quantas pessoas serão medidas?");
            int quantity = sc.nextInt();
            double somaAltura = 0;
            int menoresDeDezesseis = 0;

            String[] nome = new String[quantity];
            int[] idade = new int[quantity];
            double[] altura = new double[quantity];

            for (int i = 0; i < quantity; i++){
                System.out.println("Dados da "+ i + "ª pessoa:");
                System.out.println("Nome:");
                nome[i] = sc.next();
                System.out.println("Idade:");
                idade[i] = sc.nextInt();
                System.out.println("Altura:");
                altura[i] = sc.nextDouble();
                somaAltura = somaAltura + altura[i];

                if (idade[i]<16){
                    menoresDeDezesseis++;
                }
            }

            System.out.print("A altura media eh:" + somaAltura/quantity);
            System.out.print("\nPessoas com menos de 16 anos: " + (menoresDeDezesseis*100)/quantity + "%\n");

            for (int i = 0; i < quantity; i++){
                if (idade[i]<16){
                    System.out.print(nome[i] + "\n");
                }
            }

            sc.close();
        }
}
