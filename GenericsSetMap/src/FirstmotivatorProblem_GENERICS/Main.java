package FirstmotivatorProblem_GENERICS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintService<Integer> printService = new PrintService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many values? ");
        int quantity = scanner.nextInt();

        for (int x = 0; x < quantity; x++){
            int value = scanner.nextInt();
            printService.addValue(value);
        }

        printService.print();
        System.out.println();
        System.out.println("First: " + printService.fist());
    }
}