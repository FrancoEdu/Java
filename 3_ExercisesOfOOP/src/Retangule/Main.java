package Retangule;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Retangule retangule = new Retangule();

        System.out.println("Enter rectangule width and heigth:");
        System.out.println("Width:");
        retangule.width = scanner.nextDouble();
        System.out.println("Heigth:");
        retangule.height = scanner.nextDouble();

        System.out.printf(retangule.toString());

        scanner.close();
    }
}