package tenthExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serao digitados ?");
        int quantity = sc.nextInt();

        double[] nota1 = new double[quantity];
        double[] nota2 = new double[quantity];
        String[] nome = new String[quantity];
        double[] somaNotas = new double[quantity];
        double somaNotaGeral = 0;

        for (int x = 0; x < quantity; x++){
            System.out.println("Digite nome, primeira e segunad nota do " + x + " aluno");
            System.out.print("Nome:");
            nome[x] = sc.next();
            System.out.print("Primeira nota: ");
            nota1[x] = sc.nextDouble();
            System.out.print("Segunda nota: ");
            nota2[x] = sc.nextDouble();
            somaNotas[x] = nota1[x] + nota2[x];
            somaNotaGeral = somaNotaGeral + somaNotas[x];
        }
        System.out.println("Alunos aprovados:");

        for (int x=0; x<quantity;x++){
            if (somaNotas[x]/2 >= 6){
                System.out.println(nome[x]);
            }
        }
    }
}
